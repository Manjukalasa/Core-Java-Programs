package com.java.flie;

import java.io.*;
public class CopyDataOneFileToAnotherFile
{
	public static void main(String[] args) 
	{
		File f=new File("student.txt");
		FileInputStream r=null;
		FileOutputStream w=null;
		try 
		{
			r=new FileInputStream(f);
		    w=new FileOutputStream("manju123.txt");
				int i=0;
				while((i=r.read())!=-1)
				{
					w.write((char)i);
					w.flush();
				}
				System.out.println("Data copied Successfully....");	
		}
		catch (Exception e)
		{
			System.out.println("file does not exists");
		}
		finally
		{
			try {
				r.close();
				w.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
