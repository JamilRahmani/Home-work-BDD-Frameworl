package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.UtilityClass;

public class DesctopPageObject extends Base {

	public DesctopPageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "http://tek-school.com/retail/")
	private WebElement retailWebsite;
	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement desktopsTab;
	@FindBy(xpath = "//a[text()='Show All Desktops']")
	private WebElement showAllDesktop;
	@FindBy(xpath = "(//div[@class='row'])[2]")
	private WebElement VerifyAllItemsAvailble;
	@FindBy(xpath = "(//span[text()='Add to Cart'])[3]")
	private WebElement addHP_LPToShoppingCart;
	@FindBy(xpath = "//input[@id='input-quantity']")
	private WebElement quantity;
	@FindBy(xpath = "//button[text()='Add to Cart']")
	private WebElement addToCartHP;
	@FindBy(xpath = "//div[contains(text(),'Success: You have added ')]")
	private WebElement successMessageForHP;
	@FindBy(xpath = "(//button[@type='button'])[12]")
	private WebElement addToCartCanon5D;
	@FindBy(xpath = "//select[@id='input-option226']")
	private WebElement selectColor;
	@FindBy(xpath = "//select[@id='input-option226']/option[2]")
	private WebElement redColor;
	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement addToCartCanon;
	@FindBy(xpath = "//div[contains(text(),'Success: You have added ')]")
	private WebElement successMessageForCanon;
	@FindBy(xpath = "//a[text()='Canon EOS 5D']")
	private WebElement canon5D;
	@FindBy(xpath = "//a[text()='Write a review']")
	private WebElement writeAReview;
	@FindBy(xpath = "//input[@id='input-name']")
	private WebElement yourName;
	@FindBy(xpath = "//textarea[@id='input-review']")
	private WebElement yourReview;
	@FindBy(xpath = "(//input[@name='rating'])[2]")
	private WebElement rating;
	@FindBy(xpath = "//button[@id='button-review']")
	private WebElement continueButton;
	@FindBy(xpath = "//div[contains(text(),'Thank you for your review.')]")
	private WebElement successMessageForReview;


	public void clickOnDesktopsTab() {
		desktopsTab.click();

	}

	public void clickOnShowAllDesktop() {
		showAllDesktop.click();

	}
	public void VerifyAllItemsAreAvailble() {
		UtilityClass.takeScreenShot();
		
		

	}
	
	
	public void clickOnAddHP_LPToShoppingCart() {
		addHP_LPToShoppingCart.click();

	}

	public void enterQuantity() {
		quantity.clear();
		quantity.sendKeys("1");
		

	}

	public void clickAddToCartHP() {
		addToCartHP.click();
		
	}

	public String getSuccessMessageForHP() {
		return successMessageForHP.getText();

	}

	public void ClickAddToCartCanon5D() {
		addToCartCanon5D.click();

	}

	public void clickOnSelectColor() {
		selectColor.click();

	}

	public void choossingRedColor() {
		redColor.click();
		

	}

	public void clickAddToCartCanon() {
		addToCartCanon.click();

	}

	public String getSuccessMessageForCanon() {
		return successMessageForCanon.getText();
	

	}

	public void clickOnCanon5D() {
		canon5D.click();

	}

	public void clickOnWriteAReview() {
		writeAReview.click();

	}

	public void enterYourName(String yName) {
		yourName.sendKeys(yName);

	}

	public void enterYourReview(String review) {
		yourReview.sendKeys(review);
		

	}

	public void ClickOnRating() {
		rating.click();
		
	}

	public void clickOnContinueButton() {
		continueButton.click();

	}

	public String getSuccessMessageForReview() {
		String msg = successMessageForReview.getText();
		return msg;
		
		
		

	}

}
