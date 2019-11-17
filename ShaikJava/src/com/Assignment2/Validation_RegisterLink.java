package com.Assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validation_RegisterLink {

	public static void main(String[] args) {
		String url="http:\\newtours.demoaut.com";
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		WebElement register=driver.findElement(By.linkText("REGISTER"));
		String registerElementtext=register.getText();
		System.out.println("The Text of the Element is:"+registerElementtext);
		String expected_registerUrlAddress=register.getAttribute("href");
		System.out.println("The Expected Url address of register Element is:expected_registerUrlAddress");
		register.click();
		String actual=driver.getCurrentUrl();
		System.out.println("the url of the register link newtours:"+actual);
		
	if(actual.equals(expected_registerUrlAddress))
	{
		System.out.println("Both is matched--pass");
	}
		System.out.println("fail");
		
		driver.quit();

	}

}
