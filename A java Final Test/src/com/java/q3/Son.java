package com.java.q3;

public class Son implements Father,Mother 
{
	@Override
	public void test()
	{
		System.out.println("Hi");
	}
	@Override
	public void count()
	{
		System.out.println("Hello");
	}
	public void m1(Father f) 
	{
		System.out.println("Java");	
	}
//	public void m1(Mother f) 
//	{
//		System.out.println("Java");	
//	}
	public static void main(String[] args)
	{
		Son s=new Son();
		s.test();
		s.count();
		Father f=new Son();
		Mother m=new Son();
		s.m1(f);
	//	s.m1(m);
		f.test();
		m.count();
		
	}
}
