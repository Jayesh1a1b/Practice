package screenshotstudy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.bouncycastle.util.encoders.Base64;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OutputTypeasBase64 {

	public static void main(String[] args) throws IOException {
		 WebDriverManager.chromedriver().setup();
		   WebDriver driver=new ChromeDriver();
		    driver.get("https://kite.zerodha.com/");
		    driver.manage().window().maximize(); 
		    
		    String Base64Screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
		    File dest = new File(System.getProperty("user.dir")+"\\ScreenshotStudy\\kitehomepage.png");
		   FileOutputStream fos = new FileOutputStream(dest);
		   byte[] byteArrayScreenshot = Base64.decode(Base64Screenshot);//covert Base64 to byte array
		   fos.write(byteArrayScreenshot);
	}

}
