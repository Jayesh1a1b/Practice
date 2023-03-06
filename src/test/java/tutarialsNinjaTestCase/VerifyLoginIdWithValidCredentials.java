package tutarialsNinjaTestCase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyLoginIdWithValidCredentials {
  @Test
  public void  sampleTest ()
  {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
      driver.manage().window().maximize();
      driver.findElement(By.xpath("//span[text()='My Account']")).click();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      driver.findElement(By.xpath("//a[text()='Login']")).click();
	  driver.findElement(By.id("input-email")).sendKeys("jayesh1a1b@gmail.com");
	  driver.findElement(By.id("input-password")).sendKeys("12345");
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
	  
	 // Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
	  WebElement logintext = driver.findElement(By.linkText("Edit your account information"));
	  boolean ActualResult = logintext.isDisplayed();
	  driver.close();
  }
  @Test
  public void  sampleTest1 ()
  {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
      driver.manage().window().maximize();
      driver.findElement(By.xpath("//span[text()='My Account']")).click();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      driver.findElement(By.xpath("//a[text()='Login']")).click();
	  driver.findElement(By.id("input-email")).sendKeys("jayesh1a1b@gmail.com");
	  driver.findElement(By.id("input-password")).sendKeys("123456");
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
	  String ActualResult = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();
	  String ExpectedResult="Warning: No match for E-Mail Address and/or Password.";
	  Assert.assertEquals(ActualResult,ExpectedResult );
	
	  driver.close();
  }
  
}
