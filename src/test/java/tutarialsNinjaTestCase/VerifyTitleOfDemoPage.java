package tutarialsNinjaTestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTitleOfDemoPage {
  @Test
  public void verifyTitleOfPage() 
  {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  driver.get("http://www.tutorialsninja.com/demo/");
      driver.manage().window().maximize();
      String ActualTitle = driver.getTitle();
      System.out.println(ActualTitle);
      String ExpectedTitle="Your Store";
      Assert.assertEquals(ActualTitle, ExpectedTitle);
      driver.close();
  }
}
