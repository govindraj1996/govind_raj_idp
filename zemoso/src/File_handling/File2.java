package File_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class File2
{
//creating a new file
	
	public static void main(String[] args) 
	{
	 
		String path="C:\\Users\\Administrator\\Documents\\Sample.text";
		File file=new File(path);
		try {
			boolean flag=file.createNewFile();
			if(flag)
			{
				System.out.println("file created");
			}
			else
			{
				System.out.println("file is already present");
			}
		} catch (IOException e){
			e.printStackTrace();
		}
		
		// using Fileoutputstream along with scanner
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the filename with path: ");
		String filename= sc.nextLine();
		
		try {
			FileOutputStream fos=new FileOutputStream(filename,true);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("Enter the file content: ");
		String content= sc.nextLine();
		byte b[]= content.getBytes();
		
		
	}
	
}
