package oops_concept;

public class single_inheritance
{

	int P=1000000;

	void Parent()
	{
		System.out.println("Parent="+P);
	}
	}

	class child extends single_inheritance
	{
	int C=100000;

	void Child()
	{
		System.out.println("Child="+C);
	}

	public static void main(String[] args)
	{
	System.out.println("-----------Parent Class--------------");
	single_inheritance p1=new single_inheritance();
	        p1.Parent();

	System.out.println("-----------Child Class--------------");
	child c1=new child();	
	      c1.Child();
	      c1.Parent();
	}

}
