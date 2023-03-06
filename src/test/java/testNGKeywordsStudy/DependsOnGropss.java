package testNGKeywordsStudy;

import org.testng.annotations.Test;

public class DependsOnGropss {
  @Test(groups= "sanity")
  public void verifyRegisteringAccountByMandatoryField() 
  {
	System.out.println("verifyRegisteringAccountByMandatoryField");  
  }
  @Test(groups= "smoke")
  public void verifyRegisteringAccountByAllField() 
  {
	System.out.println("verifyRegisteringAccountByAllField");  
  }
  @Test(dependsOnGroups= {"smoke"})
  public void verifyLoginByProvidingValidCredentials() 
  {
	System.out.println("verifyLoginByProvidingValidCredentials");  
  }
  @Test(dependsOnGroups= {"sanity"})
  public void verifyLoginByProvidingInValidCredentials() 
  {
	System.out.println("verifyLoginByProvidingInValidCredentials");  
  }
}
