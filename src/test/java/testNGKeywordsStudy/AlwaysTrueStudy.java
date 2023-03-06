package testNGKeywordsStudy;

import org.testng.annotations.Test;

public class AlwaysTrueStudy {
  @Test
  public void verifyRegisteringAccountByFillMandatoryField() 
  {
	  int a=2/0;
	  System.out.println("verifyRegisteringAccountByFillMandatoryField");
  }
  @Test(dependsOnMethods= {"verifyRegisteringAccountByFillMandatoryField"},alwaysRun=true)
  public void verifyLoginAccountByValidCredentials() 
  {
	  System.out.println("verifyLoginAccountByValidCredentials");
  }
}
