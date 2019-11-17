package com.NavigateToApplication;

import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateTo_BingApplication {

	public static void main(String[] args) {
		//Automation Firefox browser
		System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
		FirefoxDriver firefox=new FirefoxDriver();
		/*firefox.get("http:\\bing.com");*/
		/*firefox.get("http:\\facebook.com");*/
		firefox.navigate().to("http:\\google.com");
		/*firefox.close();*/
		

	}

}
 