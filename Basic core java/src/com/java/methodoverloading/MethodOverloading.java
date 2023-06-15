package com.java.methodoverloading;

public class MethodOverloading 
{
	public void Sample(int x,int y)    //public Sample(int a,int b)
	{
		System.out.println("x="+x+" y="+y);
	}
	public void Sample(int x,double y)
	{
		System.out.println("x="+x+" y="+y);
	}
	public void Sample(double x,int y)
	{
		System.out.println("x="+x+" y="+y);
	}
	public void Sample(double x,double y)
	{
		System.out.println("x="+x+" y="+y);
	}
	public static void main(String[] args)
	{
	 MethodOverloading  m1=new  MethodOverloading();
     m1.Sample(1,2);
     m1.Sample(1,3.1);
     m1.Sample(1.4,1);
     m1.Sample(1.5,2.1);
    
	}
}
