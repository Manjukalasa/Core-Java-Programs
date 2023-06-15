package com.java.stringclass;

public class StringAsArray
{
    public static void printarray(String[]a1)
    {
       for(int i=0;i<=a1.length-1;i++)
       {
           System.out.println(a1[i]);
       }
   }
   public static void main(String[] args)
    {
       String[]ar1={"m","a","n","j","u"};
       printarray(ar1);
   }
}