package com.Timeanddate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Time_Date_Application {

	public static void main(String[] args) {
          String url="https://www.timeanddate.com/worldclock/";
          System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shaik Zubair\\Desktop\\SeleniumTesting\\ShaikJava\\DriverFiles\\chromedriver.exe");
          ChromeDriver driver=new ChromeDriver();
          driver.get(url);
         // /html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]    
          ////html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]/a
          
          ///html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[1]/a
          ///html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[1]/a
          ////html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
          ///html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[1]
	String part1="/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[";
	String part2="]/td[1]";
	for(int i=1;i<=36;i++)
	{
		WebElement cityName=driver.findElement(By.xpath(part1+i+part2));
		String cityName1=cityName.getText();
		System.out.println(cityName1);
		
	}
	driver.quit();
	}
	
	
}
