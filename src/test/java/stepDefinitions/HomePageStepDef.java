package stepDefinitions;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage_PageObject;
import utilities.UtilityClass;

public class HomePageStepDef extends Base {

	HomePage_PageObject currency = new HomePage_PageObject();

	@When("User click on Currency")
	public void user_click_on_currency() {
		currency.clickOnCurrency();
		logger.info("User clicked on currency");

	}

	@When("User Choose Euro from dropdown")
	public void user_chose_euro_from_dropdown() {
		currency.clickOneuro();
		logger.info("User chose Euro from dropdown");

	}

	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() {

		String actual = "€";
		String expected = currency.verifyCurrencySign();
		Assert.assertEquals(expected, actual);
		UtilityClass.takeScreenShot();
		logger.info("Currency value changed");

	}

//************************************************************************************************
//User empty Shopping cart message displays 
	
	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() {
		currency.clickOnShopingCart();
		logger.info("User clicked on shoping cart");

	}

	@Then("“Your shopping cart is empty!” message should display")
	public void your_shopping_cart_is_empty_message_should_display() {
		String actual = "Your shopping cart is empty!";
		String expected = currency.verifyMessageIsDisplayed();
		Assert.assertEquals(expected, actual);
		logger.info("Message is displayed");
		UtilityClass.takeScreenShot();

	}

}
