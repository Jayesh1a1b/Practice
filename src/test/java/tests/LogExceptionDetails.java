package tests;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class LogExceptionDetails {

	public static void main(String[] args) throws IOException  {
		
		ExtentReports extent = new ExtentReports();
		File file = new File(System.getProperty("user.dir")+"\\HandleException\\eReporter.html");
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(file);
		extent.attachReporter(sparkReporter);
		
		ExtentTest test = extent.createTest("Test One");
		try
		{
			int a=9/0;
		}
catch(Exception e)
		{
	test.fail(e);
		}
		extent.flush();
		Desktop.getDesktop().browse(file.toURI());
	}

}
