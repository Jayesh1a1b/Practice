package tests;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
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

public class ScreenshotDemo {

	public static void main(String[] args) throws IOException {
	ExtentReports extent = new ExtentReports();
	File file = new File(System.getProperty("user.dir")+"\\Demo\\rReports.html");
	ExtentSparkReporter sparkReporter = new ExtentSparkReporter(file);
    extent.attachReporter(sparkReporter);
    WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
    driver.get("https://kite.zerodha.com/");
    driver.manage().window().maximize();  
   File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
   String dest = System.getProperty("user.dir")+"\\Demo\\.png";//return type maintained String
   FileHandler.copy(src, new File(dest));//Method1
 //FileUtils.getFile(src, dest);//Method 2
   ExtentTest test = extent.createTest("Test one");
   test.log(Status.INFO, "Chrome browser launch");
   test.log(Status.INFO, "Test one execution is processing");
   test.addScreenCaptureFromPath(dest," kite home page");//String type return type of dest provides
    test.log(Status.INFO, "execution complete");
    extent.flush();
    Desktop.getDesktop().browse(file.toURI());
    driver.close();
	}

}
