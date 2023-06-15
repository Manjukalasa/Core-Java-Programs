package com.java.constructoroverloading;
public class Employee {
	    String Ename;
	    int Eid;
	    double Esal;
	    int exp;
	    
	    public Employee( String Ename,int Eid,double Esal,int exp)
	    {
	    	this.Ename=Ename;  //yash      //this.name(global)="yash"(local);
	    	this.Eid=Eid;      //101
	    	this.Esal=Esal;    //40000.0
	    	this.exp=exp;
	    }
	    public Employee( String Ename,int Eid,double Esal)
	    {
	    	this.Ename=Ename;  //manju
	    	this.Eid=Eid;      //102
	    	this.Esal=Esal;    //40000.0
	    }
	    public void showemployeedetails()
	    {
	    	System.out.println(Ename);
	    	System.out.println(Eid);
	    	System.out.println(Esal);
	    	System.out.println(exp);
	    }	 
	    public static void main(String[] args)
		{
	     	Employee e1=new Employee("yash",101,40000.0,2);
	    	e1.showemployeedetails();
	     	System.out.println("------------------------------------");
	    	Employee e2=new Employee("manju",102,45000);
	     	e2.showemployeedetails();
		}
}
