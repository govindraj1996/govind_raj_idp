package oops_concept;

public class Hybrid_inheritance
{
int x=896;
void parent()
{
	System.out.println("parent class= "+x);
}
}

class Dog extends Hybrid_inheritance
{
 double y=86.987;
 void child1()
 {
	 System.out.println("child1 class= "+y);
 }
	
}

class Cat extends Dog
{
 int z=8975;
 void child2()
 {
	 System.out.println("child2 class= "+z);
 }
}

class Frog extends Hybrid_inheritance
{
	int t=2657;
	void child3()
	{
		System.out.println("child3 class "+t);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("-----------Parent Class--------------");
		Hybrid_inheritance h1=new Hybrid_inheritance();
		   				   h1.parent();
		 
		System.out.println("-----------Child Class1--------------");  				   
		Dog d1=new Dog();
		  d1.child1();
		  d1.parent();
		
	    System.out.println("-----------Child Class2--------------");
		Cat c1=new Cat();
		    c1.child2();
		    c1.child1();
		    c1.parent();
		System.out.println("-----------Child Class3--------------");  
		Frog f1=new Frog();
		     f1.child3();
		     f1.parent();
		
	}
}