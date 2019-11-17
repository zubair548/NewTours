package com.JavaPr1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser_pr1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver","./DriverFiles/geckodriver.exe");
		FirefoxDriver firefox=new FirefoxDriver();
		
		System.setProperty("webdriver.ie.driver","./DriverFiles/IEDriverServer.exe");
		InternetExplorerDriver iebrowser=new InternetExplorerDriver();
		
	
			driver.quit();
			

		
	}

}

