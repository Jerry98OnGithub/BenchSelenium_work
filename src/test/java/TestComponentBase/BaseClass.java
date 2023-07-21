package TestComponentBase;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import PageObjectData.GreenCartData;
import PagesHelper.TestDataPropFile;
import PagesHelper.WebDriverPage;

public class BaseClass {
	public WebDriver driver;
	GreenCartData cg = new GreenCartData(driver);
	public TestDataPropFile testDataPropFile;
	public static Logger log = LogManager.getLogger();
	public static ExtentReports extent;
	public static ExtentSparkReporter spark;
	public static ExtentTest test;

	public static ExtentReports getReports() {

		if (extent == null) {
			extent = new ExtentReports();
			System.out.println(System.getProperty("user.dir"));
			extent = new ExtentReports();
			spark = new ExtentSparkReporter(System.getProperty("user.dir") + "\\ExtentReports\\");
			spark.config().setReportName("BenchSelenium_ExtentReport");
			spark.config().setDocumentTitle("SeleniumRahulShettyAcademy");
			spark.config().setEncoding("utf-8");
			extent.attachReporter(spark);
		}
		return extent;
	}

	@Parameters("platform")
	@BeforeTest(alwaysRun = true)
	public void initializeDriver(String platform) throws Exception {
		WebDriverPage webDriverPage = new WebDriverPage();

		if (platform.equalsIgnoreCase("local")) {
			driver = webDriverPage.getWebDriver();

		} else {

			System.out.println("Not a local webdriver");
		}
		extent = getReports();

	}

	public void launchApplication() throws Exception {
		testDataPropFile = new TestDataPropFile();
		driver.get(testDataPropFile.getValue("url"));

	}

	@AfterTest(alwaysRun = true)
	public void closeDriver() {
		extent.flush();
		driver.quit();

	}

	/*
	 * public String getScreenShotPath(String methodName, WebDriver driver) throws
	 * Exception { TakesScreenshot ts = (TakesScreenshot) driver; File ss =
	 * ts.getScreenshotAs(OutputType.FILE); String destinationFile =
	 * System.getProperty("user.dir") + "\\screenshots\\" + methodName +".png";
	 * FileUtils.copyFile(ss, new File(destinationFile)); return destinationFile; }
	 */

}
