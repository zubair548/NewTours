package com.BrowserAutomation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser {

	public static void main(String[] args) {

		//chrome automation
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
	     ChromeDriver chrome=new ChromeDriver();
	     
	     //Firefox Browser
	     System.setProperty("webdriver.gecko.driver","./DriverFiles/geckodriver.exe");
          FirefoxDriver firefox=new FirefoxDriver();
          
       //Internet Explorer Browser
          System.setProperty("webdriver.ie.driver", "./DriverFiles/IEDriverServer.exe");
          InternetExplorerDriver ieBrowser=new InternetExplorerDriver();
          //Edge Browser
          System.setProperty("webdriver.edge.driver", "./DriverFiles/MicrosoftWebDriver.exe");
          EdgeDriver egde=new EdgeDriver();
	}

}