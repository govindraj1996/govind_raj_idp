package Java.Variables;

public class Variables
{
    public String instance; // This is instance variable
    public void instance()
    {
        this.instance="Zemoso";
        System.out.println("The output is = "+instance);
    }

    static String name="Arun"; // This is static variable

    public static void main(String[] args) {
        int lv=25;
        System.out.println("Local Variable");
        System.out.println("The value of Local variable = "+lv);
        System.out.println();

        System.out.println("Instance Variable");
        Variables variables=new Variables();
        variables.instance();

        System.out.println();
        System.out.println("Static Variabls");
        System.out.println("The name is "+name);

    }

}
