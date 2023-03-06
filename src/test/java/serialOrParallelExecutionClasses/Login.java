package serialOrParallelExecutionClasses;

import org.testng.annotations.Test;

public class Login {
  @Test(priority=1)
  public void loginWithValidCredentials()
  {
	  System.out.println("Login->loginWithValidCredentials->"+Thread.currentThread().getId());
  }
  @Test(priority=2)
  public void loginWithInvalidCredentials()
  {
	  System.out.println("Login->loginWithInValidCredentials->"+Thread.currentThread().getId());
  }
  @Test(priority=3)
  public void loginWithoutCredentials()
  {
	  System.out.println("Login->loginWithoutCredentials->"+Thread.currentThread().getId());
  }
  @Test(priority=4)
  public void loginWithValidEmailAndInvalidPasswordCredentials()
  {
	  System.out.println("Login->loginWithValidEmailAndInvalidPasswordCredentials->"+Thread.currentThread().getId());
  }
  @Test(priority=4)
  public void loginWithInValidEmailAndvalidPasswordCredentials()
  {
	  System.out.println("Login->loginWithInValidEmailAndvalidPasswordCredentials->"+Thread.currentThread().getId());
  }
}
