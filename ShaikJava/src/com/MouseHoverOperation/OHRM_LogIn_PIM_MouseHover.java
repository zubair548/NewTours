package com.MouseHoverOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OHRM_LogIn_PIM_MouseHover {

	public static void main(String[] args) {
		WebDriver driver =null;
		String url="https://opensource-demo.orangehrmlive.com/";
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		WebElement Username=driver.findElement(By.id("txtUsername"));
		Username.sendKeys("admin");
		WebElement Password=driver.findElement(By.name("txtPassword"));
		Password.sendKeys("admin123");
		WebElement LogIn=driver.findElement(By.id("btnLogin"));
		LogIn.click();
		WebElement pim=driver.findElement(By.id("menu_pim_viewPimModule"));
		Actions action=new Actions(driver);
		action.moveToElement(pim).perform();
		WebElement addEmployee=driver.findElement(By.id("menu_pim_addEmployee"));
		addEmployee.click();
		}

}
