package com.java.q6;

public class Calimp implements Calculator
{
	@Override
	public int add() 
	{
		try
		{
      int res=10/0;
      System.out.println(res);
		}
		catch(Exception e)
		{
			System.out.println("Exception Handelled");
		}
		return 0;
	}
	public static void main(String[] args)
	{
		Calimp ci=new Calimp();
		ci.add();
	}
	
}
