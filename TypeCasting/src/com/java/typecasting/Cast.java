package com.java.typecasting;
	class A4
	{
		public  void test()
		{
			System.out.println("test(); of A4 superclass ");
		}
	}
	class B4 extends A4
	{
		public void count()
		{
			System.out.println("coutn(); of B4 subclass");
		}
	}
	class C4 extends A4
	{
		public void display()
		{
			System.out.println("display(); of C4 subclass");
		}
	}
public class Cast
{
	public void cast(A4 a)
	{
		System.out.println("Hello Manju");
	}
	public static void main(String[] args) 
	{
	  Cast c1=new Cast();
	  A4 a=new A4();
	  B4 b=new B4();
	  C4 c=new C4();
	  c1.cast(a);          // A4 a=new new A4();
	  c1.cast(b);          // A4 a=new new B4();  // upcasting is done by implicitly
	  c1.cast(c);          // A4 a=new new C4();
}
}