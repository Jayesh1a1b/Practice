package testNGGroupingStudy;

import org.testng.annotations.Test;
@Test(groups={"all"})
public class Register {
  @Test(priority=1,groups= {"sanity","smoke","all"})
  public void registerWithMandatoryField() 
  {
	 System.out.println(" Mandatory fields include only"); 
  }
  
  @Test(priority=2,groups= {"regression","all"})
  public void registerWithEnteringAllField() 
  {
	 System.out.println(" providing all fields information"); 
  }
  
  @Test(priority=3,groups="sanity")
  public void registerWithoutAnyField() 
  {
	 System.out.println(" verify register functionality without providing any field"); 
  }
  @Test(priority=4,groups="smoke")
  public void registerWithProvidingWrongInformationInField() 
  {
	 System.out.println(" registering with providing all wrong field "); 
  }
  @Test(priority=5,groups={"regression","all"})
  public void registerWithProvidingOnlySpacebarinAllField() 
  {
	 System.out.println(" verify register functionality with providing space bar in every field"); 
  }
}
