package com.java.abstract1;
class FaceBook
{
	public void login()
	{
		System.out.println("emaill-id And Password");
	}
	public void logout()
	{
		System.out.println("button");
	}
}
class web extends FaceBook
{
	
}
class App extends FaceBook
{
	
}
public class FaceBookMainclass
{
	public static void main(String[] args)
{		
 App a1=new App();
 a1.login();
 a1.logout();
 System.out.println("_____________________________");
 web b1=new web();
 b1.login();
 b1.logout();
}
}
