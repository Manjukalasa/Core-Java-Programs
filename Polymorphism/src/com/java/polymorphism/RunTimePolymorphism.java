package com.java.polymorphism;

class Sample
{
public void count()
{
	System.out.println("Java");
}
}
class Demo extends Sample         
	{
		@Override
		public void count()
		{
			System.out.println("Hibernate");
		}
	}
	public class RunTimePolymorphism
	{
		public static void main(String[] args)
		{
			Demo d1=new Demo();
			Sample s1=d1;    // upcasting
			s1.count();  // Golden java rule(overriden method will be execute)
		}

	}
