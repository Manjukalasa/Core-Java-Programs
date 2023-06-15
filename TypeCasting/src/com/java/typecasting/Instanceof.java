package com.java.typecasting;

	class A6
	{
		
	}
	class B6 extends A6
	{
		
	}
	class C6 extends A6
	{
		
	}
	public class Instanceof
	{
		public static void main(String[] args) 
		{
			A6 a6=new A6();                 
			B6 b6=new B6();
		    // it will be campare object ref & class
			System.out.println(a6 instanceof A6);  //true
			System.out.println(a6 instanceof B6);  //false
			System.out.println(b6 instanceof A6);  //true
			System.out.println(b6 instanceof B6);  //true
			
		}
}
