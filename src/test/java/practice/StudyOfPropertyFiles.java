package practice;

import java.io.FileInputStream;


import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class StudyOfPropertyFiles   {
	@Test
	  public void loginWithValidCredentials() throws IOException
	  {
		  
		 Properties prop = new Properties();
		 FileInputStream fis=new FileInputStream("G:\\workspace\\ExtentReportDemoProject\\src\\Config1.properties");
	     prop.load(fis);
		
		  WebDriverManager.chromedriver().setup();
		  WebDriver driver=new ChromeDriver();
		  driver.get(prop.getProperty("url"));
		  //driver.get("http://www.tutorialsninja.com/demo/");
		  driver.manage().window().maximize();
		  driver.findElement(By.xpath("//span[text()='My Account']")).click();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		  driver.findElement(By.xpath("//a[text()='Login']")).click();
		  
		  driver.findElement(By.id("input-email")).sendKeys(prop.getProperty("UserName"));
		  driver.findElement(By.id("input-password")).sendKeys(prop.getProperty("PassWord"));
		  driver.findElement(By.xpath("//input[@type='submit']")).click();
		  
	  }
}
