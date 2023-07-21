package PageObjectData;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Utilities.CommonUtilities;

public class GreenCartData extends CommonUtilities {

	WebDriver driver;

	public GreenCartData(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(className = "search-keyword")
	public WebElement Search_Field;

	@FindBy(className = "search-button")
	public WebElement Search_Button;
	
	@FindBy(className = "quantity")
	public WebElement prodCount;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/div/div/div[2]/a[2]")
	private WebElement increment_btn;

	@FindBy(className = "decrement")
	private WebElement decrement_btn;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/div/div[1]/div[3]/button")
	private WebElement AddToCart_btn;

	@FindBy(xpath = "//*[@id=\"root\"]/div/header/div/div[3]/a[4]/img")
	private WebElement GoToCart_btn;

	@FindBy(xpath = "//*[@id=\"root\"]/div/header/div/div[3]/div[2]/div[2]/button")
	private WebElement Checkout_btn;

	@FindBy(className = "promoCode")
	private WebElement promocode_textfield;

	@FindBy(className = "promoBtn")
	private WebElement promoBtn;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/button")
	private WebElement placeOrder_btn;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div/select")
	private WebElement Country_Dropdown;

	@FindBy(className = "chkAgree")
	private WebElement CheckAgree;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/button")
	private WebElement proceed_btn;

	public void searchVegis() {

		Search_Field.sendKeys("tomato");
		Search_Button.click();

	}
	
	public void clickIncrement_Btn() {
		increment_btn.click();
	}
	
	public String countProduct() {
		WebElement q = prodCount;
		String val = q.getAttribute("value");
		return val;
	}

	public void AddToCartClick() {
		AddToCart_btn.click();
	}
	
	public void CartLogoClick() {
		GoToCart_btn.click();
	}
	
	public void ProceedCheckBtn() {
		Checkout_btn.click();
	}
	public void PromocodeFill() {
		promocode_textfield.sendKeys("rahulshettyacademy");
	}
	public void ApplyPromo() {
		promoBtn.click();;
	}
	
	public void PlaceOrderbtClick() {
		placeOrder_btn.click();
	}
	
	public void selectCountry() {
		Select s = new Select(Country_Dropdown);
		s.selectByVisibleText("India");
		
	}
	public void AgreeChkBtn() {
		CheckAgree.click();
	}
	
	public void ProceedBtn() {
		proceed_btn.click();
	}
	
	

}
