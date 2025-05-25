package com.chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChromeTest {
 
  @BeforeTest
  public void beforeTest() {
  }

  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();	 
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().window().maximize();	
	  		
	  
  }
  
  @AfterTest
  public void afterTest() {
  }

}
