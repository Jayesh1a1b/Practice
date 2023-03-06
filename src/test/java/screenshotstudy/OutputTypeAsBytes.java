package screenshotstudy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OutputTypeAsBytes {

	public static void main(String[] args) throws IOException {
		 WebDriverManager.chromedriver().setup();
		   WebDriver driver=new ChromeDriver();
		    driver.get("https://yourcorporatelife.com/");
		    driver.manage().window().maximize(); 
		    byte[] byteArrayScreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		    File ScreenshotDestinationFile = new File(System.getProperty("user.dir")+"\\ScreenshotStudy\\HomePage.png");
		    FileOutputStream fos = new FileOutputStream(ScreenshotDestinationFile);
		    fos.write(byteArrayScreenshot);
		    System.out.println("Screenshot is taken successssfully");
		    driver.close();

	}

}
