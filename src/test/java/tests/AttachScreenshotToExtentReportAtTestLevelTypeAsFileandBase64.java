package tests;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
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

public class AttachScreenshotToExtentReportAtTestLevelTypeAsFileandBase64 {
          static WebDriver driver;
	public static void main(String[] args) throws IOException {
		ExtentReports extent = new ExtentReports();
		 File file = new File(System.getProperty("user.dir")+"\\ExtentReports\\ereport.html");
		 ExtentSparkReporter sparkReporter = new ExtentSparkReporter(file);
		 extent.attachReporter(sparkReporter);
		 WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
		 driver.get("https://www.naukri.com/");
		 driver.manage().window().maximize();
		 ExtentTest test = extent.createTest("Test One");
		 test.log(Status.INFO, "Brawser Launch");
		 test.addScreenCaptureFromBase64String(takeScreenshot());
		 test.log(Status.PASS, "Successfully launch");
		 test.addScreenCaptureFromPath(takenScreenshotAndReturnPath("naukrihomepage"), "Home page launch");
		 extent.flush();
		 Desktop.getDesktop().browse(file.toURI());

	}
	public static String takeScreenshot()
	{
		String ScreenshotBase64 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
		return ScreenshotBase64;
	}
	public static  String takenScreenshotAndReturnPath(String filename) throws IOException
	{
		File Base64Screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File screenshotDestination = new File(System.getProperty("user.dir")+"\\ScreenshotStudy\\"+filename+".png");
	    FileUtils.copyFile(Base64Screenshot, screenshotDestination);
	     return screenshotDestination.getAbsolutePath();
	}

}
