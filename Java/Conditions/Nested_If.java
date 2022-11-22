package Java.Conditions;

public class Nested_If
{
    public static void main(String[] args)
    {
        int age=25;
        int weight=65;
        //applying condition on age and weight
        if(age>=18)
        {
            if(weight>50)
            {
                System.out.println("You are eligible to donate blood");
            } else
            {
                System.out.println("You are not eligible to donate blood");
            }
        } else{

            System.out.println("Age must be greater than 18");
        }
    }
}
