package Runfile;

import static org.testng.Assert.assertNotEquals;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import PageObjectData.FlightData;
import TestComponentBase.BaseClass;

public class FlightSiteRun extends BaseClass {

	@SuppressWarnings("deprecation")
	@Test(priority = 1)
	public void CountryFieldCheck() throws Exception {
		launchApplication();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		FlightData flightData = new FlightData(driver);
		flightData.gotoFlightSite();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String titleOfFlight = driver.getTitle();
		String expected = "QAClickJet - Flight Booking for Domestic and International, Cheap Air Tickets";
		assertNotEquals(titleOfFlight, expected);
		test = extent.createTest("CountryFieldCheck");
	}

	@Test(priority = 2)
	public void flightBook() {
		FlightData flightData = new FlightData(driver);
		flightData.TripTypeRadioButton();
		test.log(Status.FAIL, "failed");

		test = extent.createTest("flightBook");

		// Expected To Fail
	}

}
