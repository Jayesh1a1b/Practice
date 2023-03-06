package packageLevelExecution;

import org.testng.annotations.Test;

public class Register {
  @Test
  public void verifyRegisteringAccountByMandatoryField() 
  {
	  System.out.println("verifyRegisteringAccountByMandatoryField");
  }
  @Test
  public void verifyRegisteringAccountByAllField() 
  {
	  System.out.println("verifyRegisteringAccountByAllField");
  }
  @Test
  public void verifyRegisteringAccountWithoutEnteringAnyDataInField() 
  {
	  System.out.println(" verifyRegisteringAccountWithoutEnteringAnyDataInField");
  }
}
