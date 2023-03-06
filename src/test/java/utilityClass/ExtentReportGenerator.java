package utilityClass;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportGenerator 
{
	public static ExtentReports getExtentReport()
	{
		ExtentReports report = new ExtentReports();
		File file = new File(System.getProperty("\\ExtentReports\\eReports.html"));
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(file);
	    report.attachReporter(sparkReporter);
		return report;
	}
	

}
