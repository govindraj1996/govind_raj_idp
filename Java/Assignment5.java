package Zemoso1;

import java.io.File;
import java.util.Scanner;

public class Assignment5
{
private void findfile()
{
    File file=new File("/home/govr/Documents/");
    String str;

    Scanner scanner=new Scanner(System.in);

    do
    {
        int ab = 0;
        System.out.println("Enter the name of file or folder");

        str = scanner.nextLine();
        String[] files = file.list();

        for (String string : files)
        {
            Boolean str1 = str.equals(string);

            if (str1)
            {
                ab = 1;
                System.out.println("File found");
                System.out.println(string);
                System.out.println("path: " + file.getAbsolutePath());

            }
        }
        if (ab == 0)
        {
            System.out.println("File not found : Re enter the name of the file");
        }
    }while (true);
}

    public static void main(String[] args)
    {
     Assignment5 a5=new Assignment5();
                 a5.findfile();
    }
}
