package Java.Inheritance.Single_Inheritance;

public class Single_Inheritance
{
    int P=1000000;

    void Parent()
    {
        System.out.println("Parent="+P);
    }
}

class child extends Single_Inheritance
{
    int C=100000;

    void Child()
    {
        System.out.println("Child="+C);
    }

    public static void main(String[] args)
    {
        System.out.println("-----------Parent Class--------------");
        Single_Inheritance p1=new Single_Inheritance();
        p1.Parent();

        System.out.println("-----------Child Class--------------");
        child c1=new child();
        c1.Child();
        c1.Parent();
    }
}
