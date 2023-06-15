package com.java.stringclass;

public class StringImmutable
{

	public static void main(String[] args) 
	{
		String str="hello";  // str obeject(hello) will be de-referenced
		String str1="hello";
		//str=str.concat("hi");  // string immutable concept using  Concatination method(+)-->hello+hi=hellohi 
	    str="hi";                 // string immutable concept
		System.out.println(str);
		System.out.println(str1);
		
	}

}
