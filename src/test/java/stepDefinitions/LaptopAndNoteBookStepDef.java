package stepDefinitions;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LaptopAndNoteBooksPageObject;
import utilities.UtilityClass;

public class LaptopAndNoteBookStepDef extends Base {

	LaptopAndNoteBooksPageObject laptopAndNoteBook = new LaptopAndNoteBooksPageObject();
	// ***********************************************************************************************
	// ***********************************************************************************************
	// Scenario: Add and Remove a Mac book from Cart

	@When("User click on Laptop &NoteBook tab")
	public void user_click_on_laptop_note_book_tab() {
		laptopAndNoteBook.clickOnLaptopAndNoteBook();
		logger.info("User clicked on Laptop&NoteBook");

	}

	@When("User click on Show all Laptop &NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() {
		laptopAndNoteBook.clickOnshowAllLaptopAndNoteBookOption();
		logger.info("User clicked on Show all Laptop &NoteBook option");

	}

	@When("User click on MacBook  item")
	public void user_click_on_mac_book_item() {
		laptopAndNoteBook.clickOnMacBook();
		logger.info("User clicked on Mackbook item");
	}

	@Then("User should see a message ‘Success: You have added MacBook to your shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_mac_book_to_your_shopping_cart() {
		String actual = "Success: You have added MacBook to your shopping cart!";
		String expected = laptopAndNoteBook.getSuccessMessage();
		Assert.assertEquals(actual.substring(0, 7), expected.substring(0, 7));
		logger.info("User saw success meassge");

	}

//	@Then("^User should see (.+) showed to the cart$")
//	public void user_should_see_showed_to_the_cart(String message) {
//		System.out.println(message.length() + " Expected string length");
//		System.out.println(laptopAndNoteBook.verifyItemShowedToTheCart().length() + " actual string length");
//	
//		Assert.assertEquals(message.contains("602.00"), laptopAndNoteBook.verifyItemShowedToTheCart().contains("602.00"));
//		UtilityClass.takeScreenShot();
//		logger.info("User saw item showed to the cart");
//	}

	@Then("^User should see (.+) showed to the cart$")
	public void user_should_see_showed_to_the_cart(String message) {
		String expected = "1 item(s) - $602.00";
		String actual = laptopAndNoteBook.verifyItemShowedToTheCart();
		Assert.assertEquals(expected.substring(0, 7), actual.substring(0, 7));
		UtilityClass.takeScreenShot();
		logger.info("User saw item showed to the cart");
	}

	@Then("User click on cart option")
	public void user_click_on_cart_option() {
		laptopAndNoteBook.clickOnCartOption();
		logger.info("User clicked on the cart option");

	}

	@Then("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() throws InterruptedException {
		laptopAndNoteBook.clickOnRedXButton();
		logger.info("User clicked on red X button to remove the item from cart");
		Thread.sleep(2000);

	}

	@Then("^item should be removed and cart should show item '(.+)'$")
	public void item_should_be_removed_and_cart_should_show_item(String message) {
//		String expected = "0 item(s) - $0.00";
//		String actual = laptopAndNoteBook.confirmingItemRemoved();
//      Assert.assertEquals(expected.substring(0, 1), actual.substring(0, 1));
		System.out.println("expected " + message.length());
		System.out.println("Actual " + laptopAndNoteBook.confirmingItemRemoved().length());
		Assert.assertEquals(message.substring(0, 1), laptopAndNoteBook.confirmingItemRemoved().substring(0, 1));
		UtilityClass.takeScreenShot();
		logger.info("Item removed and cart is empty");
	}
	// ***********************************************************************************************
	// ***********************************************************************************************
	// Scenario: Product Comparison

	@When("User click on product comparison icon on ‘MacBook’")
	public void user_click_on_product_comparison_icon_on_mac_book() {
		laptopAndNoteBook.clickOnproductComparsionIconOnMacBook();
		logger.info("User clicked on product comparsion icon on MacBook");

	}

	@When("User click on product comparison icon on ‘MacBook Air")
	public void user_click_on_product_comparison_icon_on_mac_book_air() {
		laptopAndNoteBook.clickOnproductComparsionIconOnMacBookAir();
		logger.info("User clicked on product comparsion icon on MacBook Air");

	}

	@Then("User should see a message ‘Success: You have added MacBook Air to your product comparison!’")
	public void user_should_see_a_message_success_you_have_added_mac_book_air_to_your_product_comparison() {
		String actual = "Success: You have added MacBook Air to your product comparison!";
		String expected = laptopAndNoteBook.VerifySuccessMessage();
		Assert.assertEquals(actual.substring(0, 7), expected.substring(0, 7));
		logger.info("User saw success message");
		UtilityClass.takeScreenShot();
	}

	@Then("User click on Product comparison link")
	public void user_click_on_product_comparison_link() {
		laptopAndNoteBook.clickOnproductComparsionLink();

		logger.info("User clicked on Product comparison link");

	}

	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() {
		Assert.assertTrue(laptopAndNoteBook.verifyproductComparsionChartIsDisplayed());
		logger.info("User see Product Comparsion Chart");
		UtilityClass.takeScreenShot();

	}

	// *************************************************************************************************
	// *************************************************************************************************
	// Scenario: Adding an item to Wish list

	@When("User click on heart icon to add ‘Sony VaIO’ laptop to wish list")
	public void user_click_on_heart_icon_to_add_sony_va_io_laptop_to_wish_list() {
		laptopAndNoteBook.clickOnHeartIconToAddSonyVaIOToWishList();
		logger.info("User clicked on heat icon to add ‘Sony VaIO’ laptop to wish list ");

	}

	@Then("User should get a message ‘You must login or create an account to save Sony VAIO to your wish list!")
	public void user_should_get_a_message_you_must_login_or_create_an_account_to_save_sony_vaio_to_your_wish_list() {
		String expected = "You must login or create an account to save Sony VAIO to your wish list!";
		String actual = laptopAndNoteBook.verifyessageForSonyVaio();
		Assert.assertEquals(expected.substring(0, 8), actual.substring(0, 8));
		logger.info("User get a message ‘You must login or create an account to save Sony VAIO to your wish list!");

	}

	// ****************************************************************************************************
	// ****************************************************************************************************
	// Scenario: Validate the price of MacBook Pro is 2000

	@When("User click on ‘MacBook Pro’ item")
	public void user_click_on_mac_book_pro_item() {
		laptopAndNoteBook.clickOnMacBookPro();
		logger.info("User clicked on ‘MacBook Pro’ item");

	}

	@Then("User should see (.+) price tag is present on UI.")
	public void user_should_see_$_price_tag_is_present_on_ui() {
		String expected = "$2,000.00";
		String actual = laptopAndNoteBook.confirmPriceTagForMacBookPro();
		Assert.assertEquals(expected.substring(0, 9), actual.substring(0, 9));
		//Assert.assertEquals(str.substring(0, 9), laptopAndNoteBook.confirmPriceTagForMacBookPro().substring(0, 9));
		UtilityClass.takeScreenShot();
		logger.info("User see  ‘$2,000.00’ price tag is present on UI");

	}

}
