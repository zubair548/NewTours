package com.DataDriven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {


WebDriver driver = null;
String url="http://newtours.demoaut.com";

@BeforeTest
public void setUp() throws InterruptedException
{



System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
driver = new ChromeDriver();

driver.get(url);

driver.manage().window().maximize();
}

// Thread.sleep(20000);

@AfterTest
public void tearDown()
{
driver.quit();
}

}


