package Java.Abstraction;

public abstract class Abstraction
{
    // Abstract method (does not have a body)
    public abstract void animalSound();
    // Regular method
    public void sleep()
    {
        System.out.println("Zzz");
    }
}

// Subclass (inherit from Base class)
class Pig extends Abstraction {
    public void animalSound() {

        System.out.println("The pig says: wee wee");
    }
}
// Subclass (inherit from Base class)
class Lion extends Abstraction
{
    @Override
    public void animalSound()
    {
        System.out.println("The lion roars");
    }
}

class Main {
    public static void main(String[] args)
    {
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();

        Lion lion=new Lion();
        lion.animalSound();
        lion.sleep();
    }
}
