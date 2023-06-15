package com.java.flie;

import java.io.File;

public class RenameFolder_File1 {

	public static void main(String[] args) 
	{
         File f1= new File("E:/bike1.txt");
         File f2= new File("E:/bike1.pdf");
         if(f1.exists())
         {
         System.out.println(f1.renameTo(f2));
	     }
         else
         {
        	 System.out.println("file not exixts");
         }
	}
}