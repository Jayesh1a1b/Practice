package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ObjectArrayToReturnDataInDataProvider {
  @Test(dataProvider="sendData")
  public void Reciever(Object a,Object b,Object c) 
  {
	  System.out.println(a+"_"+b+"_"+c);
  }
  @DataProvider(name="sendData")
  @Test
  public Object[][] getData()
  {
	  Object[][]Data= {{"Jayesh",100,true},{"Praveen",101,false},{"Mahesh",10.5,'M'}};
	  return Data;
  }
}
