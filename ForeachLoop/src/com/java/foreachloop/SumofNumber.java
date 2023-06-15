package com.java.foreachloop;
public class SumofNumber
{
public static void main(String[] args) 
{
	int sum=0;
   int[]num= {1,2,3,4,5};
  for(int n:num)
  {
	sum= sum+n;
  }
  System.out.println(sum);
}
}
