package Java.File_handling;

import java.io.File;
import java.io.IOException;

public class Create_file
{
    public static void main(String[] args)
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
}
