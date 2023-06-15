package com.java.abstract1;
abstract class Sample
{
public abstract void text();
public abstract void count();
}
class Demo extends Sample
{
	@Override	
public void text()
{
	System.out.println("text abstract is ovrriden");
}
	@Override
public void count()
{
		System.out.println("count abstract is ovrriden");
}
}
public class SampleMainclass
{
public static void main(String[] args) 
	{
		Demo d1=new Demo();
		d1.text();
		d1.count();
	}

}
