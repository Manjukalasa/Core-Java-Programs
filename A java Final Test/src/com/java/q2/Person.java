package com.java.q2;

public class Person 
{
	String name;
	public Person(String name)
	{
		this.name=name;
	}
	@Override
	public boolean equals(Object o)
	{
		return true;
	}
	public static void main(String[] args) 
	{
		Person p1=new Person("manju");
		Person p2=new Person("manju");
		System.out.println(p1.equals(p2));
	}
}
