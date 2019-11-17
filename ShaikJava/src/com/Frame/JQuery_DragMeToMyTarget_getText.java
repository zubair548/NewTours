package com.Frame;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JQuery_DragMeToMyTarget_getText {

	public static void main(String[] args) {
	WebDriver driver=null;
	String url ="https://Jqueryui.com/droppable";
	System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	
	driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	WebElement dragMeToMytargetElement=driver.findElement(By.id("draggable"));
	WebElement dropHereElement=driver.findElement(By.id("droppable"));
	
	//String dragMeToMyTargetElement_Text=dragMeToMytargetElement.getText();
	//System.out.println("the Text of an element:"+dragMeToMyTargetElement_Text);
	//driver.quit();
	//drag and drop operation
	Actions action=new Actions(driver);
	//source element, target element
	action.dragAndDrop(dragMeToMytargetElement,dropHereElement).perform();
	driver.switchTo().defaultContent();
	WebElement resizable=driver.findElement(By.linkText("Resizable"));
	resizable.click();
	System.out.println("The title of Resizable webpage is :"+driver.getTitle());
	driver.quit();
	}
	
}

