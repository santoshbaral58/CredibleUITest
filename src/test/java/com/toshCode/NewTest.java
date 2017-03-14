package com.toshCode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "/Users/santosh/Documents/workspace/FirstRepositorySantosh/chromedriver");
	  
	  
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://www.credible.com");
	  driver.manage().window().maximize();
	  
  }
}
