package com.java.wrapperclass;

public class WrapperClass 
{
	public static void main(String[] args) 
	{
		int a=10;
		Integer a1=a;                 //autoboxing
		//Integer a1=Integer.valueOf(a);  //autoboxing
		System.out.println("primitives="+a);
		System.out.println("object="+a1);

   		Integer i1=new Integer(6);//outdated(middel line)   //object will be created
//		int i2=i1;                    //unboxing
		int i2=i1.intValue();             //unboxing
		System.out.println("object="+i1);
		System.out.println("primitives="+i2);

		
		
	}

}
