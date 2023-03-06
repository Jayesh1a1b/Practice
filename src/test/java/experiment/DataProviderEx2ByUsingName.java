package experiment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderEx2ByUsingName {
  @Test(dataProvider="supplierData")
  public void sampleTest(String email,String password) 
  {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
      driver.manage().window().maximize();
      driver.findElement(By.xpath("//span[text()='My Account']")).click();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      driver.findElement(By.xpath("//a[text()='Login']")).click();
	  driver.findElement(By.id("input-email")).sendKeys(email);
	  driver.findElement(By.id("input-password")).sendKeys(password);
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
	  driver.close();
  }
  @DataProvider(name="supplierData")
  public String[][] getData()
  {
	  String[][] Data= {{"jayesh1a1b@gmail.com","12345"},{"jayeshchoudhary63@gmail.com","12345"}};
	  return Data;
  }
}
