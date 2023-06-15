package com.java.q9;
import java.util.TreeSet;
public class BookMainUsingCoparator
{
	public static void main(String[] args)
	{
		Book b1=new Book("one",100,2000);
		Book b2=new Book("two",102,2001);
		Book b3=new Book("tree",103,2005);

		sortBasedOnName s= new sortBasedOnName();
		TreeSet<Book> t =new TreeSet<Book>(s);
		t.add(b1);
		t.add(b2);
		t.add(b3);
		System.out.println(t);
		for(Book B:t)
		{
			System.out.println(B);
		}
	}
}