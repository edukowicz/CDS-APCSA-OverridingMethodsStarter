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
}