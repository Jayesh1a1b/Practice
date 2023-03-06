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
import org.openqa.selenium.io.FileHandler;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotTypeBase64 {

	public static void main(String[] args) throws IOException {
		ExtentReports extent = new ExtentReports();
		File file = new File(System.getProperty("user.dir")+"\\Demo\\rReports.html");
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(file);
	    extent.attachReporter(sparkReporter);
	    WebDriverManager.chromedriver().setup();
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://kite.zerodha.com/");
	    driver.manage().window().maximize();  
	   String Base64Screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
	   String destpath=System.getProperty("user.dir")+"\\Screenshots\\.png";  //Screenshots folder create manually in these type
	    File dest = new File(destpath);
	  FileOutputStream fos = new FileOutputStream(dest);//use for base 64 type
	  fos.write(Base64.decode(Base64Screenshot));
	   ExtentTest test = extent.createTest("Test one");
	   test.log(Status.INFO, "Chrome browser launch");
	   test.log(Status.INFO, "Test one execution is processing");
	   test.addScreenCaptureFromPath(destpath);//String type return type of destpath provides
	    test.log(Status.INFO, "execution complete");
	    extent.flush();
	    Desktop.getDesktop().browse(file.toURI());
	    driver.close();
	    

	}

}
