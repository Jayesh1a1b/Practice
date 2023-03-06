package kite;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KiteTest {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");

		//File myFile = new File("G:\\Yogendra sir study material automation\\practice (1).kitelogin.xlsx");
		File myFile=new File("D:\\Kitefile.xlsx");
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
		String UN = mySheet.getRow(0).getCell(0).getStringCellValue();

		LoginPage login = new LoginPage(driver);
		login.sendUserid(UN);
		login.sendPassword(mySheet.getRow(1).getCell(1).getStringCellValue());
		login.clickOnLoginButton();

		PinPage pin = new PinPage(driver);
		pin.sendPinPage(mySheet.getRow(0).getCell(2).getStringCellValue());
		pin.clickOnContinueButton();

		HomePage home = new HomePage(driver);
		home.validateUserId(mySheet.getRow(0).getCell(0).getStringCellValue());
		home.clickOnUid();
		Thread.sleep(2000);
		driver.close();

	}

}
