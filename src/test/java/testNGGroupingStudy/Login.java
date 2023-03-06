package testNGGroupingStudy;

import org.testng.annotations.Test;

public class Login {
  @Test(priority=1,groups= {"sanity","all"})
  public void verifywithValidCredentials() 
  {
	  System.out.println("verify login with valid credentials");
  }
  @Test(priority=2,groups={"smoke","regression","all"})
  public void verifywithoutValidCredentials() 
  {
	  System.out.println("verify login without valid credentials");
  }
  @Test(priority=3,groups= {"sanity","all"})
  public void verifywithInValidCredentials() 
  {
	  System.out.println("verify login with Invalid credentials");
  }
  @Test(priority=4,groups= {"regression"})
  public void verifywithwrongCredentials() 
  {
	  System.out.println("verify login with wrong credentials");
  }
}
