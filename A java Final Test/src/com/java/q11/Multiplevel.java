package com.java.q11;
class A
{
	public void test()
	{
		System.out.println("hi");
	}
}
class B extends A
{
	public void count()
	{
		System.out.println("hello");
	}
}
class C extends B
{
	public void display()
	{
		System.out.println("java");
	}
}
public class Multiplevel 
{
	public void m1(A a)
	{
		System.out.println("SQL");
	}
	public static void main(String[] args) 
	{
		Multiplevel m=new Multiplevel();
		A a1=new A();
		B b1=new B();
		C c1=new C();
	 // 3 ways call m1() 
		m.m1(a1); 
		m.m1(b1);
		m.m1(c1);	
		c1.test();
		c1.count();
		c1.display();
	}
}
