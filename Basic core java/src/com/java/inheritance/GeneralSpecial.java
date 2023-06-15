package com.java.inheritance;

class Account1                 // super class
{
	double bal=1000;
	public void deposit(double amt)  
	{
		bal=bal+amt;
	System.out.println(bal);
	}
	public void withdraw(double amt)  
	{		
		bal=bal-amt;
	System.out.println(bal);
}
}
class Savings1 extends Account1     //super class
{
	double Roi=0.05;
	public void calculateRoi()
	{
		bal=bal+bal*Roi;
		System.out.println(bal);
 }
}
	class Current1 extends Account1     //sub class
	{
		double minbal=1000;
		public void showminbal()
		{
			System.out.println(minbal);
		}
	}
	public class GeneralSpecial
  {
	public static void main (String[] args)
	{    
		Savings1 s1=new Savings1();
		s1.deposit(3000);
		s1.withdraw(500);
		s1.calculateRoi();
		System.out.println("-----------------------------------------");
		Current1 c1 =new Current1();
		c1.showminbal();
		c1.deposit(2000);
		c1.withdraw(300);
		s1.calculateRoi();
	}
  }