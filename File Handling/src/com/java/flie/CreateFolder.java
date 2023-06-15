package com.java.flie;

import java.io.File;

public class CreateFolder {

	public static void main(String[] args) 
	{
      // File f= new File("manju");  // it is creating within project(project name folder)
		
         File f= new File("E:/manju"); //it is craete within E drive
         // path taking ways--> / and \
      // File f= new File("E:/manju photos/manju");
	  // File f= new File("E://manju photos//manju");
      // File f= new File("E:\\Manju photos\\manju");
    boolean result=f.mkdir();
    System.out.println(result);
	}
}