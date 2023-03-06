package experiment;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataSupplierEx3a {
  
	@DataProvider(name="supplierData")
	  public String[][] getData()
	  {
		  String[][] Data= {{"jayesh1a1b@gmail.com","12345"},{"jayeshchoudhary63@gmail.com","12345"}};
		  return Data;
	  }
}
