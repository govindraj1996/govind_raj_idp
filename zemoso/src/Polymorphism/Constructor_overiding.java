package Polymorphism;

public class Constructor_overiding
{
	Constructor_overiding()  
     { 
       System.out.println("0-arg constructor");
     }
	Constructor_overiding(int i)
      { 
    	System.out.println("int argument constructor");
      }  
	Constructor_overiding(char ch,int i) 
      { 
    	System.out.println(ch+"-----"+i); 
      }
 public static void main(String[] args)  
           { 
	 Constructor_overiding t1=new Constructor_overiding();//calling of zero argument constructor   
	 Constructor_overiding t2=new Constructor_overiding(10);//calling of one argument constructor 
	 Constructor_overiding t3=new Constructor_overiding('a',100);//calling of two argument constructor 
          }
}
