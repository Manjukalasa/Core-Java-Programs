package com.java.staticnonstatic;

public class Nonstatic 
{
	{
		System.out.println("Hi");
	}
	static 
	{
		System.out.println("Hello");	
	}
     Nonstatic()
     {
    	 System.out.println("Constructor");	 
     }
	public static void main(String[] args) 
	{
//		 new Nonstatic();
//         System.out.println("JAVA");
         System.out.println("JAVA");
         new Nonstatic();
	}

}
