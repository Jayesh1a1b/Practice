package appTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login 
{
	 
	@FindBy(id="userid")private WebElement userId;
	@FindBy(id="password")private WebElement passWord;
	@FindBy(xpath="//button[@type='submit']")private WebElement loginButton;
	
	public Login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
  public void sendUsername()
  {
	  userId.sendKeys("SA9987");
  }
  
  public void sendPassword()
  {
	 passWord.sendKeys("9752566094"); 
  }
  public void clickOnLoginbutton() 
  {
	  loginButton.click();
	  
  }
}
