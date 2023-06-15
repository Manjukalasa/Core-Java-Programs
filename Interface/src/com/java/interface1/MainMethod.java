package com.java.interface1;
interface Run                      // Super interface 
{
	int a=10;                          //default Static and final
    void test();                 // default abstract method if Public 
}
class s1 implements Run            // implementation class
{
	@Override
	public void test()
	{
		System.out.println("test() abstract of interface is overridden");
	}
}
public class MainMethod
{
	public static void main(String[] args)
	{
		s1 s=new s1();
		s.test();
		System.out.println(Run.a);
	//	Run r1;
	}
}
