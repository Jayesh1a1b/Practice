package kite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	@FindBy(id="userid")private WebElement userId;
	@FindBy(id="password")private WebElement passWord;
	@FindBy(xpath="//button[@type='submit']")private WebElement loginButton;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void sendUserid(String UN)
	{
		userId.sendKeys(UN);
	}
   public void sendPassword(String PWD)
   {
	   passWord.sendKeys(PWD);
   }
   public void clickOnLoginButton()
   {
	   loginButton.click();
   }
}
