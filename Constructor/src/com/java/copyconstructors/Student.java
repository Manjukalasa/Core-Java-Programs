package com.java.copyconstructors;
public class Student 
{
	int id;
 String name;
public Student(int id,String string)
{
	this.id=id;
	this.name=string;
}
public Student()
{
}
public void display()
{
	System.out.println(id+" "+name);
}
	public static void main(String[] args) {
	
		Student s1=new Student(16,"manju");
		Student s2=new Student();
		s2.id=s1.id;
		s2.name=s1.name;
		s1.display();
		s2.display();
	}
}
