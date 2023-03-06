package experiment;

import java.util.Collections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InfoWarningMessage {
  @Test
  public void test()
  {
	  WebDriverManager.chromedriver().setup();
	  ChromeOptions options = new ChromeOptions();
	  options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
	  WebDriver driver=new ChromeDriver(options);
	  driver.get("http://www.tutorialsninja.com/demo/");
	  driver.manage().window().maximize();
	  
  }
}
