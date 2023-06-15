package com.java.abstract1;

abstract class count
{
public count(int a)
{
	System.out.println("count construcor");
}
}
class display extends count
{

public display()
{ 
	super(1);
	System.out.println("display construcor");
}
}
public class SampleMainclass2
{
public static void main(String[] args) 
	{
		display d1=new display();
	}
}