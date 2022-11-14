package Polymorphism;

public class Method_overriding 
{
	void property()
	{
		
		System.out.println("money+land+house"); 
	} 
//  Overridden method  
	void marry()  
	{
		System.out.println("black girl");         
	} }
class Child extends Method_overriding
{
	//  overriding method
	void marry()
	{ 
		System.out.println("white girl/red girl"); 
	}
	public static void main(String[] args)   
	{   
		Child c=new Child(); 
		c.property();  
		c.marry();   
//		Method_overriding p=new Method_overriding();
//		p.property();  
//		p.marry();
		
		Method_overriding p=new Child();
		         p.marry();
		
		
	}
}
