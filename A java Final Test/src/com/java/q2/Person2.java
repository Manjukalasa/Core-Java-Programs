package com.java.q2;
public class Person2
{
	int id;
	String name;
	public Person2(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	@Override
	public boolean equals(Object o)
	{
		Person2 p=(Person2)o;
		return this.name==p.name &&	this.id==p.id;
	}
	public static void main(String[] args) 
	{
		Person2 p1=new Person2(10,"manju");
		Person2 p2=new Person2(10,"manju");
		System.out.println(p1.equals(p2));
	}
}
