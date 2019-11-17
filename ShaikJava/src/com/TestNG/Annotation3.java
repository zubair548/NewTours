package com.TestNG;

import org.testng.annotations.Test;

public class Annotation3 {

@Test(priority=1)
public void facebook()
{
	System.out.println("launch google application");
}
@Test(priority=2)
public void url()

{
	System.out.println("enter url:facebook.com");
	
}
@Test(priority=3)
public void login()

{
	System.out.println("login into fb");
}
@Test(priority=4)
public void register()

{
	System.out.println("register into fb");
}
@Test(priority=5)
public void logout()

{
	System.out.println("logout into fb");
}
}
