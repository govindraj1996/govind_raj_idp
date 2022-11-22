package Java.File_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read_file
{
    public static void main(String[] args) {

        File f2 = new File("/home/govr/Documents/Govindraj/Sample.text");
        Scanner datareader = null;
        try {
            datareader = new Scanner(f2);
        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        }
        while (datareader.hasNextLine()) {
            String filedata = datareader.nextLine();
            System.out.println(filedata);
        }
        datareader.close();
    }
}
