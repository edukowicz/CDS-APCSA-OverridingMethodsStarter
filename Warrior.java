public class Warrior extends GameCharacter
{
   private boolean isBlocking;
   private int damageBonus;

   public Warrior(String n)
   {
      super(n);
      super.setDef(15);
      super.setHealth(20);
      isBlocking = false;
      damageBonus = 8;
   }

   public void setBlock(boolean b) {
      if(b == true) {
         isBlocking = true;
         damageBonus = 3;
         super.setDef(super.getDef() + 10);
      }
      else {
         isBlocking = false;
         damageBonus = 8;
      }
   }

   @Override public String attack(GameCharacter opponent) {
      String output = "";
      output += super.getName() + " attacks " + opponent.getName();
      output += " with sword - ";
      int num = (int)(Math.random() *20) + 1;
      if(opponent.getDef() > num)
         output += "but misses.";
      else
         output += "Hits for " + (5 + damageBonus) + " damage";
      return output;
   }

   @Override public String toString() {
      return super.toString() + "Is blocking: " + isBlocking + "\n";
   } 
}