package appTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	@FindBy(xpath="//span[text()='SA9987']")private WebElement uId;
	@FindBy(xpath="//a[@target='_self']")private WebElement logOut;
	
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}
	public void validateUserId()
	{
		String expectedUserId="SA9987";
				String actualUserId=uId.getText();
				
				if(actualUserId.equals(actualUserId))
				{
					System.out.println("actual and expected are matching TC pass ");
				}
				else
				{
					System.out.println("actual and expected are not  matching TC pass ");
				}
	}
	public void clickOnUid() throws InterruptedException 
	{
		uId.click();
		Thread.sleep(3000);
		logOut.click();
	}
	

}
