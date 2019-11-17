package com.LinksTesting;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTours_LoginPage_LinksCount {

	public static void main(String[] args) {
	WebDriver driver=null;
	String url="http://networks.demoaut.com";
	System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(url);
List <WebElement>newToursLoginPageLinks=driver.findElements(By.tagName("a"));
	int LinksCount=newToursLoginPageLinks.size();
	System.out.println("The total number of links on the newToursLoginPage is:"+LinksCount);
	driver.quit();
	
	
	}

}
