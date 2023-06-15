package com.java.stringclass;
public class StringProgram 
{
	public static void main(String[] args)
	{
     String s1="hello";
     String s2="HELLO";
    
     System.out.println(s1.length());
     System.out.println("----------------------------------------------"); 
     System.out.println(s1.charAt(0));//charAt(1)-->e
     System.out.println(s1.charAt(1));
     System.out.println("----------------------------------------------");
     System.out.println(s1.indexOf('h'));  
     System.out.println(s1.indexOf('l'));// it will also take same index value-->2
     System.out.println(s1.indexOf('m'));
     System.out.println("----------------------------------------------");
     System.out.println(s1.indexOf('l',3));
     System.out.println("----------------------------------------------");
     System.out.println(s1.equals(s2));
     System.out.println("----------------------------------------------");
     System.out.println(s1.equalsIgnoreCase(s2));
     System.out.println("----------------------------------------------");
     System.out.println(s1.substring(0,5));
     System.out.println(s1.substring(1,5));
     System.out.println(s1.substring(0,3));
	}

}
