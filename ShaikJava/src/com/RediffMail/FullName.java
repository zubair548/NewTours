package com.RediffMail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FullName {

	public static void main(String[] args) {
   String url="https://mail.rediff.com/cgi-bin/login.cgi";
   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shaik Zubair\\Desktop\\SeleniumTesting\\ShaikJava\\DriverFiles\\chromedriver.exe");
   ChromeDriver driver=new ChromeDriver();
   driver.get(url);
   
/*  <a href="//register.rediff.com/register/register.php?FormName=user_details">Create a new account</a>
   // WebElement Createnewaccount=driver.findElement(By.LinkText("Create a new account");
    Createnewaccount.click();*/
    
    WebElement createAccount_link=driver.findElement(By.linkText("Create a new account"));
    createAccount_link.click();
  //*[@id="tblcrtac"]/tbody/tr[3]/td[3]/input
    /*WebElement FullName=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input"));
    
    FullName.sendKeys("Md zubair");
    
	*/
    
    //<input type="text" onblur="fieldTrack(this);" name="nameaabb51ea" value="" style="width:185px;" maxlength="61">
    
WebElement FullName=driver.findElement(By.xpath("//*[starts-with(@name,'name')]"));
    
    FullName.sendKeys("Md zubair");
    
    
	}

}
