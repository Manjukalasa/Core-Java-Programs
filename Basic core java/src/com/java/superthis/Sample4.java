package com.java.superthis;

	class Sample3
	{
		int x=100;
	}
	public class  Sample4 extends Sample3
	{
		int x=200;
		public void display()
		{
			int x=300;
			System.out.println("super class valu"+super.x);
			System.out.println("current class valu"+this.x);
			System.out.println(x);
		}
	}

