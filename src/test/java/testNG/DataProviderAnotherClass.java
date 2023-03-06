package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderAnotherClass {
	@DataProvider
  public String [][] getData()
	{
		String[][] Data= {{"amotooricap1@gmail.com","12345"},{"amotooricap6@gmail.com","12345"},{"amotooricap9@gmail.com","12345"}};
		return Data;
	}
}
