package tutarialsNinjaTestCase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TitleVerifation {
  @Test
  public void VerifyTitle()
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
	  String Actualtitle = driver.getTitle();
	  System.out.println(Actualtitle);
	 String ExpectedTitle="My Account";
	 Assert.assertEquals(Actualtitle,ExpectedTitle );
	 driver.close();
  }
}
