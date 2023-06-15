package com.java.typecasting;
	class A5
	{
		public  void test()
		{
			System.out.println("test(); of A5 superclass ");
		}
	}
	class B5 extends A5
	{
		public void count()
		{
			System.out.println("coutn(); of B5 subclass");
		}
	}
	class C5 extends A5
	{
		public void display()
		{
			System.out.println("display(); of C5 subclass");
		}
	}
public class CastOverloaded
{
	public void cast(A5 a)
	{
		System.out.println("Hello Manju");
	}

	public void cast(B5 b)  // Method Overloading---->it will be check first same aruments
	{
		System.out.println("Hi Manju");
	}
	public static void main(String[] args) 
	{
	 CastOverloaded c1=new  CastOverloaded();
	  A5 a=new A5();
	  B5 b=new B5();
	  C5 c=new C5();
	  c1.cast(a);          // A4 a=new new A4();
	  c1.cast(b);          // A4 a=new new B4();  // upcasting is done by implicitly
	  c1.cast(c);          // A4 a=new new C4();
}
}