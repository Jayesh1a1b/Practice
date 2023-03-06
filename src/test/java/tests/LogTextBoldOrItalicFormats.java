package tests;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class LogTextBoldOrItalicFormats {

	public static void main(String[] args) throws IOException {
		ExtentReports extent = new ExtentReports();
		File file = new File(System.getProperty("user.dir")+"\\BoldOrItalicText\\eReports.html");
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(file);
		
		// change Theme
		sparkReporter.config().setTheme(Theme.DARK);//dark theme open report in browser
		extent.attachReporter(sparkReporter);
		
		//set Report name
		sparkReporter.config().setReportName("Jayesh Choudhary");
		
		//set Report Title name
		sparkReporter.config().setDocumentTitle("Modification of Report ");
		
		//set timeStamp Format
		sparkReporter.config().setTimeStampFormat("dd-MM-yyyy hh:mm:ss");
		
		//by using Css style background color change
		sparkReporter.config().setCss(".badge-primary{background-color:#df6565");// here we change background color of Report name
		
		
		ExtentTest test = extent.createTest("test One");
		test.log(Status.INFO, "Normal text ");
		test.log(Status.INFO, "<b>Normal Text in Bold</b>");
		test.log(Status.INFO, "<I> Normal Text in Italic</I>");
		test.log(Status.INFO, "<u> Normal Text in underline</u>");

		extent.flush();
		Desktop.getDesktop().browse(file.toURI());
		
	}

}
