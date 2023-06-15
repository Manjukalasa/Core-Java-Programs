package com.java.typecasting;
class Customer
{
  public void buyproduct()
  {
	  System.out.println("customer can Buy products");
  }
  public void cancleproduct()
  {
	  System.out.println("customer can Cancle products"); 
  }
}
class Admin 
{
	 public void addproduct()
	  {
		  System.out.println("Admin can Add products");  
	  }
	 public void removeproduct()
	  {
		 System.out.println("Admin can Remove products");
	  }
}
//------------------------------Service class--------------------------------------------
class Loginpage                             // Flipkart login page
{
	    public void login(Object obj)   // it will take Super most Object referance
	    {
		if(obj instanceof Customer)
		{
	     Customer c=new Customer();
		 System.out.println("customer object is created");
		 c.buyproduct();
		 c.cancleproduct();
		}
		else
		{
		 Admin a=new Admin();
		 System.out.println("Admin object is created");
		 a.addproduct();
		 a.removeproduct();
		}
   }
}
public class InstanceofMainMethod 
{
	public static void main(String[] args) 
	{
		 Loginpage lp=new  Loginpage();
		 Customer c=new Customer();
		 lp.login(c);
		 System.out.println("______________________________________________");
		 Admin a=new Admin();
		 lp.login(a);
	}

}
