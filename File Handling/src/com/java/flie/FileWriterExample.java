package com.java.flie;

import java.io.*;

public class FileWriterExample
{
	public static void main(String[] args) 
	{
		File f=new File("student.txt");
		FileWriter fw=null;
		try 
		{
			fw=new FileWriter(f);
			fw.write("i am manjunath B K...!");
			fw.flush();
			System.out.println("Succesfully Data wrote in File");
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				fw.close();
		    }
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}

	}
}
