package Java.File_handling;

import java.io.File;

public class Delete_file
{
    public static void main(String[] args)
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
}
