package com.java.typecasting;

abstract class A
{
	public  void test()
	{
		System.out.println("test(); of A superclass ");
	}
}
class B extends A
{
	public void count()
	{
		System.out.println("count(); of B subclass");
	}
}
public class UpCastingDownCasting
{
	public static void main(String[] args) 
	{
      B b=new B();    // UpCasting
      A a=b;
      a.test();
      
      System.out.println("------------------------------");
      
      B b1=(B)a;     //Downcasting
      b1.test();
      b1.count();
    
	}

}
