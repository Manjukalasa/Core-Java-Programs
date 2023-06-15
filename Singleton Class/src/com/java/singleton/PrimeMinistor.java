package com.java.singleton;

public class PrimeMinistor
{
    String name="modi";// declare non-static(because static is without creating the object we can access directly outside class)
	private static PrimeMinistor pm=null;
	private PrimeMinistor()
	{
		System.out.println("PM got elected");
	}
	public static PrimeMinistor createobject()
	{
		if(pm==null)
		{
			pm=new PrimeMinistor();
		}
		return pm;
	}
}
