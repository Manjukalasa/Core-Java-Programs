package com.java.employee;

public class Employee 
{
    String Ename="manju";
    int Eid=16147;
    double Esal=45000.0;
    String des="software developer";
    static String company="TCS";
    public void showemployeedetails()
    {
    	System.out.println(Ename);
    	System.out.println(Eid);
    	System.out.println(Esal);
    	System.out.println(des);
    }
    public void updatesalary(double newsal)
    {
        Esal=Esal+newsal;
    	System.out.println("udated salary= "+Esal);	
    }
    public static void CompanyName()
    {
    	System.out.println(company);	
    }
    public static void main(String[] args)
	{
		 Employee Em=new Employee();
		 Em.showemployeedetails();
		 CompanyName();
		 Em.updatesalary(2000);
		}
}
