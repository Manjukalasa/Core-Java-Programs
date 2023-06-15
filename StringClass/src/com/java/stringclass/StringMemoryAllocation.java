package com.java.stringclass;

public class StringMemoryAllocation 
{

	public static void main(String[] args) 
	{
		String str="hello";
		String str1="hello";
//		String str=new String("hello");
//		String str1=new String("hello");
		if(str==str1)
		{
		System.out.println("equals");
		}
		else
		{
			System.out.println("Not equals");	
		}
	}

}
