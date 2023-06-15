package com.java.typecasting;

public class PrimitiveCasting 
{
	public static void main(String[] args) 
	{
       int a=100;
       double b=a;           // widening
       System.out.println(b);
       
       double b1=1.2345;
       int a1=(int)b1;        //Narrowing    int a1=(Datatype)variable
       System.out.println(a1);
       
//       int a2='a';     // it will be take unicode value using integer formate
//       System.out.println(a2);
//       int a3='a';     // using char it will be take letter formate
//       char c3=(char)a3;
//       System.out.println(c3);
	}

}
