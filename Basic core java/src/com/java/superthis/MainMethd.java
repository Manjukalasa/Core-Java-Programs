package com.java.superthis;
class Sample1
{
	int x=100;
}
class  Sample2 extends Sample1
{
	int x=200;
	public void display()
	{
		int x=300;
		System.out.println(super.x);
		System.out.println(this.x);
		System.out.println(x);
	}
}
public class MainMethd {

	public static void main(String[] args) 
	{
		 Sample2 s1=new Sample2();
		s1.display();

	}
}

