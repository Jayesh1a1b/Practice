package testNG;

import org.testng.annotations.DataProvider;

public class DataProviderData 
{
	@DataProvider
	public String [][] getData()
	{
		String[][] Data= {{"amotooricap1@gmail.com","12345"},{"amotooricap3@gmail.com","12345"},{"amotooricap9@gmail.com","12345"}};
		return Data;
	}

}
