package selenium;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class Config {
	@Test
	public static String getData(String string) throws Exception
	{
		FileInputStream fis= new FileInputStream("C:\\Users\\Prakhar Fanse\\Documents\\workspace-spring-tool-suite-4-4.3.2.RELEASE\\TestingProject\\config.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String env=prop.getProperty(string);
		return env;
	}
}
