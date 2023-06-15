package com.java.flie;

import java.io.*;
import java.util.Date;
public class checkLastModification {

	public static void main(String[] args) 
	{
		File f=new File("E:/NSbike.txt");
        long milliseconds= f.lastModified();
        Date d=new Date(milliseconds);
        System.out.println(d);
        
      //  Date d=new Date(f.lastModified());
      //   System.out.println(d);
        
      //  System.out.println(new Date(f.lastModified()));
	}
}
