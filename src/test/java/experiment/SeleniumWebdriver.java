package experiment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class SeleniumWebdriver {

	public static void main(String[] args) {
		
		  WebDriver driver =new ChromeDriver();
		  driver.get("http://www.tutorialsninja.com/demo/");
		  driver.manage().window().maximize();

	}

}
