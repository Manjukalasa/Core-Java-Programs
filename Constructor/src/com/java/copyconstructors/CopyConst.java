package com.java.copyconstructors;

public class CopyConst 
{
	private String name;
	public CopyConst(String name)
	{
		this.name=name;
		System.out.println(name);
	}
	public CopyConst(CopyConst c1)
	{
//		this.name=c1.name;
//		System.out.println(name);
		System.out.println("hello");
	}
	public void display()
	{
		System.out.println(name);
	}
	public static void main(String[] args) {

		CopyConst c2=new CopyConst("mk");
		CopyConst c3=new CopyConst(c2);
		c2.display();
		c3.name="mbk";
		c3.display();
	}
}
