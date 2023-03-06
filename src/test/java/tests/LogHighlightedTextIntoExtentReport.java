package tests;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class LogHighlightedTextIntoExtentReport {

	public static void main(String[] args) throws IOException {
		ExtentReports extent = new ExtentReports();
		File file = new File(System.getProperty("user.dir")+"\\HighlightedText\\eReporter.html");
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(file);
        extent.attachReporter(sparkReporter);
        ExtentTest test = extent.createTest("Test one");
        test.log(Status.INFO, "Test One highlighted Normalway");
        test.log(Status.INFO, MarkupHelper.createLabel("Test One highlighted by MarkupHelper", ExtentColor.GREEN));
        extent.flush();
        Desktop.getDesktop().browse(file.toURI());
	}

}
