package kite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PinPage 
{

	@FindBy(xpath="//input[@label='Mobile App Code']")private WebElement pin;
	@FindBy(xpath="//button[@type='submit']") private WebElement continueButton;

	
	
	public PinPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void sendPinPage(String PIN)
	{
		pin.sendKeys(PIN);
	}
	public void clickOnContinueButton()
	{
		continueButton.click();
	}
}
