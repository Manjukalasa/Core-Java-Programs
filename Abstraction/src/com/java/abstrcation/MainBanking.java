package com.java.abstrcation;

public class MainBanking    // object Utilization  
{
	public static void main(String[] args) 
	{
		 Service s1=new Service();
		 User u1=s1.createobject(1234);
		 u1.transfer();
		 System.out.println("-----------------------------------");
		 User u2=s1.createobject(4321);
		 u2.transfer();

	}

}
