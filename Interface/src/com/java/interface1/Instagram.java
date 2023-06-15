package com.java.interface1;
interface PhotoEdit                   
{                     
	public void filters();
	public void resize();
}
interface Post                    
{                   
	public void like();
	public void comments();
	public void share();
}
interface VideoEdit                   
{                   
	public void videofilter();
	public void mute();
	public void addsong();
}
class Photo implements PhotoEdit,Post                           
{         
	int reso=3000;
	public void size()
	{
		System.out.println("Reduce photo size");
	}
	public void quality()
	{
		System.out.println("Reduce photo Quality");
	}
	public void filters()
	{
		System.out.println("add filter");	
	}
	public void resize()
	{
		System.out.println("resize photo");	
	}
	public void like()
	{
		System.out.println("like photp");	
	}
	public void comments()
	{
		System.out.println("Comments photp");	
	}
	public void share()
	{
		System.out.println("Share photp");	
	}
	
}
class Video implements VideoEdit,Post                           
{         
	int duration=120;
	public void size()
	{
		System.out.println("reduce video size");
	}
	public void trime()
	{
		System.out.println("trime video");
	}
	public void videofilter()
	{
		System.out.println("edit video");	
	}
	public void mute()
	{
		System.out.println("mute video");	
	}
	public void addsong()
	{
		System.out.println("Add song");	
	}
	public void like()
	{
		System.out.println("like video");	
	}
	public void comments()
	{
		System.out.println("Comment video");	
	}
	public void share()
	{
		System.out.println("Share video");	
	}
	
}
public class Instagram 
{	
	public static void main(String[] args)
	{
	 Photo p1=new Photo();
	 System.out.println("Instagram Photo Features");
	 System.out.println("----------------------------");
	 System.out.println(p1.reso);
	 p1.size();
	 p1.quality();
	 p1.filters();
	 p1.resize();
	 p1.like();
	 p1.comments();
	 p1.share();
	 System.out.println("__________________________________________________________________");
	 Video v1=new Video();
	 System.out.println("Instagram Video Features");
	 System.out.println("----------------------------");
	 System.out.println(v1.duration);
	 v1.size();
	 v1.trime();
	 v1.videofilter();
	 v1.mute();
	 v1.addsong();
	 v1.like();
	 v1.comments();
	 v1.share();
	}

}