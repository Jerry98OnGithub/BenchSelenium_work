package PageObjectData;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.Select;

import Utilities.CommonUtilities;

public class FlightData extends CommonUtilities {

	WebDriver driver;

	public FlightData(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"root\"]/div/header/div/div[3]/a[3]")
	public WebElement FlightSiteLink;

	@FindBy(xpath = "//body[1]/form[1]/div[4]/div[2]/div[1]/div[5]"
					+ "/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/"
					+ "ul[1]/li[3]/a[1]/span[2]")
	public WebElement TripTypeRadioBtn;

	

	public void gotoFlightSite() {
		FlightSiteLink.click();
	}

	public void TripTypeRadioButton() {
	 TripTypeRadioBtn.isDisplayed();
		
	}



}
