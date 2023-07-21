package PagesHelper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class TestDataPropFile {
	public Properties prop;

	public TestDataPropFile() throws Exception {
		FileInputStream f = new FileInputStream(System.getProperty("user.dir") + File.separator + "PropertiesFile"
				+ File.separator + "Data.properties");
		prop = new Properties();
		prop.load(f);
	}

	public String getValue(String s) {
		return prop.getProperty(s);

	}
}