package com.java.stringclass;

public class StringMethods 
{
	public static void main(String[] args)
	{
	  StringMethods s1=new StringMethods ();
	  StringMethods s2=new StringMethods ();
	  String str1="ABC";
	  String str2="abc";
	  String str3="ABC";
	    
	     System.out.println("Overridden Methods of Object class");
	     System.out.println(s1.hashCode());
	     System.out.println(s1.toString());
	     System.out.println(s1);
	     System.out.println(s1.equals(s2));
	     System.out.println("----------------------------------");
	     System.out.println(str1.hashCode());
	     System.out.println(str2.hashCode());
	     
	     System.out.println(str1.toString());
	     System.out.println(str1);
	     
	     System.out.println(str1.equals(str2));
	     System.out.println(str1.equals(str3));
	     
}
}
