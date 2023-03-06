package practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class usingPropertyFileInSearchFunctionality {
  @Test
  public void searchItem() throws IOException 
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
	  driver.findElement(By.name("search")).sendKeys(prop.getProperty("validProduct"),Keys.ENTER);
  }
}
