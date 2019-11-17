package com.KeyBoardOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Facebook_Login {

	public static void main(String[] args) {
		WebDriver driver=null;
		String url="http://facebook.com";
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("mateenahmed599@gmail.com");
	 Actions action = new Actions(driver);
	 action.sendKeys(Keys.TAB).perform();
	 action.sendKeys("hellotesting").perform();
	 action.sendKeys(Keys.ENTER).perform();
	 

	}

}
