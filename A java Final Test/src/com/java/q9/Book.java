package com.java.q9;
import java.util.Comparator;
public class Book
{
	private String Bookname;
	private int Bookid;
	private int year;

	public Book(String bookname, int bookid, int year) {
		this.Bookname = bookname;
		this.Bookid = bookid;
		this.year = year;
	}

	public String getBookname() {
		return Bookname;
	}

	public void setBookname(String bookname) {
		Bookname = bookname;
	}

	public int getBookid() {
		return Bookid;
	}

	public void setBookid(int bookid) {
		Bookid = bookid;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Book [Bookname=" + Bookname + ", Bookid=" + Bookid + ", year=" + year + "]";
	}
}
	class sortBasedOnName implements Comparator<Book>
	{
		@Override
		public int compare(Book o1, Book o2)    // using comparator-->@ compare()
		{
			return o1.getBookname().compareTo(o2.getBookname());   
		}
	}
