package Java.Interface;

public class Lion implements Interface
{

    @Override
    public void animalSound()
    {
        System.out.println("The lion roars");
    }

    @Override
    public void sleep()
    {
        System.out.println("Zzz");
    }
}
