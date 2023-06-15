package com.java.constructoroverloading;

public class Samplethis 
{
	public Samplethis()
	{
		System.out.println("zero args");
	}
	public Samplethis(int a)
	{
		this();
		System.out.println("int 1 args");
	}
	public Samplethis(double b)
	{
		this(1);
		System.out.println("double 1 args");
	}
	public Samplethis(int a,double b)
	{
		this(1.0);
		System.out.println("int & double 2 args");
	}
	public Samplethis(double b,int a)
	{
		this(1,1.0);
		System.out.println("double & int args");
	}
	public static void main(String[] args)
	{
     new Samplethis(1.0,1);
	}
}
