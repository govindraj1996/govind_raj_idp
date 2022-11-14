package oops_concept;

public class multilevel_inheritance
{
int P=100;

void Parent()
{
	System.out.println("Parent= "+P);
}
}

class Child3 extends multilevel_inheritance
{
int C=1351;

void Child()
{
	System.out.println("Child= "+C);
}
}

class Child1 extends Child3
{
	int C1=3568;
	
	void Child1()
	{
		System.out.println("Child1= "+C1);
	}
}

class Child2 extends Child1
{
	int c2=2568;
	
	void Child2()
	{
		System.out.println("Child2= "+c2);
	}
public static void main(String[] args)
{
System.out.println("-----------Parent Class--------------");
multilevel_inheritance p1=new multilevel_inheritance();
       p1.Parent(); 

System.out.println("-----------Child Class--------------");
Child3 c=new Child3();
      c.Child();
      c.Parent();

System.out.println("-----------Child-1 Class--------------");
Child1 c1=new Child1();
        c1.Child1();
        c1.Child();
        c1.Parent();



System.out.println("-----------Child-2 Class--------------");
Child2 c2=new Child2();
        c2.Child2();
        c2.Child1();
        c2.Child();
        c2.Parent();
}

}
