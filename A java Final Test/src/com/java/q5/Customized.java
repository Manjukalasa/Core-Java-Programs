package com.java.q5;
class Appnotsupport extends Exception
{
	public Appnotsupport(String msg) 
	{
		super(msg);
	}
}
public class Customized 
{
	public static void check()throws Appnotsupport
	{
		throw new Appnotsupport("small screen");  //super(msg);
	}
	public static void main(String[] args) 
	{
     try 
     {
		check();
	 }
     catch (Appnotsupport e) 
     {
           e.printStackTrace();
         //System.out.println(e.getMessage());
        // System.out.println("handelled");
	}
	}

}
