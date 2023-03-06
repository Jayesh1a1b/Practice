package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadPropertiesFiles 
{
	 public static Properties prop=null;
	public static void loadingPropertiesFile() throws IOException
	{   
		prop = new Properties();
		FileInputStream fis=new FileInputStream("G:\\workspace\\ExtentReportDemoProject\\src\\Config1.properties");
		prop.load(fis);
		
	}


}
