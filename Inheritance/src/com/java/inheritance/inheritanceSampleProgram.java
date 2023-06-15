package com.java.inheritance;
class Demo                    // super class
{
	public void count()  
	{
	System.out.println("Count() of super class");
    }
}
class Sample extends Demo      //sub class
{
	public void display()
	{
		System.out.println("display of sub clss");
	}
}
public class inheritanceSampleProgram
{

	public static void main(String[] args)
	{
       Demo d1=new Demo();
       d1.count();
       System.out.println("--------------------------");
       Sample s1=new Sample();
       s1.count();
       s1.display();

	}

}
