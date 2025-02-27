public class Wizard extends GameCharacter
{
   private String[] spellList;

   public Wizard(String n)
   {
      super(n);
      super.setDef(12);
      super.setHealth(10);
      String[] temp = {"Firebolt", "Armor", "Invisibility", "Charm"};
      spellList = temp;
   }

   public void getSpell(){
      System.out.print("The spells in " + super.getName() + "'s spell list are ");
      for(int i = 0; i < spellList.length; i ++) {
         System.out.print(spellList[i] + ", ");
      }
      System.out.println();
   }

   @Override public String attack(GameCharacter opponent) {
      String output = "";
      output += super.getName() + " attacks " + opponent.getName();
      int spellNum = (int)(Math.random() * 4);
      String spell = spellList[spellNum];
      output += " with " + spell + " spell - ";
      if (spell.equals("Firebolt")){
         int num = (int)(Math.random() * 10) + 1;
         if(num > 4)
            output += "but misses.";
         else
            output += "Hits for 20 damage";
         return output;
      }
      else if (spell.equals("Armor")) {
         super.setDef(super.getDef()+ 10);
         output += "Raises " + super.getName() + "'s defence by 20";
         return output;
      }
      else if (spell.equals("Invisibility")) {
         output += super.getName() + " vanishes";
         return output;
      }
      else {
         int numC = (int)(Math.random() * 10) + 1;
         if(numC > 1)
            output += "but misses.";
         else
            output += opponent.getName() + " surrenders";
         return output;
      }
   }
}