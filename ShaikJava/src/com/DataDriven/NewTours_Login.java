package com.DataDriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTours_Login extends BaseClass{
	WebDriver driver = null;
	
	/*WebDriver driver = null;
	String url="http://newtours.demoaut.com";

	@BeforeTest()
	public void setUp() throws InterruptedException
	{

	System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
	driver = new ChromeDriver();

	driver.get(url);
	driver.manage().window().maximize();
	}*/
@Test()
public void Login() throws IOException
{
FileInputStream file = new FileInputStream("./src/com/ApplicationTestDatafiles/resultdata1.xlsx");
XSSFWorkbook workBook = new XSSFWorkbook(file);
XSSFSheet sheet = workBook.getSheet("Sheet1");

int rowCount=sheet.getLastRowNum(); // identifying the rows with Test Data

for(int i=1;i<=rowCount;i++) // to run for all the active rows with the test data
{

// going to a particular Row
Row row=sheet.getRow(i);

driver.findElement(By.name("userName")).clear();
driver.findElement(By.name("userName")).sendKeys(row.getCell(0).getStringCellValue());


// <input type="password" name="password" size="10">
driver.findElement(By.name("password")).clear();
driver.findElement(By.name("password")).sendKeys(row.getCell(1).getStringCellValue());

// <input type="image" name="login" >

driver.findElement(By.name("login")).click();

String expected_HomePageTitle="Find";
System.out.println(" The expected HomePage Title is : "+expected_HomePageTitle);

String actual_WebPageTitle=driver.getTitle();
System.out.println(" The actual Title of the Webpage is : "+actual_WebPageTitle);

if(actual_WebPageTitle.contains(expected_HomePageTitle))
{
System.out.println(" LogIn Successfull - PASS");
row.createCell(2).setCellValue("LogIn Successfull - PASS");
}
else
{
System.out.println(" LogIn Failed - FAIL");
row.createCell(2).setCellValue("LogIn Failed - FAIL");
}

FileOutputStream file1 = new FileOutputStream("./src/com/ApplicationTestResultFiles/NewTours_LogInTestResult1.xlsx");
workBook.write(file1);

driver.navigate().back();


//driver.navigate().refresh();
}  
}

/*@AfterTest
public void tearDown()
{
driver.quit();
}*/
	
}

	
	

