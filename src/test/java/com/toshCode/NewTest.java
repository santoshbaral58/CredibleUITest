package com.toshCode;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.Window;

public class NewTest {
  @Test
  public void f() throws InterruptedException {
	  //Setting the system to locate the chromedriver.exe file inside the given folder. 
	  System.setProperty("webdriver.chrome.driver", "/Users/santosh/Documents/workspace/FirstRepositorySantosh/chromedriver");
	  
	  // Creating an driver object
	  WebDriver driver = new ChromeDriver();
	  
	  //Navigating to credible Website
	  driver.get("http://www.credible.com");
	  
	  //Maximizing the window
	  driver.manage().window().maximize();
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  //Clicking on the personal loans tab
	  driver.findElement(By.xpath(".//*[@class='tab-personal']")).click();
	  
	  //Inputing some value in the loan amount text box
	  driver.findElement(By.xpath(".//*[@id='c77_loan_amount']")).sendKeys("15000");
	  
	  //Clicking on find my rate
	  driver.findElement(By.xpath(".//*[@id='find-my-rate-form']/div/button[1]")).click();
	  
	  //Creating a variable to store personal loan text  
	  WebElement PersonalLoanTitle = driver.findElement(By.xpath(".//*[@class='form-title col-sm-12 col-md-7']"));
	  
	  //Asset that the value is "Personal Loan"
	  Assert.assertEquals("Personal Loan Request", PersonalLoanTitle.getText());
	  
	  //Adding time for Elements to load, sometimes throws element not found error otherwise. 
	  Thread.sleep(1000);
	
	  // Selecting the loan purpose. Created a List to store all the WebElement inside the drop down menu
	  // and selected the need one by using the index value  
	  driver.findElement(By.xpath(".//*[@id='select2-chosen-1']")).click();
	    
	  List<WebElement> LoanPurposeList = driver.findElements(By.xpath("//*[starts-with(@id,'select2-result-label')]"));
	  
	  LoanPurposeList.get(5).click();
	  
	  //selecting the current employment status. Did the same thing with the drop down menu as above.	 
	  driver.findElement(By.xpath(".//*[@id='select2-chosen-2']")).click();
	  
	  List<WebElement> CurrentEmploymentStatusList = driver.findElements(By.xpath("//*[starts-with(@id,'select2-result-label')]"));
	  
	  CurrentEmploymentStatusList.get(2).click();
	  
	  //selecting dob
	  driver.findElement(By.name("borrower_dob")).sendKeys("05/08/1989");
	  
	  
	  //Entering annual income and verify the tooltip-text
	  driver.findElement(By.name("employment_income_yearly")).sendKeys("30000");
	  String toolTipText = driver.findElement(By.xpath(".//*[@id='form-step']/div/div[1]/div/fieldset/div[5]/div/div/span[1]")).getText();
	  Assert.assertEquals("What should I include?",toolTipText);
	  
	  //selecting the estimated credit score. Did the same thing with the drop down menu as above.	 
	  driver.findElement(By.xpath(".//*[@id='select2-chosen-3']")).click();
	  
	  List<WebElement> EstimatedCreditScoreList = driver.findElements(By.xpath("//*[starts-with(@id,'select2-result-label')]"));
	  
	  EstimatedCreditScoreList.get(0).click();
	  
	  // Clicking the Continue button
	  driver.findElement(By.xpath(".//*[@id='form-step']/div/div[1]/div/fieldset/div[7]/div/button")).click();
	  
	  //Adding time for Elements to load, sometimes throws element not found error otherwise. 
	  Thread.sleep(2000);
	  
	  
	  //Entering First name
	  driver.findElement(By.name("borrower_first_name")).sendKeys("James");
	  
	  // Entering Last name
	  driver.findElement(By.name("borrower_last_name")).sendKeys("Bond");
	  
	  //Entering Primary Phone number
	  driver.findElement(By.name("borrower_phone")).sendKeys("6543212222");
	  
	  //Entering Housing status. Used same technique for the drop down.
	  driver.findElement(By.xpath(".//*[@id='select2-chosen-4']")).click();
	  
	  List<WebElement> HousingStatusList = driver.findElements(By.xpath("//*[starts-with(@id,'select2-result-label')]"));
	  
	  HousingStatusList.get(0).click();
	  
	  //Entering Permanent address
	  driver.findElement(By.name("current_address_full_address")).sendKeys("600 Showers Drive");
	  	//Waiting for the suggested address to pop up
	  	Thread.sleep(2000);
	  	//Clicking on the suggested address.
	  	List<WebElement> AddressSuggestedList = driver.findElements(By.className("pac-item"));
	  	
	  	System.out.println(AddressSuggestedList);
		  
	  	AddressSuggestedList.get(0).click();
	  
	  //Entering Citizenship status and used similar technique for drop down
	  driver.findElement(By.xpath(".//*[@id='select2-chosen-6']")).click();
	  
	  List<WebElement> CitizenshipStatusList = driver.findElements(By.xpath("//*[starts-with(@id,'select2-result-label')]"));
	  
	  CitizenshipStatusList.get(0).click();
	  
	  //Entering social Security Number
	  driver.findElement(By.name("borrower_ssn")).sendKeys("663214566");
	  
	  //Entering Email address
	  driver.findElement(By.name("email")).sendKeys("suntos31@yahoo.com");
	  
	  //Waiting for the password to pop up
	  Thread.sleep(2000);
	  
	  //Entering the password
	  driver.findElement(By.name("password")).sendKeys("Santuman27");
	  
	  //Waiting for the
	  
	  //Clicking on Agree and Find My Rates
	  driver.findElement(By.xpath(".//*[@id='form-step']/div/div[2]/div/fieldset/div[9]/div[1]/div/div/button")).click();
	  
	  
  }
}
