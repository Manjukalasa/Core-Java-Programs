package com.java.sample1;

import com.java.sample.Sample;
public class MainSample2
{
	public static void main(String[] args) 
	{
	//com.java.sample.Sample s1=new com.java.sample.Sample();
     System.out.println(Sample.a); // using import statement
    // com.java.sample.Sample.check();  //using fully qualified class name
         Sample.check();
	}

}