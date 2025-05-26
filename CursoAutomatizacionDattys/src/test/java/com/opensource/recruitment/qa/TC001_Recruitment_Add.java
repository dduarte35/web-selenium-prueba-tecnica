package com.opensource.recruitment.qa;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class TC001_Recruitment_Add {
 
  @BeforeTest
  public void beforeTest() {
  }

  @Test
  public void TC001_Recruitment_Add_TC() {
	  
	  System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();	 
	 	  
	  //Step1 - Open Browser "OrangeHRM" web page
	  Reporter.log("Open Browser \"OrangeHRM\" web page");
	   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	   driver.manage().window().maximize();	
	   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	   
	  //Step2 - Enter User and Password
	  Reporter.log("Enter User and Password");
	   driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	   driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	   driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	      
	  //Step3 - Click Recruitment 
	  Reporter.log("Click Recruitment");
	   driver.findElement(By.xpath("//span[normalize-space()='Recruitment']")).click();
	   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	   
	  //Step4 - Click Add 
	  Reporter.log("Click Add");
	   driver.findElement(By.xpath("//i[@class='oxd-icon bi-plus oxd-button-icon']")).click();
	   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	   
	  //Step5 - Complete Information in the form fields
	  Reporter.log("Complete Information in the form fields");
	  driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Juan");
	  driver.findElement(By.xpath("//input[@placeholder='Middle Name']")).sendKeys("Carlos");
	  driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Alvarado");
      driver.findElement(By.xpath(" (//input[@placeholder='Type here'])[1]")).sendKeys("juan@hotmail.com");
	  driver.findElement(By.xpath(" (//input[@placeholder='Type here'])[2]")).sendKeys("123456");
	  
	  Select menuvacancy = new Select((WebElement) driver.findElements(ById.id("menuvacancy")));
	  menuvacancy.selectByVisibleText("Senior QA Lead");	  
	  
	  
	  File file = new File ("./src/test/resources/archivo/archivo.pdf");
	  String path = file.getAbsolutePath();
	  driver.findElement(By.xpath("//div[@class='oxd-file-input-div']")).sendKeys(path);
	  
	  driver.findElement(By.xpath("(//input[@placeholder='Enter comma seperated words...'])[1]")).sendKeys("prueba");
	  
}
                                                             
  @AfterTest
  public void afterTest() {
  }

}
