package listeners;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import base.Base;
import utilityClass.ExtentReportGenerator;

public class MyListeners extends Base implements ITestListener
{
	WebDriver driver = null;
	String testName;
	ExtentTest eTest;
	ExtentReports report = ExtentReportGenerator.getExtentReport();//directly not call method of other class first call in method then copy at global level
	public void onTestStart(ITestResult result)
	{
		 testName = result.getName();
		//ExtentReports report = ExtentReportGenerator.getExtentReport();//first call here and copy of code 
	     eTest = report.createTest(testName);
	     eTest.log(Status.INFO, testName+" execution started");
	}

	public void onTestSuccess(ITestResult result) 
	{
		eTest.log(Status.PASS,testName+"Got successfully executed");
	}

	public void onTestFailure(ITestResult result) 
	{
		eTest.log(Status.FAIL, testName+"got failed");
		
		try {
			driver = (WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		eTest.addScreenCaptureFromPath(takeScreenshot(testName,driver),testName);
	}

	

	public void onTestSkipped(ITestResult result) 
	{
		eTest.log(Status.SKIP, testName+" got skipped");
	}

	public void onFinish(ITestContext context)
   {
		report.flush();
	}

}
