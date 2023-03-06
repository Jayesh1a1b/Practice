package packageLevelExecution;

import org.testng.annotations.Test;

public class Login {
  @Test
  public void verifyLoginwithValidCredentials() 
  {
	  System.out.println("verifyLoginwithValidCredentials");
  }
  @Test
  public void verifyLoginwithoutValidCredentials() 
  {
	  System.out.println("verifyLoginwithoutValidCredentials");
  }
  @Test
  public void verifyLoginwithNoCredentials() 
  {
	  System.out.println("verifyLoginwithNoCredentials");
  }
}
