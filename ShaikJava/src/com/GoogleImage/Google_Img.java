package com.GoogleImage;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Img {

	public static void main(String[] args) {
		
		String url="http:\\google.com";
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get(url);
		driver.findElement(By.linkText("Images")).click();
		String ImagesonwebpageTitle=driver.getTitle();
		System.out.println("The title of the web element is :"+ImagesonwebpageTitle);
		driver.quit();

	 }

}
