package com.java.inheritance;
class Sample1                 // super class
{
	final int v1=10;
    String str="manju";
	public void test()  
	{
	System.out.println("test() of Sample super class");
    }
	public void count()
	{
		System.out.println("count() of Sample super clss");
	}
}
class Demo1 extends Sample1     //sub class
{
	double z1 =1.9;
	public void display()
	{
		System.out.println("display() of sub clss");
	}
}
public class SingleInheritance 
{
	public static void main (String[] args)
	{    
       Demo1 d1=new Demo1();
       System.out.println(d1.v1);	
       System.out.println(d1.str);	
       d1.test();
       d1.count();  
       System.out.println(d1.z1);	
       d1.display();

	}

}
