package com.TimeAndDateApp2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CompleteWebtable {

	public static void main(String[] args) {
		String url="https://www.timeanddate.com/worldclock/";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shaik Zubair\\Desktop\\SeleniumTesting\\ShaikJava\\DriverFiles\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get(url);

		///htmlbody/div[1]/div[6]/section[1]/div/section/div[1]//tdivable/tbody/tr[1]/td[1]/a
		///html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[35]/td[7]/a
		//<a href="/worldclock/ghana/accra">Accra</a>

		
		///html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
		///html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[8]
		String part1="/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[";
		String part2="]/td[";
		String part3="]";
		for(int i=1;i<=36;i++)
        {
        	for(int j=1;j<=8;j++)
	       {
	
		WebElement ElementData=driver.findElement(By.xpath(part1+i+part2+j+part3));
		String data=ElementData.getText();
		System.out.print(data+"");
	}
	System.out.println();

        
	}
}
}
