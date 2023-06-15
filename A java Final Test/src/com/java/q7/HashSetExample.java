package com.java.q7;

import java.util.*;

public class HashSetExample 
{
	public static void main(String[] args) 
	{
		HashSet<Object> h1 =new HashSet<Object>();
		h1.add("java");
		h1.add("sql");
		h1.add("spring");
		h1.add("Hidernate");
		h1.add("web");
		System.out.println(h1);
		LinkedList<Object> h2=new LinkedList<Object>(h1);
		System.out.println(h2.get(3));//index 
	}
}
