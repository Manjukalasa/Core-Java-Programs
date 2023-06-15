package com.java.q4;

interface Swiggy 
{
  public void order();
}
class Veg implements Swiggy
{
	@Override
	public void order() {
		System.out.println("veg is ordered");		
	}
	
}
class  NonVeg implements Swiggy
{

	@Override
	public void order() {
		System.out.println("Nonveg is ordered");		
	}
	
}

