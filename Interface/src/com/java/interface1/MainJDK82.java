package com.java.interface1;
interface Run6
{
	public void test();
	public static void test1()
	{
		System.out.println("test1 static of Run6");
	}
	public default void test2()
	{
		System.out.println("test1 non-static of Run1");
	}
}
interface Run7
{
	public void test();
	public static void test1()
	{
		System.out.println("test1 static of Run7");
	}
	public default void test2()
	{
		System.out.println("test1 non-static of Run7");
	}
}
class Demo6 implements Run6,Run7
{

	@Override
	public void test()
	{
		System.out.println("test abstract method of Run6 & Run7");
	}
	@Override
	public void test2()
	{
		System.out.println("overridden default method of Run6 & Run7");
	}
	
}
public class MainJDK82 
{
   
	public static void main(String[] args)
	{
      Demo6 d6=new Demo6();
      d6.test();
      d6.test2();
      Run6.test1();
      Run7.test1();
   
	}

}