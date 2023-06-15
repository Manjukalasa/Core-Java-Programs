package com.java.encapsulation;

public class Account 
{
 private double bal;

public double getbal()
{
	return bal;
}
public void setbal(double bal) 
{
	if(bal>0)
	{
	this.bal = bal;
    }
	else
	{
		System.out.println("invalid amount");
	}
  }
}
