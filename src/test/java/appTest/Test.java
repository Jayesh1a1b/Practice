package appTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		
		Login login=new Login (driver);
         login.sendUsername();
         login.sendPassword();
         login.clickOnLoginbutton();
         
         PinPage pin=new PinPage(driver);
         pin.sendPinPage();
         pin.clickOnContinueButton();
	}

}
