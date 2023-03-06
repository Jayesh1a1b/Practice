package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class SingleDimensionObjectArrayInDataProvider {
  @Test(dataProvider = "supplier")
  public void SampleTest(Object a)
  {
	  System.out.println(a);
  }

  @DataProvider(name="supplier")
  public Object[] dataSupplier() 
  {
	  Object[]Data= {"jayesh",100,'M'};
	  return Data;
    
  }
}
