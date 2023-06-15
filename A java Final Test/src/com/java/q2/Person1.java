package com.java.q2;
public class Person1 
{
	String name;
	public Person1(String name)
	{
		this.name=name;
	}
	@Override
	public boolean equals(Object o)
	{
		Person1 p=(Person1)o;
		return this.name==p.name;
	}
	public static void main(String[] args) 
	{
		Person1 p1=new Person1("manju");
		Person1 p2=new Person1("manju");
		System.out.println(p1.equals(p2));
	}
}
