package Java.File_handling;

import java.io.FileWriter;
import java.io.IOException;

public class Write_file
{
    public static void main(String[] args)
    {
        try
        {
            FileWriter fwrite = new FileWriter("/home/govr/Documents/Govindraj/Sample.text",true);
            fwrite.append("\nHai");
            fwrite.write("\nHello");
            fwrite.append("\nWelcome to Zemoso");


            fwrite.close();
            System.out.println("Content is successfully writen to the file");
        }
            catch (IOException e)
            {
                System.out.println("Unexcepted error occured");
                e.printStackTrace();
            }
        }


}
