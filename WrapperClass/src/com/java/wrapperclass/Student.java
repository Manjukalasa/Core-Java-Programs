package com.java.wrapperclass;

public class Student
{
int i;
public Student(int i) 
{
	this.i = i;
}

public int getI() {
	return i;
}

public void setI(int i) 
{
	this.i = i;
}
@Override
public String toString()  
{
	return ""+i;	
}
public static void main(String[] args)
{
  Student s1=new Student(60);
  System.out.println(s1.getI());
  System.out.println(s1);
  s1.setI(70);
  System.out.println(s1);
}
}
