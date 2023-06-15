package com.java.stringbuffer;

public class StringBufferExample
{
	public static void main(String[] args) 
	{
		String s1="java";   //immutable
		s1=s1.concat("hello");
		System.out.println(s1);
		System.out.println("------------------------------------------");
		
		StringBuffer s2=new StringBuffer("java"); //mutable
	//	StringBuilder s2=new StringBuilder("java"); 
		      s2.append("hello");
		System.out.println(s2);	
	}
}
