// Overriding Methods Starter         A+CR
public class Main 
{
  public static void main(String[] args) 
  {
     Warrior w1 = new Warrior("Jon Snow");
     Wizard w2 = new Wizard("Harry Potter");
     GameCharacter c1 = new GameCharacter("SomeRandomGuy");
     
     System.out.println(w1);
     System.out.println(w2);
     System.out.println(c1);

     w1.setBlock(true);
     System.out.println(w1);
     System.out.println(w1.attack(c1));

     w2.getSpell();
     System.out.println(w2.attack(c1));
  }
}