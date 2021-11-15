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

	// *****************************************************************************************

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
		desktop.clickAddToCartHP();
		logger.info("User clicked on add HP_LP to shoping cart");

	}

//	@When("User select quantity {int}")
//	public void user_select_quantity(Integer int1) {

//	}

	@When("User click add to Cart button")
	public void user_click_add_to_cart_button() {
		desktop.clickOnAddHP_LPToShoppingCart();
		logger.info("User clicked on add to cart HP");

	}

	@Then("User should see a message ‘Success: you have added HP LP {int} to your Shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_hp_lp_to_your_shopping_cart(Integer int1) {
		Assert.assertEquals(int1, desktop.getSuccessMessageForHP());
		logger.info("Success message is displayed");
		UtilityClass.takeScreenShot();
	}

	// *******************************************************************************************

	// User add Canon EOS 5D from Desktops tab to the cart

	@When("User click  ADD TO CART option on ‘Canon EOS 5D’ item")
	public void user_click_add_to_cart_option_on_canon_eos_5d_item() {

		logger.info("User clicked add to cart");

	}

	@When("User select color from dropdown ‘Red’")
	public void user_select_color_from_dropdown_red() {

		logger.info("User clicked on select color");

	}

	@Then("User should see a message ‘Success: You have added Canon EOS 5D to your shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_canon_eos_5d_to_your_shopping_cart() {

	}

	// ********************************************************************************************

	// User add a review to Canon EOS 5D item in Desktops tab

	@When("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() {

	}

	@When("User click on write a review link")
	public void user_click_on_write_a_review_link() {

	}

	@When("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(DataTable dataTable)
			throws InterruptedException {

		List<Map<String, String>> value = dataTable.asMaps(String.class, String.class);
		desktop.enterYourName(value.get(0).get("yourname"));
		Thread.sleep(3000);
	}

	@When("User click on Continue Button")
	public void user_click_on_continue_button() {

	}

	@Then("User should see a message with ‘Thank you for your review. It has been submitted to the webmaster for approval.”")
	public void user_should_see_a_message_with_thank_you_for_your_review_it_has_been_submitted_to_the_webmaster_for_approval() {

	}

}
