package serialOrParallelExecutionClasses;

import org.testng.annotations.Test;

public class Register {
  @Test(priority=1)
  public void registerWithOnlyMandatoryFields() 
  {
	  System.out.println("Register->registerWithOnlyMandatoryFields->"+Thread.currentThread().getId());
  }
  @Test(priority=2)
  public void registerAllFields() 
  {
	  System.out.println("Register->registerWithAllFields->"+Thread.currentThread().getId());
  }
  @Test(priority=3)
  public void registerWithoutAnyFields() 
  {
	  System.out.println("Register->registerWithoutAnyFields->"+Thread.currentThread().getId());
  }
  @Test(priority=4)
  public void registerADuplicateAccount() 
  {
	  System.out.println("Register->registerADuplicateAccount->"+Thread.currentThread().getId());
  }
}
