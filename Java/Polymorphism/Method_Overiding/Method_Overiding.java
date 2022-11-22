package Java.Polymorphism.Method_Overiding;

import Java.Interface.Main;

public class Method_Overiding
{

    void property()
    {
        System.out.println("money+land+house");
    }
    //  Overridden method
    void marry()
    {
        System.out.println("black girl");
    } }
class Child extends Method_Overiding {
    //  overriding method
    void marry() {
        System.out.println("white girl/red girl");
    }

    public static void main(String[] args) {
        Method_Overiding p=new Method_Overiding();
        p.property();
        p.marry();

        System.out.println();
        Child c = new Child();
        c.property();
        c.marry();

    }
}
