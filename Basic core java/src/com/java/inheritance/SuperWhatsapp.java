package com.java.inheritance;
class WhatsaappV1                 
{
    public WhatsaappV1()                 
	{
     System.out.println("Whatsapp version 1");
     sendmsg();
	}
	public void sendmsg()  
	{
	System.out.println("Send Msg");
	}
}
class WhatsaappV2 extends WhatsaappV1    
{
    public WhatsaappV2()                 
	{
     super();
     System.out.println("Whatsapp version 2");
     sendvoicemsg();
	}
	public void sendvoicemsg()
	{
		super.sendmsg();
		System.out.println("Send Voice Msg");
	}
}
	class WhatsaappV3 extends WhatsaappV2    
	{
	    public WhatsaappV3()                 
		{
         super();
         System.out.println("Whatsapp version 3");
         videocall();
		}
		public void videocall()
		{
			super.sendvoicemsg();
			System.out.println("vieo Call");
		}
	}
	public class SuperWhatsapp
	{
	public static void main (String[] args)
	{    
       WhatsaappV3 w1=new WhatsaappV3();
       System.out.println("-----------------------------");
//       w1.sendmsg();
//       w1.sendvoicemsg();
         w1.videocall();

	}
}
