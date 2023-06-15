package com.java.q1;

public class Mobile 
{
	public void contact(String name,long mobileno)
	{
		System.out.println(name+" "+mobileno);
	}
	public void contact(String name,long mobileno1,long mobileno2)
	{
		System.out.println(name+" "+mobileno1+" "+mobileno2);
	}
	public static void main(String[] args) 
	{
		Mobile m=new Mobile();
		m.contact("manju",12345678910l);
		m.contact("manju",12345678910l,123456789l);
	}
}
