package com.java.interface1;
interface Run5
{
	public void test();
	public static void test2()
	{
		System.out.println("static concrete of run5 interface");
	}
	public default void test3()
	{
		System.out.println("non-ststic concrete of run5 interface");
	}
}
class Demo5 implements Run5
{
//	public static void test2()  // we using Static keyword->not overriding it is method hidding
//	{
//		System.out.println("static concrete of run5 interface is method Hiding ");
//	}
	
//	@Override
//	public void test3()        //  we using Non-Static keyword->non-static(); is Overridden
//	{
//		System.out.println("non-ststic concrete of run5 interface is overridden");
//	}
	@Override
	public void test()
	{
		System.out.println("test abstract method of interface is overriden");
	}
	
}
public class MainJDK8 
{
   
	public static void main(String[] args)
	{
      Demo5 d1=new Demo5();
      d1.test();
      d1.test3();
      Run5.test2();
     // Demo5.test2();  // not overriding it is method hiding
   
	}

}
