package base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitStudy {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("");
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(3000));
		WebElement link = driver.findElement(By.id("link"));
		WebElement element = w.until(ExpectedConditions.visibilityOf(null));
	}

}
