package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class JaggedArrayIndataProvider {
  @Test(dataProvider="supplier")
  public void sampleTest(Object[] a)  //provide [] for to take dynamically count how many data 
  {
	  for(int i=0;i<=a.length-1;i++)
	  {
		  System.out.println(a[i]+" ");
	  }
	  System.out.println(".............................");
  }
  @DataProvider(name="supplier")
  @Test
  public Object[][] dataSupplier()
  {
	  Object[][] Data= {{"Jayesh","Pune","Moshi"},{"Praveen",26,'M',"Indore"},{"India"}};
	  return Data;
  }
}
