package com.java.interface1;
interface Run1                      // Super interface 2 
{
	int a=10;                      //default Static and final
	public void test();            //default abstract method
}
interface Run2                      // Super interface 2 
{                   
	public void count();
}
class s11 implements Run1,Run2            // implementation class
{
	@Override
	public void test()
	{
		System.out.println("test() run1 interface");
	}
	@Override
	public void count()
	{
		System.out.println("count() run2 interface");
	}
}
public class MainMethod1
{
	public static void main(String[] args)
	{
		s11 s11=new s11();
		s11.test();
		s11.count();
		System.out.println(Run1.a);

	}

}
