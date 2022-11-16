package Zemoso1;

import java.util.Scanner;

public class Assignment2
{
    public static void main(String[] args)
    {
    String str;
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
     str=sc.nextLine();
     str=str.toLowerCase();
     boolean[] alpphalist=new boolean[26];
     int index=0;
     int flag=1;

     for (int i=0;i<str.length();i++)
     {
         if (str.charAt(i)>'a' && str.charAt(i)<'z')
         {
             index=str.charAt(i)-'a';
         }
         alpphalist[index]=true;
     }
     for (int i=0;i<25;i++)
     {
         if (alpphalist[i]==false)
             flag=0;
     }
        System.out.println("string: "+str);
      if (flag==1)
          System.out.println("The string contains all the alphebets");
      else
          System.out.println("The string does not contain all the alphebets");
    }

}
