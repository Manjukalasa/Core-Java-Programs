package com.java.constructoroverloading;

public class Sample {
	public Sample()
	{
		System.out.println("zero args");
	}
	public Sample(int a)    //public Sample(int a,int b)
	{
		System.out.println("int 1 args");
	}
	public Sample(double b)
	{
		System.out.println("double 1 args");
	}
	public Sample(int a,double b)
	{
		System.out.println("int & double 2 args");
	}
	public Sample(double b,int a)
	{
		System.out.println("double & int args");
	}
	public static void main(String[] args)
	{
     new Sample();
     new Sample(1);
     new Sample(1.1);
     new Sample(1,1.1);
     new Sample(1.1,1);
     
	}

}
