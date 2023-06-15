package com.java.methodoverriding;
class Whatsapp1
{
	public void deliveryreport()
	{
		System.out.println("single tick");
	}
}
class Whatsapp2 extends Whatsapp1
{
	@Override
	public void deliveryreport()
	{
		//super.deliveryreport();
		System.out.println("double tick");
	}
}
class Whatsapp3 extends Whatsapp2
{
	@Override
	public void deliveryreport()
	{
		//super.deliveryreport();
		System.out.println("blue tick");
	}
}

public class WhatsappMain 
{
	public static void main(String[] args) {
		Whatsapp3 w3=new Whatsapp3();
		w3.deliveryreport();
	}

}
