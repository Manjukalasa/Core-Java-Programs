package com.java.constructors;

public class Employee 
{
	    String Ename;
	    int Eid;
	    double Esal;
	    static String company="TCS";
	    
	    public Employee( String Ename,int Eid,double Esal)
	    {
	    	this.Ename=Ename;  //yash      //this.Ename(global)="yash"(local); initialization local to global variable
	    	this.Eid=Eid;      //101
	    	this.Esal=Esal;    //40000.0
	    }
	    public static void CompanyName()
	    {
	    	System.out.println(company);	
	    }
	    public void showemployeedetails()
	    {
	    	System.out.println(Ename);
	    	System.out.println(Eid);
	    	System.out.println(Esal);
	    }
	    public void updatesalary(double newsal)
	    {
	        Esal=newsal;
	    	System.out.println("new salary "+Esal);	
	    }
	 
	    public static void main(String[] args)
		{
	     	Employee e1=new Employee("yash",101,40000.0);
	     	// e1.name="Yash";e1.Eid=101;e1.Esal=40000.0;    //normal Refference variable using 
	     	e1.showemployeedetails();
	     	e1.updatesalary(45000);
	     	CompanyName();
	     	System.out.println("------------------------------------");
	    	Employee e2=new Employee("manju",102,45000);
	     	e2.showemployeedetails();
	     	e2.updatesalary(50000);
	     	CompanyName();
		}
	}

