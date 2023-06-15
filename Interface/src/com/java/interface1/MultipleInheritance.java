package com.java.interface1;
interface Run3                        // Super interface 2 
{                     
	public void test();              // abstract method
}
interface Run4                      // Super interface 2 
{                   
	public void count();
}
class x                            // super class
{                   
	public void check()
	{
		System.out.println("check() of x class");
	}
}
class s2 extends x implements Run3,Run4            // implementation class
{
	@Override
	public void test()
	{
		System.out.println("test() Run3 of interface");
	}
	@Override
	public void count()
	{
		System.out.println("count() Run4 of interface");
	}
}
public class MultipleInheritance
{
	public static void main(String[] args)
	{
		s2 s2=new s2();
		s2.test();
		s2.count();
		s2.check();

	}

}

