package zemoso;

import java.util.Scanner;

public class assignment2
{
	public static void main(String[] args) 
	{
	  String str; 
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter your String: ");
      str =sc.nextLine();
      str = str.toLowerCase();
      boolean[] alphaList = new boolean[26]; 
      int index = 0;
      int flag = 1;
      for (int i = 0; i < str.length(); i++)
      {
        if( str.charAt(i) >= 'a' &&  str.charAt(i) <= 'z') 
        {
            index = str.charAt(i) - 'a'; 
        }
         alphaList[index] = true; 
      }
      
      for (int i = 0; i <= 25; i++)
      {
         if (alphaList[i] == false)
            flag = 0;
      }
      System.out.print("String: " + str);
      System.out.println();
      if (flag == 1)
         System.out.print("The above string contains all the alphabets ");
      else
         System.out.print("The above string does not contains all the alphabets  ");
   }
}
