package tests;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class CreatingTestsInExtentReports {

	public static void main(String[] args) throws IOException {
		ExtentReports extent = new ExtentReports();
		File file = new File(System.getProperty("user.dir")+"\\Reports\\eReporter.html");//project path where extent report print
		
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(file);
		extent.attachReporter(sparkReporter);
		
		//creating test in Report
		ExtentTest eTest = extent.createTest("TestOne");
		eTest.pass("TestOne passed");//Method 1
		//eTest.log(Status.PASS, "TestOne got pass");//Method2
		
		eTest.fail("testOne Fail");//method 1
		eTest.log(Status.FAIL, " testOne Got fail");//Method 2
		eTest.info("Testone give information like chrome browser launch");
		eTest.info("chrome Browser got maximized");
		
		ExtentTest eTestTwo = extent.createTest("TestTwo");
		eTestTwo.fail("TestTwo Fail");
		eTestTwo.skip("TestTwo skip");
		eTestTwo.warning("eTestTwo button colour are not good");
		
		extent.flush();
		Desktop.getDesktop().browse(file.toURI());//open html report automatically

	}

}
