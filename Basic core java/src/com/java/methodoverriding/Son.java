package com.java.methodoverriding;
class Father
{
	public void bike()
	{
	System.out.println("Spender");
}
}
 public class Son extends Father
{
	public void bike()
	{
	super.bike();
	System.out.println("Modified Spender");
}
}

