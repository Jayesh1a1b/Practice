package testNGKeywordsStudy;

import java.time.Duration;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParameterStudy {
@Parameters	({"url","UserName","PassWord"})

//url parameters pass through testng.xml file
//in Xml file parameter is passed through suite level or test level
//after parameter in method add test method with include tag
//Ex- <include name="loginWithValidCredentials"></include>

  @Test
  public void loginWithValidCredentials(String URL,String USERNAME,String PASSWORD)
  {
	  WebDriverManager.chromedriver().setup();
	 // ChromeOptions options = new ChromeOptions();
	//  options.setExperimentalOption("", Collections.singletonList(""))
	  WebDriver driver=new ChromeDriver();
	  driver.get(URL);
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//span[text()='My Account']")).click();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.findElement(By.xpath("//a[text()='Login']")).click();
	  
	  driver.findElement(By.id("input-email")).sendKeys(USERNAME);
	  driver.findElement(By.id("input-password")).sendKeys(PASSWORD);
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
	  
  }
}
