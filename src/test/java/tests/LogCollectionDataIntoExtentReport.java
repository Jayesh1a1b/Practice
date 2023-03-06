package tests;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class LogCollectionDataIntoExtentReport {

	public static void main(String[] args) throws IOException {
		ExtentReports extent = new ExtentReports();
		File file = new File(System.getProperty("user.dir")+"\\Collection\\eReports.html");
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(file);
		extent.attachReporter(sparkReporter);
		//ordered list print numbers come
		ArrayList<String> al = new ArrayList<String>();
		al.add("Monday");
		al.add("Tuesday");
		al.add("Wednesday");
		al.add("Thirsday");
		al.add("Friday");
		al.add("Saturday");
		
		ExtentTest test = extent.createTest("Test One");
		test.log(Status.INFO, MarkupHelper.createOrderedList(al));
		System.out.println("----------------------------------------------------");
		
		//Unordered list print boolets come
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("Red");
		al1.add("Black");
		al1.add("Green");
		al1.add("White");
		al1.add("Pink");
		al1.add("Yellow");
		ExtentTest test1 = extent.createTest("Test Two");
		test1.log(Status.INFO, MarkupHelper.createUnorderedList(al1)); 
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		//ordered list print numbers come but random order indexing not followed
				HashSet<String> al2 = new HashSet<String>();
				al2.add("Monday");
				al2.add("Tuesday");
				al2.add("Wednesday");
				al2.add("Thirsday");
				al2.add("Friday");
				al2.add("Saturday");
				ExtentTest test2 = extent.createTest("Test Three");
				test2.log(Status.INFO, MarkupHelper.createOrderedList(al2));
				
				System.out.println("----------------------------------------------------");
				
				//Unordered list print boolets come but random order indexing not followed
				HashSet<String> al3 = new HashSet<String>();
				al3.add("Red");
				al3.add("Black");
				al3.add("Green");
				al3.add("White");
				al3.add("Pink");
				al3.add("Yellow");
				ExtentTest test4 = extent.createTest("Test Four");
				test4.log(Status.INFO, MarkupHelper.createUnorderedList(al3));  
				
				//ordered list print numbers come
				System.out.println("----------------------------------------------------");
				HashMap<String, Object> hmap = new HashMap<String,Object>();
				hmap.put("First Name", "Jayesh");
				hmap.put("Last Name", "Choudhary");
				hmap.put("Experience", 3);
				hmap.put("Location", "Pune");
				ExtentTest test5 = extent.createTest("Test Five");
				test5.log(Status.INFO, MarkupHelper.createOrderedList(hmap));
				
				//Unordered list print boolets come
				System.out.println("----------------------------------------------------");
				HashMap<String, Object> hmap1 = new HashMap<String,Object>();
				hmap1.put("First Name", "Mahesh");
				hmap1.put("Last Name", "Choudhary");
				hmap1.put("Experience", 2);
				hmap1.put("Location", "Thane");
				ExtentTest test6 = extent.createTest("Test Six");
				test6.log(Status.INFO, MarkupHelper.createUnorderedList(hmap1));
				
		extent.flush();
		Desktop.getDesktop().browse(file.toURI());

	}

}
