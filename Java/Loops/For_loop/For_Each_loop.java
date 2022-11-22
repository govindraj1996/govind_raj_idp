package Java.Loops.For_loop;

public class For_Each_loop
{
    public static void main(String[] args)
    {
        //Printing array using for-each loop
        int numbers[]={12,23,44,56,78};
        for(int i:numbers)
        {
            System.out.print(i);
            System.out.print(",");
        }
        System.out.println();
        String names[]={"arun","ajay","vijay","karthik","manjunath"};
        for (String names1:names)
        {
            System.out.print(names1);
            System.out.print(",");
        }
    }
}
