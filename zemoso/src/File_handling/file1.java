package File_handling;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class file1 
{
	//copying a file

	public static void main(String[] args)
	{
		copyfile();
		
	}
	
	public static void copyfile()
	{
		File file=new File("C:\\Users\\Administrator\\Documents\\Sample.pdf");
		File opfile=new File("C:\\Users\\Administrator\\Documents\\Sample2.pdf");
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
