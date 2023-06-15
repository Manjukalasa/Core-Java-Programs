package com.java.methodoverriding;

class Father1
{
	public void bike()
	{
	System.out.println("Spender");
}
}
 class Son1 extends Father1
{
	public void bike()
	{
	super.bike();
	System.out.println("Modified Spender");
}
}
 public class MainMethodSon
{
public static void main(String[] args)
	{
     Son1 s1=new Son1();
     s1.bike();
	}
}
