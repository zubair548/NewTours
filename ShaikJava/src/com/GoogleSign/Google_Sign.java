package com.GoogleSign;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Sign {

	public static void main(String[] args) {
		String url="http:\\google.com";
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get(url);
		//driver.findElement(By.linkText("Sign in")).click();
WebElement Signin=driver.findElement(By.id("gb_70"));
Signin.click();
driver.findElement(By.id("identifierId")).sendKeys("szubair@lords.ac.in");

driver.findElementByClassName("CwaK9").click();
driver.findElementByClassName("CwaK9").sendKeys("");
driver.findElementByClassName("CwaK9").click();

	
	}

}
