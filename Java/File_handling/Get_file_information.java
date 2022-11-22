package Java.File_handling;

import java.io.File;

public class Get_file_information
{
    public static void main(String[] args)
    {
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
}
