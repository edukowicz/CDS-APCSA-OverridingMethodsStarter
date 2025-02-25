public class GameCharacter
{
   private String name;
   private int health;
   private int defense;

   public GameCharacter(String n)
   {
      name = n;
      health = 6;
      defense = 10;
   }

   public void setHealth(int val)
   {
      health = val;
   }

   public void setDef(int val)
   {
      defense = val;
   }

   public int getDef()
   {
      return defense;
   }

   public String getName()
   {
      return name;
   }


   public String attack(GameCharacter opponent)
   {
      String output = "";
      output += name + " attacks " + opponent.getName();
      output += " with knife - ";
      int num = (int)(Math.random() *20) + 1;
      if(opponent.getDef() > num)
         output += "but misses.";
      else
         output += "Hits for 5 damage";
      return output;
   }

   public String toString()
   {
      String output = "Name: " + name;
      output += "\nHealth: " + health + "\tDef: " + defense;
      output += "\n";
      return output;
   }
}