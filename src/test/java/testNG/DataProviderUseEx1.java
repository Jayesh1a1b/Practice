package testNG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class DataProviderUseEx1 {
  @Test(dataProvider = "dp")
  public void verifyLoginThree(String username,String password) 
  {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver =new ChromeDriver();
	  driver.get("http://www.tutorialsninja.com/demo/");
	  driver.manage().window().maximize();
	 
	  driver.findElement(By.xpath("//span[text()='My Account']")).click();
	  driver.findElement(By.xpath("//a[text()='Login']")).click();
	  driver.findElement(By.id("input-email")).sendKeys(username); 
	  driver.findElement(By.id("input-password")).sendKeys(password);
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
	 // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
	  driver.close();
	  
  }

  @DataProvider
  public String[][] dp() 
  {
   String [][]Data= { {"amotooricap1@gmail.com","12345"},{"amotooricap9@gmail.com","12345"},{"amotooricap3@gmail.com","12345"}};
   return Data;
	  
  }
}
