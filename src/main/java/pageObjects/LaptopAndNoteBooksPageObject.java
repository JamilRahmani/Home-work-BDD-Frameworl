package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LaptopAndNoteBooksPageObject extends Base {

	public LaptopAndNoteBooksPageObject() {
		PageFactory.initElements(driver, this);
	}

//Scenario: Add and Remove a Mac book from Cart 
	@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement LaptopAndNoteBook;
	@FindBy(xpath = "//a[text()='Show All Laptops & Notebooks']")
	private WebElement showAllLaptopAndNoteBookOption;
	@FindBy(xpath = "//a[text()='MacBook']")
	private WebElement macBook;
	@FindBy(xpath = "//button[text()='Add to Cart']")
	private WebElement addToCartButton;
	@FindBy(xpath = "//div[text()='Success: You have added ']")
	private WebElement message;
	@FindBy(xpath = "//*[contains(text(),' 1 item(s) - $602.00')]")
	private WebElement seeItemShowedToTheCart;
	@FindBy(xpath = "//span[@id='cart-total']")
	private WebElement cartOption;
	@FindBy(xpath = "(//button[@type='button'])[6]")
	private WebElement redXButton;
	@FindBy(xpath = "//span[contains(text(),' 0 item(s) - $0.00')]")
	private WebElement itemRemoved;

	// *********************************************************************************************
	// Scenario: Add and Remove a Mac book from Cart

	public void clickOnLaptopAndNoteBook() {
		LaptopAndNoteBook.click();
	}

	public void clickOnshowAllLaptopAndNoteBookOption() {
		showAllLaptopAndNoteBookOption.click();
	}

	public void clickOnMacBook() {
		macBook.click();
	}

	public void clickOnaddToCartButton() {
		addToCartButton.click();
	}

	public String getSuccessMessage() {
		return message.getText();

	}

	public String verifyItemShowedToTheCart() {

		return seeItemShowedToTheCart.getText();

	}

	public void clickOnCartOption() {
		cartOption.click();

	}

	public void clickOnRedXButton() {
		redXButton.click();

	}

	public String confirmingItemRemoved() {
		return itemRemoved.getText();

	}

	// ***********************************************************************************************
	// Scenario: Product Comparison

	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[2]")
	private WebElement productComparsionIconOnMacBook;
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[3]")
	private WebElement productComparsionIconOnMacBookAir;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessage;
	@FindBy(xpath = "//a[text()='product comparison']")
	private WebElement productComparsionLink;
	@FindBy(xpath = "//*[@class='table table-bordered']")
	private WebElement productComparsionChart;

	public void clickOnproductComparsionIconOnMacBook() {
		productComparsionIconOnMacBook.click();

	}

	public void clickOnproductComparsionIconOnMacBookAir() {
		productComparsionIconOnMacBookAir.click();

	}

	public String VerifySuccessMessage() {
		return successMessage.getText();

	}

	public void clickOnproductComparsionLink() {
		productComparsionLink.click();

	}

	public boolean verifyproductComparsionChartIsDisplayed() {
		if (productComparsionChart.isDisplayed())
			return true;
		else
			return false;
	}

	// ***********************************************************************************************
	// ***********************************************************************************************
	// Scenario: Adding an item to Wish list

	@FindBy(xpath = "(//i[@class='fa fa-heart'])[6]")
	private WebElement heartIconToAddSonyVaIOToWishList;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement messageForSonyVaio;

	public void clickOnHeartIconToAddSonyVaIOToWishList() {
		heartIconToAddSonyVaIOToWishList.click();
	}

	public String verifyessageForSonyVaio() {
		return messageForSonyVaio.getText();
	}

	// ****************************************************************************************************
	// ****************************************************************************************************
	// Scenario: Validate the price of MacBook Pro is 2000

	@FindBy(xpath = "//a[text()='MacBook Pro']")
	private WebElement macBookPro;
	@FindBy(xpath = "//h2[text()='$2,000.00']")
	private WebElement priceTagForMacBookPro;

	public void clickOnMacBookPro() {
		macBookPro.click();
	}

	public String confirmPriceTagForMacBookPro() {
     return priceTagForMacBookPro.getText();
	}

}