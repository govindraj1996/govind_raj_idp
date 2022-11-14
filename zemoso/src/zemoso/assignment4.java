package zemoso;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class assignment4
{

	public static void main(String[] args) 
	{
	// Creating new file
		String path="C:\\Users\\Administrator\\Documents\\Sample2.text";
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
		
	// Write file
		
		 try {  
		        FileWriter fwrite = new FileWriter("C:\\Users\\Administrator\\Documents\\Sample2.text");  
		        
		        // writing the content into the FileOperationExample.txt file  
		        fwrite.write("zemoso");   
		   
		        // Closing the stream  
		        fwrite.close();   
		        System.out.println("Content is successfully wrote to the file.");  
		     } 
		 catch (IOException e)
		 	{  
		        System.out.println("Unexpected error occurred");  
		        e.printStackTrace();  
		       
		 	}  
		     
	
	// Read file
	
	     try 
	     {  
	    	 // Create f1 object of the file to read data  
	    	 File f1 = new File("C:\\Users\\Administrator\\Documents\\Sample1.text");    
	    	 Scanner dataReader = new Scanner(f1);  
	    	 while (dataReader.hasNextLine())
         {  
             String fileData = dataReader.nextLine();  
             System.out.println(fileData);  
         }  
	    	 dataReader.close();  
	     }
	     
	     catch (FileNotFoundException exception)
	     {  
         System.out.println("Unexcpected error occurred!");  
         exception.printStackTrace();  
	     }
	 
		

	// Get file information
		
	 // Creating file object  
		File fo=new File("C:\\Users\\Administrator\\Documents\\Sample1.text");
		
		if (fo.exists()) 
		{  
			// Getting file name  
			System.out.println("The name of the file is: " + fo.getName());  

			// Getting path of the file   
			System.out.println("The absolute path of the file is: " + fo.getAbsolutePath());     

			// Checking whether the file is writable or not  
			System.out.println("file is writeable: " + fo.canWrite());    

			// Checking whether the file is readable or not  
			System.out.println("file is readable: " + fo.canRead());    

			// Getting the length of the file in bytes  
			System.out.println("The size of the file in bytes is: " + fo.length());    
		} 
		else
		{  
			System.out.println("The file does not exist.");  
        } 
	
}
}
