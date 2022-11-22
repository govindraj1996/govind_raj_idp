package Java.Interface;

public class Pig implements Interface{
    @Override
    public void animalSound()
    {
        System.out.println("The pig says: wee wee");
    }

    @Override
    public void sleep()
    {
        System.out.println("Zzz");
    }
}
