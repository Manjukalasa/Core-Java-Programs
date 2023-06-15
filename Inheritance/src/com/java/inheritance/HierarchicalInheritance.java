package com.java.inheritance;

class Account                 // super class
{
	long accno=17842121007748l;
	double bal=1000;
	String owner="manju";
	
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
class Savings extends Account     //super class
{
	double Roi=0.05;
	public void calculateRoi()
	{
		bal=bal+bal*Roi;
		System.out.println(bal);
 }
}
class Current extends Account     //sub class
	{
		double minbal=1000;
		public void showminbal()
		{
			System.out.println(minbal);
		}
	}
public class HierarchicalInheritance
  {
	public static void main (String[] args)
	{    
		Savings s1=new Savings();
		s1.deposit(3000);
		s1.withdraw(500);
		s1.calculateRoi();
		System.out.println("-----------------------------------------");
		Current c1 =new Current();
		c1.showminbal();
		c1.deposit(2000);
		c1.withdraw(300);
	}
  }