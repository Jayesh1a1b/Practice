package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderStudy {
  @Test
  public void verifyLoginOne() 
  {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver =new ChromeDriver();
	  driver.get("http://www.tutorialsninja.com/demo/");
	  driver.manage().window().maximize();
	 
	  driver.findElement(By.xpath("//span[text()='My Account']")).click();
	  driver.findElement(By.xpath("//a[text()='Login']")).click();
	  driver.findElement(By.id("input-email")).sendKeys("amotooricap9@gmail.com");//for practice purpose  fail these test case by providing wrong mail 
	  driver.findElement(By.id("input-password")).sendKeys("12345");
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
	  driver.close();
	  
  }
  @Test
  public void verifyLoginTwo() 
  {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver =new ChromeDriver();
	  driver.get("http://www.tutorialsninja.com/demo/");
	  driver.manage().window().maximize();
	 
	  driver.findElement(By.xpath("//span[text()='My Account']")).click();
	  driver.findElement(By.xpath("//a[text()='Login']")).click();
	  driver.findElement(By.id("input-email")).sendKeys("amotooricap2@gmail.com");//for practice purpose  fail these test case by providing wrong mail 
	  driver.findElement(By.id("input-password")).sendKeys("12345");
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
	  driver.close();
	  
  }
  @Test
  public void verifyLoginThree() 
  {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver =new ChromeDriver();
	  driver.get("http://www.tutorialsninja.com/demo/");
	  driver.manage().window().maximize();
	 
	  driver.findElement(By.xpath("//span[text()='My Account']")).click();
	  driver.findElement(By.xpath("//a[text()='Login']")).click();
	  driver.findElement(By.id("input-email")).sendKeys("amotooricap1@gmail.com");//for practice purpose  fail these test case by providing wrong mail 
	  driver.findElement(By.id("input-password")).sendKeys("12345");
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
	  driver.close();
	  
  }
  
  
}
