package Runfile;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import PageObjectData.GreenCartData;

import TestComponentBase.BaseClass;

public class greenkartRun extends BaseClass {

	@SuppressWarnings("deprecation")
	@Test(priority = 1)
	public void rungreencartfun() throws Exception {
		GreenCartData greenElemPage = new GreenCartData(driver);
		launchApplication();
		log.info("Launching  Webdriver and URL");
		String actualTitle = driver.getTitle();
		String expectedTitle = "GreenKart - veg and fruits kart";
		assertEquals(actualTitle, expectedTitle);
		log.debug("Checking Website title using assertion");
		greenElemPage.searchVegis();
		log.debug("searching product on seacrh field");
		test = extent.createTest("rungreencartfun");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@Test(priority = 2)
	public void CheckIncrementButton() throws InterruptedException {
		GreenCartData greenElemPage = new GreenCartData(driver);
		
		greenElemPage.clickIncrement_Btn();
		Thread.sleep(1000);
		greenElemPage.clickIncrement_Btn();
		Thread.sleep(1000);
		greenElemPage.clickIncrement_Btn();
		String countproductValue = greenElemPage.countProduct();
		assertEquals(countproductValue, "3");	
		test = extent.createTest("CheckIncrementButton");

	}

	@SuppressWarnings("deprecation")
	@Test(priority = 3)
	public void ClickAddToCart() throws InterruptedException {
		GreenCartData greenElemPage = new GreenCartData(driver);
		greenElemPage.AddToCartClick();
		log.info("just clicking on AddToCartButton");
		test = extent.createTest("ClickAddToCart");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	@SuppressWarnings("deprecation")
	@Test(priority = 4)
	public void GoToCartCheck() throws InterruptedException {
		GreenCartData greenElemPage = new GreenCartData(driver);
		greenElemPage.CartLogoClick();
		log.info("Clicking on GoTo cart button logo");
		test = extent.createTest("GoToCartCheck");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

	}
    
	@SuppressWarnings("deprecation")
	@Test (priority = 5)
	public void CheckOutCheck() throws InterruptedException {
		GreenCartData greenElemPage = new GreenCartData(driver);
		greenElemPage.ProceedCheckBtn();
		log.info("clicking on checkout button inside gotocart Logo");
		test = extent.createTest("CheckOutCheck");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		

	}
	@SuppressWarnings("deprecation")
	@Test (priority = 6)
	public void PromoFieldCheck() throws InterruptedException {
		GreenCartData greenElemPage = new GreenCartData(driver);
		greenElemPage.PromocodeFill();
		log.debug("Sending promocode to promo field");
		test = extent.createTest("PromoFieldCheck");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		

	}
	@SuppressWarnings("deprecation")
	@Test (priority = 7)
	public void promocodeCheck() throws InterruptedException {
		GreenCartData greenElemPage = new GreenCartData(driver);
		greenElemPage.ApplyPromo();
		log.info("Clicking on Apply promo code button");
		test = extent.createTest("promocodeCheck");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}
	@SuppressWarnings("deprecation")
	@Test (priority = 8)
	public void PlaceorderCheck() throws InterruptedException {
		GreenCartData greenElemPage = new GreenCartData(driver);
		greenElemPage.PlaceOrderbtClick();
		log.info("Clicking on place order");
		test = extent.createTest("PlaceorderCheck");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
	}
	
	@Test (priority = 9)
	public void SelectCountryDropDown() throws InterruptedException {
		GreenCartData greenElemPage = new GreenCartData(driver);
		greenElemPage.selectCountry();
		log.debug("Selecting country from Country dropdown");
		test = extent.createTest("SelectCountryDropDown");
		Thread.sleep(3000);
		
	}
	
	@Test (priority = 10)
	public void ClickCheckBtn() throws InterruptedException {
		GreenCartData greenElemPage = new GreenCartData(driver);
		greenElemPage.AgreeChkBtn();
		log.info("clicking on check button for agree terms/conditions");
		test = extent.createTest("ClickCheckBtn");
		Thread.sleep(3000);
		
	}
	
	@Test (priority = 11)
	public void FinalProceedBtn() throws InterruptedException {
		GreenCartData greenElemPage = new GreenCartData(driver);
		greenElemPage.ProceedBtn();
		log.debug("clicking on Final proceed button");
		test = extent.createTest("FinalProceedBtn");
		Thread.sleep(5000);
		
	}
	
	@AfterTest
	public void closeDriver() {
		log.info("closing greenkart website tab");
		driver.close();
	}
	
	
	
	 

}
