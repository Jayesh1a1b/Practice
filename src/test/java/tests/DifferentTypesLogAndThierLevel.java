package tests;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class DifferentTypesLogAndThierLevel {

	public static void main(String[] args) throws IOException {
		// Types of Log
//		Fail           #Level1
//		skip           #Level2
//		Warning        #Level3
//		 pass           #Level4
//		 info           #Level5
		
		
		ExtentReports extent = new ExtentReports();
		File file = new File(System.getProperty("user.dir")+"\\LogLevelStudy\\eReporter.html");
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(file);
		extent.attachReporter(sparkReporter);
		ExtentTest One = extent.createTest("Test One");//level1 first execute
		One.fail("Test One Fail");//Method 1
	  //One.log(Status.FAIL,"Test One Fail");//Method 2 used 3rd option
		One.log(Status.INFO, "Test One started");
		One.log(Status.WARNING, "Buttones are not alligned properly");
		One.log(Status.SKIP, "Test One Skipped");
		One.log(Status.PASS, "Test one pass");
		extent.flush();
		Desktop.getDesktop().browse(file.toURI());
		
	}

}
