package Zemoso1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Assignment4th
{
   //Creating new file
    public void creatingnewfile()
 {
    String path="/home/govr/Documents/Govindraj/Sample.text";
    File f1=new File(path);
    try {
        boolean flag=f1.createNewFile();
        if (flag)
        {
            System.out.println("New file created");
        }
        else
        {
            System.out.println("File already exist");
        }
    }catch (IOException e)
    {
        e.printStackTrace();
    }
 }
 //Write file
     public void wrirtefile()
     {
         try
         {
           FileWriter fwrite = new FileWriter("/home/govr/Documents/Govindraj/Sample.text",true);
           fwrite.append("Hai");
           fwrite.append("\nHello");
           fwrite.append("\nWelcome");

           fwrite.close();
      System.out.println("Content is successfully writen to the file");
     }
        catch (IOException e)
        {
           System.out.println("Unexcepted error occured");
           e.printStackTrace();
        }
     }

public void readfile()
{
    try {
        File f2 = new File("/home/govr/Documents/Govindraj/Sample.text");
        Scanner datareader = new Scanner(f2);
        while (datareader.hasNextLine())
        {
            String filedata = datareader.nextLine();
            System.out.println(filedata);
        }
        datareader.close();
    }
    catch (FileNotFoundException e)
    {
        System.out.println("Unexpected error occured");
        e.printStackTrace();
    }
}

// Get file information
    public void information() {
        File f3 = new File("/home/govr/Documents/Govindraj/Sample.text");

        if (f3.exists()) {
            //Getting file name
            System.out.println("The name of the file is: " + f3.getName());

            //Getting the path of the file
            System.out.println("The absolute path of the file is: " + f3.getAbsolutePath());

            //Checking weather the file is writable or not
            System.out.println("The file is writable: " + f3.canWrite());

            // Checking weather the file is readable or not
            System.out.println("The file is readable: " + f3.canRead());

            //Getting the size of the file in bytes
            System.out.println("The size of the file in bytes is: " + f3.length());
        } else {
            System.out.println("The file does not exist");

        }
    }

    // Delet file
    public void delete()
    {
        File f4=new File("/home/govr/Documents/Govindraj/Sample.text");
        if(f4.delete())
        {
            System.out.println("The deleted file is: "+f4.getName());
        }
        else
        {
            System.out.println("Failed in deleting file");
        }
    }




    public static void main(String[] args)
    {
Assignment4th a4=new Assignment4th();
            a4.creatingnewfile();
            a4.wrirtefile();
            a4.readfile();
            a4.information();
            a4.delete();
    }

}
