package com.java.abstract1;

abstract class Sample1
{
public static void text()
{
	System.out.println("static concrete text of abstract class");
}
public void text1()
{
	System.out.println("non-static concrete text of abstract class");	
}
public abstract void text2();
}
class Demo1 extends Sample1
{
	@Override	
public void text2()
{
	System.out.println("text2 of abstract class is ovrriden");
}
}
public class SampleMainclass1
{
public static void main(String[] args) 
	{
		Demo1 d1=new Demo1();
		d1.text2();
		d1.text1();
		Sample1.text();
		
	}
}
