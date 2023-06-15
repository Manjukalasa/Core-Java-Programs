package com.java.foreachloop;
// fine length of arrag without using length variable
public class FindLengthArray
{
public static void main(String[] args) 
{
	int l=0;
int[]num= {1,2,3,4,5,6,7};
  for(int n:num)
  {
	  l++;
  }
  System.out.println(l);
}
}
