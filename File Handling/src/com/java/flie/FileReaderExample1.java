package com.java.flie;

import java.io.*;
public class FileReaderExample1
{
	public static void main(String[] args) throws Exception 
	{
		File f=new File("employee.txt");
		FileReader fr=new FileReader(f);
			int ch=0;
			while((ch=fr.read())!=-1)
			{
				System.out.print((char)ch);
            }
			fr.close();
	}
}
