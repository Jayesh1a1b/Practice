package appTest;

import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(listeners.MyListeners.class)
public class NewTest {
	@BeforeMethod
	public void setup()
	{
		 WebDriverManager.chromedriver().setup();
	      driver=new ChromeDriver();
		  driver.get("");
		  driver.manage().window().maximize();
	}
	public WebDriver driver;
	@AfterMethod
	public void tearDown()
	{
		
		driver.close();
		  
	}
  @Test(priority=1)
  public void loginWithValidCredentials() 
  {
	 
	  driver.findElement(By.xpath("//span[text()='My Account']")).click();
	  driver.findElement(By.xpath("//a[text()='Login']")).click();
	  driver.findElement(By.id("input-email")).sendKeys("abcmotooricap9@gmail.com");//for practice purpose  fail these test case by providing wrong mail 
	  driver.findElement(By.id("input-password")).sendKeys("12345");
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
	  
	 
  }
  @Test(priority=2)
  public void withInvalidCredentials()
  {
	  
	  driver.findElement(By.xpath("//span[text()='My Account']")).click();
	  driver.findElement(By.xpath("//a[text()='Login']")).click();
	  driver.findElement(By.id("input-email")).sendKeys("amotooricap9"+generateTimeStamp()+"@gmail.com");
	  driver.findElement(By.id("input-password")).sendKeys("12345");
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
	  Assert.assertTrue(driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText().contains("Warning: No match for E-Mail Address and/or Password."));
  }
  @Test(priority=3,dependsOnMethods= {"loginWithValidCredentials"})
  public void loginWithoutCredentials()
  {
	 
	  driver.findElement(By.xpath("//span[text()='My Account']")).click();
	  driver.findElement(By.xpath("//a[text()='Login']")).click();
	  driver.findElement(By.id("input-email")).sendKeys("");
	  driver.findElement(By.id("input-password")).sendKeys("");
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
	  Assert.assertTrue(driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText().contains("Warning: No match for E-Mail Address and/or Password."));
  }
  public String generateTimeStamp()
  {
	 Date date = new Date();
	 return date.toString().replace(" ","-").replace(":", "-");
  }
}
