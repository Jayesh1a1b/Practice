package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PartiallyPassingDataFromDataProviderMethodUsingIndicesAttribute 
//Purpose:-To Investicate the failed data out of large amounts of data passing from data provider method
{
	
  @Test(dataProvider="supplier")
  public void sampleData(Object a) 
  {
	 System.out.println(a); 
  }
  @DataProvider(name="supplier",indices= {0,3})//pass only 0 and 3 indices data
  @ Test
  public Object[] dataSupplier()
  {
	  Object[] Data= {"jayesh","Mahesh","Ravi","Pankaj"};
	  return Data;
  }
}
