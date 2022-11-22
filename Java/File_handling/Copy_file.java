package Java.File_handling;

import java.io.*;

public class Copy_file
{
    public static void main(String[] args) {
        copyfile();

    }

    public static void copyfile()
    {
        File file=new File("/home/govr/Documents/Govindraj/Sample.text");
        File opfile=new File("/home/govr/Documents/Govindraj/Sample.text1");
        FileInputStream fileInputstream=null;
        FileOutputStream fileOutputstream=null;

        try {
            fileInputstream =new FileInputStream(file);
            fileOutputstream =new FileOutputStream(opfile);
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }

        try {
            System.out.println(fileInputstream.available());
        } catch (IOException e) {
            e.printStackTrace();
        }

        int i=0;
        try {
            while((i=fileInputstream.read())!=-1)
            {
                fileOutputstream.write(i);
            }
        } catch (IOException e) {

            e.printStackTrace();
        }

        finally
        {
            //close the streams

            if(fileInputstream!=null) {
                try {
                    fileInputstream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(fileOutputstream!=null) {
                try {
                    fileOutputstream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
