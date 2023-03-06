package testNG;

import org.testng.annotations.Test;

public class AnotherClassSingleDimensionArrayUseInAnotherClass {
  @Test(dataProvider="supplier",dataProviderClass=SingleDimensionObjectArrayInDataProvider.class)
  public void SampleTest(Object a)
  {
	  System.out.println(a);
  }
}
