package com.java.map;
import java.util.*;
public class CustomerObjectsTreeMapExample 
{
	public static void main(String[] args) 
	{
		CustomerObjects c1=new CustomerObjects("manju",101,"manj123",7795543450l);
		CustomerObjects c2=new CustomerObjects("kalsa",102,"manj456",123466789l);
		CustomerObjects c3=new CustomerObjects("abc",103,"manj789",524613522l);
		
		CustomerSortBasedOnName c =new CustomerSortBasedOnName();
		TreeMap<CustomerObjects,String> map=new TreeMap<CustomerObjects,String>(c); //  custamized sorting
		map.put(c3,"Hi");
		map.put(c1,"xyz");
		map.put(c2,"pqr");
		System.out.println(map);

	}
}
