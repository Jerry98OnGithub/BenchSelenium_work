package PagesHelper;

import java.time.Duration;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import HelperPages.TestDataPropFile;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverPage {
	public WebDriver driver;
	public TestDataPropFile testDataPropFile;
	String BROWSER;
	String host;
	MutableCapabilities dc;

	public WebDriver getWebDriver() throws Exception {
		testDataPropFile = new TestDataPropFile();
		BROWSER = testDataPropFile.getValue("browser");

		if (BROWSER.equalsIgnoreCase("chrome")) {	
			//WebDriverManager.chromedriver().setup();		
			driver = new ChromeDriver();		
		} 
		
		else if(BROWSER.equalsIgnoreCase("firefox")) {
			//WebDriverManager.firefoxdriver().setup();
			driver =new FirefoxDriver();
		}
		
		else if (BROWSER.equalsIgnoreCase("edge")) {
			//WebDriverManager.edgedriver().setup();
			driver =new EdgeDriver();
		}
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	}
}
