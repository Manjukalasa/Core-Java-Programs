package com.java.map;

import java.util.Comparator;

public class CustomerSortBasedOnName implements Comparator<CustomerObjects>
{

//	@Override
//	public int compare(CustomerObjects o1, CustomerObjects o2) {
//		return o1.getName().compareTo(o2.getName());
//	}
	
	@Override
	public int compare(CustomerObjects o1, CustomerObjects o2) {
		return o1.getId()-o2.getId();
	}

}
