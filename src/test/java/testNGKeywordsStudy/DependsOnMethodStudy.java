package testNGKeywordsStudy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DependsOnMethodStudy {
	WebDriver driver;
  @Test
  public void userLogin() 
  {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.get("http://www.tutorialsninja.com/demo/");
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//span[text()='My Account']")).click();
	  driver.findElement(By.xpath("//a[text()='Login']")).click();
	  driver.findElement(By.id("input-email")).sendKeys("jayesh1a1b@gmail.com");
	  driver.findElement(By.id("input-password")).sendKeys("12345");
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
	  Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
  }
  @Test(dependsOnMethods= {"userLogin"})
  public void addProductToWishlistAndViewWishlist()
  {
	  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("HP",Keys.ENTER);
	  driver.findElement(By.xpath("//button[@data-original-title='Add to Wish List']")).click();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.findElement(By.xpath("//a[text()='wish list']")).click();
	  Assert.assertTrue(driver.getTitle().equals("My Wish List") );
  }
  @Test(dependsOnMethods= {"userLogin","addProductToWishlistAndViewWishlist"})
  public void removeAddToWishlist()
  {
	  driver.findElement(By.xpath("//a[@data-original-title='Remove']")).click();
	  Assert.assertTrue(driver.findElement(By.xpath("//div[@id='content']/p")).getText().equals("Your wish list is empty."));
	  driver.close();
  }
}
