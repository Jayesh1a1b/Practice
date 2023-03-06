package tutarialsNinjaTestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyUrl {
  @Test
  public void verifyCurrentURL() 
  {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
      driver.manage().window().maximize();
      String ActualURL = driver.getCurrentUrl();
      String ExpectedURL="http://tutorialsninja.com/demo/index.php?route=account/login";
  }
}
