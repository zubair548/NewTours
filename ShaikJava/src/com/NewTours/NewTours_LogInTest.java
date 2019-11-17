package com.NewTours;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTours_LogInTest {

	public static void main(String[] args) {
	String url="http:\\newtours.demoaut.com";
	System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get(url);
	
	driver.findElement(By.name("userName")).sendKeys("tutorial");
	driver.findElement(By.name("password")).sendKeys("tutorial");
	driver.findElement(By.name("login")).click();
	
	String expected_HomePagetitle="Find";
	System.out.println("The expected HomePageTitle is:"+expected_HomePagetitle);
	String actual_WebPageTitle=driver.getTitle();
	System.out.println("The actaual Title of the WebPage is:"+actual_WebPageTitle);
	
	if(actual_WebPageTitle.contains(expected_HomePagetitle))
	{
		System.out.println("LoginSucessful-Pass");
	}
	else
	{
		System.out.println("LoginFailed-Fail");
	}
	driver.quit();
	}
}


