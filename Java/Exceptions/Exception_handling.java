package Java.Exceptions;

public class Exception_handling
{
    public static void main(String[] args) {

        int a[]=new int[5];
        String s=null;

        try
    {
        System.out.println(50/0);
        System.out.println(a[10]);
        System.out.println(s.length());
    }
        catch(ArithmeticException e)
    {
        System.out.println("Arithmetic Exception occurs");
    }
        catch (NullPointerException e)
        {
            System.out.println("Null pointer Exception occurs");
        }
        catch(ArrayIndexOutOfBoundsException e)
    {
        System.out.println("ArrayIndexOutOfBounds Exception occurs");
    }
               catch(Exception e)
    {
        System.out.println("Parent Exception occurs");
    }
               System.out.println("rest of the code");
}
}
