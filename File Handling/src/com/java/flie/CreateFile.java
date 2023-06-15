package com.java.flie;

import java.io.File;
public class CreateFile {

	public static void main(String[] args) 
	{
	   //File f= new File("E:/bike.pdf");
		File f= new File("E:/bike.txt");
		try {
			boolean result = f.createNewFile();
			System.out.println(result);
			//System.out.println( f.createNewFile());
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}