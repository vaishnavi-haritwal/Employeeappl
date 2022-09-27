package com.lnw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
 
public class NewTest {
 
  WebDriver driver;
 
 @Test (priority=1)
  public void openBrowser() {   
      
      System.setProperty("webdriver.chrome.driver", "C:/Chrome_driver/chromedriver.exe");
      System.out.println("Priority  - 1");
      driver = new ChromeDriver();
      driver.get("http://localhost:8082/TestApp-0.0.1-SNAPSHOT/");
      System.out.println("SETTING CHROMEDRIVER");
  }        
 
 @Test (priority=2)        
  public void launchGoogle() {
 
     System.out.println("Priority - 2");
      driver.get("http://localhost:8082/TestApp-0.0.1-SNAPSHOT/");                        
  }        
 
 @Test (priority=3)        
  public void peformSeachAndClick1stLink() {
 
     System.out.println("Priority - 3");
      WebElement element = driver.findElement(By.xpath(".//*[@name='uname']"));
      element.sendKeys("Vaishnavi");
      element.submit();
  }  
//Method 4: Verify Google search page title.            
@Test (priority=4)        
public void LoginPageTitleVerification() throws Exception {

   System.out.println("Priority - 4");

   Assert.assertEquals(driver.getTitle().contains("Demo"), true);
    driver.close();
}
}

