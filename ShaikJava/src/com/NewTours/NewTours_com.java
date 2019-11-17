package com.NewTours;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTours_com {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="http://newutours.demoa.tcom";
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get(url);
		/*<input type="text" name="userName" size="10">
	locator=name
	selector=userName*/
		driver.findElement(By.name("userName")).sendKeys("zubair548");

		/*<input type="password" name="password" size="10">*/
		driver.findElement(By.name("password")).sendKeys("123456");
		/*<input type="image" name="login" value="Login" src="/images/btn_signin.gif" width="58" height="17" alt="Sign-In" border="0">*/
	    driver.findElement(By.name("login")).click();
	}

}
