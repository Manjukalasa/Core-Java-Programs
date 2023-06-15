package com.java.flie;
import java.io.*;
public class FileReaderExample
{
	public static void main(String[] args) 
	{
		File f=new File("student.txt");
		try
		{
			FileReader fr=new FileReader(f);
//			int ch=fr.read();
//			while((ch!=-1)
//			{
//				System.out.print((char)ch);
//			}
			int ch=fr.read();
			while( ch!=-1)
			{
				System.out.print((char)ch);
				ch=fr.read();
			}			
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		catch (Exception e)
		{
			e.printStackTrace();
        }
	}
}
