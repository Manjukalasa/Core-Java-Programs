package com.java.flie;

import java.io.File;
public class CheckFileExitsOrNoTAndDelete
{
	public static void main(String[] args) 
	{
         File f= new File("E:/bike.pdf");
		if(f.exists())
		{
			f.delete();  // it is deleted existed file/folder
			System.out.println("file/folder is deleted succefully");
		}
		else
		{
			System.out.println("file/folder is does not exists");
		}
	}
}