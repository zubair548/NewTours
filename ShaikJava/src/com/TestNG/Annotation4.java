package com.TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation4 {
@BeforeTest()
public void gmail()
{
	System.out.println("launch google browser ");
}
@Test(priority=1)
public void InBox()
{
	System.out.println("test inbox functionality");
}
@Test(priority=3)
public void Compose()
{
	System.out.println("test compose mail functionality");
}
@Test(priority=2)
public void sent()
{
	System.out.println("test sent mail functionality");
}

@AfterTest()
public void Close()
{
	System.out.println("logout gmail");
}
}
