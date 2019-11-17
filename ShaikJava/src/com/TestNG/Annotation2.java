package com.TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation2 {
	@BeforeTest
	public void GmailLaunch()
	{
		System.out.println("testing gmail launch");
	}
	
	@Test(priority=1)
	public void LoginGmail()
	{
	System.out.println("Testing login functionlity");
	}
	@Test(enabled=false)
	public void InBox()
	{
		System.out.println("testing Inbox functionality");
	}
	@Test(priority=2)
	public void ComposeMail() 
	{
		System.out.println("testing ComposeMail functionality");
	}
	@AfterTest
	public void GmailApplicationclose()
	{
		System.out.println("Testing Application close functionality");
	}

}
