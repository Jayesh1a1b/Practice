package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Collections;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UsingPropertyFilesRegisteringAccount {
  @Test
  public void registeringAccount() throws IOException 
  {
	  Properties prop = new Properties();
	  FileInputStream fis=new FileInputStream("G:\\workspace\\ExtentReportDemoProject\\src\\Config1.properties");
	  prop.load(fis);
	  WebDriverManager.chromedriver().setup();
	  ChromeOptions options = new ChromeOptions();
	  options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
	  WebDriver driver=new ChromeDriver(options);
	  driver.get(prop.getProperty("url"));
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//span[text()='My Account']")).click();
	  driver.findElement(By.xpath("//a[text()='Register']")).click();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	  
	  driver.findElement(By.id("input-firstname")).sendKeys(prop.getProperty("FirstName"));
	  driver.findElement(By.id("input-lastname")).sendKeys(prop.getProperty("LastName"));
	  //driver.findElement(By.id("input-email")).sendKeys(prop.getProperty("E-Mail"));//in every time new mail id insert
	  driver.findElement(By.id("input-email")).sendKeys("jayesh"+getTimeStamp()+"@1a1b");// here dynamically accept email id and it is used for negative testing purpose
	  driver.findElement(By.id("input-telephone")).sendKeys(prop.getProperty("Telephone"));
	  driver.findElement(By.name("password")).sendKeys(prop.getProperty("password"));
	  driver.findElement(By.id("input-confirm")).sendKeys(prop.getProperty("PasswordConfirm"));
	  driver.findElement(By.name("agree")).click();
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
	  
  }
  @Test
  public static String getTimeStamp() 
  {
	  Date date = new Date();
	  return date.toString().replace(" ", "_").replace(":", "_");
	  
	  
  }
}
