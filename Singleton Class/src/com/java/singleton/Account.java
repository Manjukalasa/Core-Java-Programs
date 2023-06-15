package com.java.singleton;

public class Account
{
private static Account obj=null;
private Account()
{
	System.out.println("Object is created");
}
public static Account createobject()
{
	if(obj==null)
	{
		obj=new Account();
	}
	else
	{
		System.out.println("can not create object");
	}
	return obj;
}
public void test()
{
	System.out.println("non static");
}
}
 