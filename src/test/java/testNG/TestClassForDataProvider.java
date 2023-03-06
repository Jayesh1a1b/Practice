package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClassForDataProvider {
  @Test(dataProvider="getData",dataProviderClass=DataProviderData.class)//another class take data 
  public void VerifyLogin(String username,String password) {
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
}
