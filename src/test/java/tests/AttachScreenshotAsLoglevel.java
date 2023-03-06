package tests;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AttachScreenshotAsLoglevel {
         static WebDriver driver;
	public static void main(String[] args) throws IOException {
		ExtentReports extent = new ExtentReports();
		File file = new File(System.getProperty("user.dir")+"\\Reports\\eReports.html");
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(file);
		extent.attachReporter(sparkReporter);
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://www.tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		ExtentTest test = extent.createTest("Test one");
		test.log(Status.INFO, "Browser launch");
		//test.addScreenCaptureFromBase64String(takeScreenshot());//screenshot at test level
		test.log(Status.INFO, MediaEntityBuilder.createScreenCaptureFromBase64String(takeScreenshot(),"TutorialsninjaHomePage").build());//screenshot at log level
		driver.findElement(By.name("search")).sendKeys("hp");
		test.log(Status.WARNING, "Password should  not be  visible by other");
		//test.addScreenCaptureFromPath(takeScreenshotAndReturnStringPath());//screenshot at test level
		test.log(Status.WARNING,MediaEntityBuilder.createScreenCaptureFromPath(takeScreenshotAndReturnStringPath(), "search Hp").build());//at log level
		
		extent.flush();
		Desktop.getDesktop().browse(file.toURI());

	}
	public static String takeScreenshot()
	{
		String screenshotBase64 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
		return screenshotBase64;
	}
	public static String takeScreenshotAndReturnStringPath() throws IOException
	{
		File srcScreenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destinationFile = new File(System.getProperty("user.dir")+"\\ScreenshotStudy\\homepage.png");
		FileHandler.copy(srcScreenshotFile, destinationFile);
		return destinationFile.getAbsolutePath();//convert file to string path
	}

}
