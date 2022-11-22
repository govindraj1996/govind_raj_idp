package Java.Interface;

public class Main
{
    public static void main(String[] args)
    {
        Pig pig=new Pig();
        pig.animalSound();
        pig.sleep();
        System.out.println();
        Lion lion=new Lion();
        lion.animalSound();
        lion.sleep();
    }
}
