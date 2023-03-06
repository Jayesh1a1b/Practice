package tests;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.bouncycastle.util.encoders.Base64;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddScreenCaptureFromBase64String {
	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		ExtentReports extent = new ExtentReports();
		File file = new File(System.getProperty("user.dir")+"\\Demo\\rReports.html");
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(file);
	    extent.attachReporter(sparkReporter);
	    WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.get("https://kite.zerodha.com/");
	    driver.manage().window().maximize(); 

	    
	    ExtentTest test = extent.createTest("Test one");
		   test.log(Status.INFO, "Chrome browser launch");
		  test.addScreenCaptureFromBase64String(takeScreenshot(),"Kite Home Page");
		   test.log(Status.INFO, "Test one execution is processing");
	
		    test.log(Status.INFO, "execution complete");
		    extent.flush();
		    Desktop.getDesktop().browse(file.toURI());
		    driver.close();
	}
	public static String takeScreenshot() 
	{
		 String Base64Screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
		  
		   return Base64Screenshot;
	}
}
