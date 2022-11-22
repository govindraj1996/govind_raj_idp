package Java.Polymorphism.Constructor_Overloading;

public class Constructor_Overloading
    {
       Constructor_Overloading()
        {
            System.out.println("0-arg constructor");
        }
        Constructor_Overloading(int i)
        {
            System.out.println("int argument constructor");
        }
        Constructor_Overloading(char ch,int i)
        {
            System.out.println(ch+"-----"+i);
        }
        public static void main(String[] args)
        {
            Constructor_Overloading t1=new Constructor_Overloading();
            Constructor_Overloading t2=new Constructor_Overloading(10);
            Constructor_Overloading t3=new Constructor_Overloading('a',100);
        }
}
