package com.java.flie;

import java.io.File;

public class RenameFolder_File {

	public static void main(String[] args) 
	{
         File f1= new File("E:/bike.txt");
         File f2= new File("E:/NSbike.txt");
         System.out.println(f1.renameTo(f2));
	}
}