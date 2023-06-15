package com.java.abstract1;
abstract class Amazon
{
	public abstract void login();
	public abstract void logout();
}
class Customer extends Amazon
{
	@Override
public void login()
{
	System.out.println("email And Password");
}
	@Override
public void logout()
{
	System.out.println("button");
}
}
class Admin extends Amazon
{
	@Override
	public void login()
	{
		System.out.println("empId And Password");
	}
	@Override
	public void logout()
	{
		System.out.println("Thumb");
	}	
}
public class AmazoMainClass 
{
	public static void main(String[] args) 
	{
		System.out.println("Customer Side:");
		Customer c1=new Customer();
		c1.login();
		c1.logout();
		System.out.println("------------------------------------------------");
		System.out.println("Admin Side:");
		Admin a1=new Admin();
		a1.login();
		a1.logout();
}
}