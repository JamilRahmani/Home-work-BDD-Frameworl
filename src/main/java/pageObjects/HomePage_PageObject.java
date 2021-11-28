package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HomePage_PageObject extends Base {

	public HomePage_PageObject() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//span[text()='Currency']")
	private WebElement currency;
	@FindBy(xpath = "//button[text()='€ Euro']")
	private WebElement euro;
	@FindBy(xpath = "//strong[text()='€']")
	private WebElement currencyValue;

	// *************************************************************************************
	// User empty Shopping cart message displays Storing Elements

	@FindBy(xpath = "//span[text()='Shopping Cart']")
	private WebElement shopingCart;
	@FindBy(xpath = "(//p[text()='Your shopping cart is empty!'])[2]")
	private WebElement message;

	public void clickOnCurrency() {
		currency.click();

	}

	public void clickOneuro() {
		euro.click();

	}

	public String verifyCurrencySign() {
		return currencyValue.getText();

	}
	// ******************************************************************************

	// User empty Shopping cart message displays Storing Elements

	public void clickOnShopingCart() {
		shopingCart.click();

	}

	public String verifyMessageIsDisplayed() {
		
		return message.getText();

	}
}














