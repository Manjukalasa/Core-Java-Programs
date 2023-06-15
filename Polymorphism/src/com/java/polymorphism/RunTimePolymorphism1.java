package com.java.polymorphism;
class Demo1
{
public void count()
{
	System.out.println("Hi");
}
}
class Demo2 extends Demo1         
	{
		@Override
		public void count()
		{
			System.out.println("Hello");
		}
	}
	public class  RunTimePolymorphism1
	{
		public static void main(String[] args)
		{
			Demo1 d1=new Demo1();
			d1.count();
			Demo2 d2=new Demo2();
			d2.count();
			Demo1 d3=new Demo2();  // upcasting
			d3.count();          // Golden java rule(overriden method will be execute)
			  
			
		}

	}
