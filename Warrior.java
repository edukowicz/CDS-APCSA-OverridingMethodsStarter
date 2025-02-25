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
}