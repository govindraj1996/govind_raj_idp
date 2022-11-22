package Java.Polymorphism.Method_Overloading;

public class Method_Overloading
{

    void m1(char ch)
    {
        System.out.println(" char-arg constructor ");
    }
    void m1(int i)
    {
        System.out.println("int-arg constructor ");
    }
    void m1(double i,int j)
    {
        System.out.println(i+"------"+j);
    }
    public static void main(String[] args) {
        Method_Overloading t = new Method_Overloading();
        t.m1('a');
        t.m1(10);
        t.m1(10.1, 20);
    }

}
