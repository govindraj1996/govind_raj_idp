package Zemoso1;

import javax.xml.transform.stream.StreamSource;
import java.util.Collections;

public class Assigment1 {
    public static void main(String[] args)
    {
       for(int i=1;i<=100;i++)
       {
           if(i%15==0)
           {
               System.out.println("fizz buzz");
           }
           else if (i%5==0)
           {
               System.out.println("buzz");
           } else if (i%3==0)
           {
               System.out.println("fizz");
           }
           else
               System.out.println(i);
       }

    }
}
