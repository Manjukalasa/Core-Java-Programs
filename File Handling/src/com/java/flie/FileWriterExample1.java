package com.java.flie;

import java.io.File;
import java.io.FileWriter;
public class FileWriterExample1
{
	public static void main(String[] args) throws Exception 
	{
		File f=new File("employee.txt");
		FileWriter fw=new FileWriter(f,true);// appenf=true(by default append is false)
			fw.write(" after using True in constructer(program is concatinated)");
			fw.flush();
			System.out.println("Succesfully Data wrote in File");
     		fw.close();

	}
}
