package com.java.singleton;

public class AcccountMain {

	public static void main(String[] args)
	{
      Account a= Account.createobject();//only one object  we can create
      a.test();
      
      Account a1= Account.createobject();// 2nd time object creation
      a1.test();
	}

}
