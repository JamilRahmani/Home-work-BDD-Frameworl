
package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DesctopPageObject;
import utilities.UtilityClass;

public class DesctopStepDefinition extends Base {

	DesctopPageObject desktop = new DesctopPageObject();

	// Desktop: User is on Retail website
	@Given("User is on Retail website")
	public void user_is_on_retail_website() {
		openBrowser();
		logger.info("User is on retail website");
	}

	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() {
		desktop.clickOnDesktopsTab();
		logger.info("User clicked on desctop tab");

	}

	@When("User click on Show all desktops")
	public void user_click_on_show_all_desktops() {
		desktop.clickOnShowAllDesktop();
		logger.info("User clicked on show all desctop");

	}


	// Desktop: Verify all Items are available on the UI
	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() {
		desktop.VerifyAllItemsAreAvailble();
		logger.info("all items are present in desktop page");

	}

	// *********************************************************************************************

	// User add HP LP 3065 from Desktops tab to the cart

	@When("User click  ADD TO CART option on ‘HP LP3065’ item")
	public void user_click_add_to_cart_option_on_hp_lp3065_item() {
		desktop.clickOnAddHP_LPToShoppingCart();
		logger.info("User clicked on add HP_LP to shoping cart");
		
	}
	
	
	@When("User select quantity {int}")
	public void user_select_quantity(Integer int1) throws InterruptedException {
		desktop.enterQuantity();
		logger.info("User selected quantity");
		Thread.sleep(3000);
	}

	@When("User click add to Cart button")
	public void user_click_add_to_cart_button() throws InterruptedException {
		desktop.clickAddToCartHP();
		logger.info("User clicked on add to cart HP");
		Thread.sleep(3000);

	}

	@Then("^User should see a message ‘Success: you have added HP LP to your Shopping cart!’$")
	public void user_should_see_a_message_success_you_have_added_hp_lp_to_your_shopping_cart() {
		String actual = "Success: you have added HP LP 3065 to your Shopping cart!";
		String expected = desktop.getSuccessMessageForHP();
		
		Assert.assertEquals(expected.substring(0, 7), actual.substring(0, 7));
		logger.info("Success message is displayed");
		UtilityClass.takeScreenShot();
		
//		Assert.assertEquals(str1.substring(0, 7), desktop.getSuccessMessageForHP().substring(0, 7));
//		logger.info("Success message is displayed");
//		UtilityClass.takeScreenShot();
	}

	// *******************************************************************************************
	
	// User add Canon EOS 5D from Desktops tab to the cart

	@When("User click  ADD TO CART option on ‘Canon EOS 5D’ item")
	public void user_click_add_to_cart_option_on_canon_eos_5d_item() {
		desktop.ClickAddToCartCanon5D();
		logger.info("User clicked add to cart");

	}

	@When("User select color from dropdown ‘Red’")
	public void user_select_color_from_dropdown_red() {
		desktop.choossingRedColor();
		logger.info("User clicked on select color");

	}

	@Then("^User should see a message ‘Success: You have added Canon EOS 5D to your shopping cart!’$")
	public void user_should_see_a_message_success_you_have_added_canon_eos_5d_to_your_shopping_cart() {
           
		String expected = "Success: You have added Canon EOS 5D to your shopping cart!";
		String actual = desktop.getSuccessMessageForCanon();
		Assert.assertEquals(expected.substring(0, 7), actual.substring(0, 7));
		//Assert.assertEquals(str.substring(0, 7), desktop.getSuccessMessageForCanon().substring(0, 7));
		logger.info("successful message is displayed");
		UtilityClass.takeScreenShot();

	}

	// ********************************************************************************************

	// User add a review to Canon EOS 5D item in Desktops tab

	@When("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() {
		desktop.clickOnCanon5D();
		logger.info("User clicked on canon EOS 5D item");

	}

	@When("User click on write a review link")
	public void user_click_on_write_a_review_link() {
		desktop.clickOnWriteAReview();
		logger.info("User clicked on write a review link");

	}

	@When("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(DataTable dataTable)
			throws InterruptedException {

		List<Map<String, String>> value = dataTable.asMaps(String.class, String.class);
		desktop.enterYourName(value.get(0).get("yourname"));
		//Thread.sleep(2000);
		desktop.enterYourReview(value.get(0).get("yourReview"));
		Thread.sleep(2000);
		desktop.ClickOnRating();
		logger.info("User entered name, review, and rating");

	}

	@When("User click On Continue button")
	public void user_click_On_continue_button() {
		desktop.clickOnContinueButton();
		logger.info("User clicked on continue button");

	}

	@Then("^User should see a message with ‘Thank you for your review. It has been submitted to the webmaster for approval.”$")
	public void user_should_see_a_message_with_thank_you_for_your_review_it_has_been_submitted_to_the_webmaster_for_approval() {
     String actual = "Thank you for your review. It has been submitted to the webmaster for approval.";
     String expected = desktop.getSuccessMessageForReview();
     
     Assert.assertEquals(expected, actual);
     logger.info("The success message is dispalyed");
		
		
	}

}
