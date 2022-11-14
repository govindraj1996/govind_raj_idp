package oops_concept;

public class Hierarchical_inheritance 
{
	
		int P=1568;

		void Parent1()
		{
			System.out.println("Parent="+P);
		}
		}

		class Apple extends Hierarchical_inheritance
		{
		int C=100000;

		void Child()
		{
			System.out.println("Child="+C);
		}
		}

		class Ball extends Hierarchical_inheritance
		{
			int C1=10000;
			
			void Child1()
			{
				System.out.println("Child1="+C1);
			}
		}

		class Cow extends Hierarchical_inheritance
		{
			int c2=1000;
			
			void Child2()
			{
				System.out.println("Child2="+c2);
			}
		public static void main(String[] args)
		{
		System.out.println("-----------Parent Class--------------");
		Hierarchical_inheritance p1=new Hierarchical_inheritance();
		       p1.Parent1();

		System.out.println("-----------Child Class--------------");
		Apple a=new Apple();
		      a.Child();
		      a.Parent1();

		System.out.println("-----------Child-1 Class--------------");
		Ball b=new Ball();
		       b.Child1();
		       b.Parent1();



		System.out.println("-----------Child-2 Class--------------");
		Cow c=new Cow();
		        c.Child2();
		        c.Parent1();
		}

}
