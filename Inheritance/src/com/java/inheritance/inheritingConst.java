package com.java.inheritance;
class Sample2                   // super class
{
	public Sample2()  
	{
	System.out.println("Sample2 const of super class");
    }
}
class Demo2 extends Sample2      //sub class
{
	public Demo2()
	{
		// implicitly super(); working
		System.out.println("Demo2 const of sub clss");
	}
}
public class inheritingConst
{
	public static void main(String[] args)
	{
       Demo2 d1=new Demo2();
	}

}
