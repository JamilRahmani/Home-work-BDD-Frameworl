package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.RetailPage_PageObject;
import utilities.UtilityClass;

public class RetailPageStepDef extends Base {

	RetailPage_PageObject retailPage = new RetailPage_PageObject();

	@Given("User click  on MyAccount")
	public void user_click_on_my_account() {
		retailPage.clickOnMyAccount();
		logger.info("User clicked on my account");
	}

	@When("User click on Login")
	public void user_click_on_login() {
		retailPage.clickOnLogin();
		logger.info("User clicked on login");

	}

	@When("^User enter username '(.+)' and password '(.+)'$")
	public void user_enter_username_user_name_and_password_password(String email, String pass) {
		retailPage.enterEmailAndPassword(email, pass);
		logger.info("user Enter " + email + "and password " + pass);
		UtilityClass.takeScreenShot();

	}

	@When("User click on Login button")
	public void user_click_on_login_button() {
		retailPage.clickOnLoginButton();
		logger.info("User clicked on login button");

	}

	@Then("User should be logged in to MyAccount dashboard")
	public void user_should_be_logged_in_to_my_account_dashboard() {
		String expected = "My Account";
		String actual = retailPage.verifyMyAccountDashboard();
		Assert.assertEquals(expected, actual);
		logger.info("User is loged in to myAccount dashboard");
		UtilityClass.takeScreenShot();
	}

	@When("User click on ‘Register for an Affiliate Account’ link")
	public void user_click_on_register_for_an_affiliate_account_link() {
		retailPage.clickOnRegisterAsAffiliateUser();
		logger.info("User clicked on ‘Register for an Affiliate Account’ link");

	}

	@When("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(DataTable dataTable) {

		List<Map<String, String>> info = dataTable.asMaps(String.class, String.class);
		retailPage.enterCompany(info.get(0).get("company"));
		retailPage.enterWebsite(info.get(0).get("website"));
		retailPage.enterTaxID(info.get(0).get("taxID"));
		retailPage.clickOnPaymentMethod();
		retailPage.enterChequePayeeName(info.get(0).get("paymentMethod"));
		logger.info("user entered personal information " + info.toString());
		UtilityClass.takeScreenShot();
	}

	@When("User check on About us check box")
	public void user_check_on_about_us_check_box() {
		retailPage.clickOnCheckBox();
		logger.info("User checked on About us check box");

	}

	@When("User click on Continue button")
	public void user_click_on_continue_button() {
		retailPage.clickOnContinueButton();
		logger.info("User click on Continue button");
	}

	@Then("User should see a success message")
	public void user_should_see_a_success_message() {
		String expected = "Success: Your account has been successfully updated.";
		String actual = retailPage.VerifySuccessMessage();
		Assert.assertEquals(expected.substring(0, 8), actual.substring(0, 8));
		logger.info("User see a success message");

	}

	// ***********************************************************************************************
	// ***********************************************************************************************
	// Scenario: Edit your affiliate information from Cheque payment method to Bank
	// Transfer

	@When("User click on ‘Edit your affiliate informationlink")
	public void user_click_on_edit_your_affiliate_informationlink() {
		retailPage.clickOnEditYourAffiliateInformationlink();
		logger.info("User clicked on ‘Edit your affiliate informationlink");

	}

	@When("user click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() throws InterruptedException {
		retailPage.clickOnbankTransfer();
		logger.info("user clicked on Bank Transfer radio button");
		Thread.sleep(2000);

	}

	@When("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(DataTable dataTable) {

		List<Map<String, String>> info = dataTable.asMaps(String.class, String.class);
		retailPage.enterBankName(info.get(0).get("bankName"));
		retailPage.enterABANumber(info.get(0).get("abaNumber"));
		retailPage.enterSwiftCode(info.get(0).get("swiftCode"));
		retailPage.enterAccountName(info.get(0).get("accountName"));
		retailPage.enterAccountNumber(info.get(0).get("accountNumber"));
		logger.info("User fill Bank information");
		UtilityClass.takeScreenShot();

	}

	// ***********************************************************************************************
	// ***********************************************************************************************
	// Scenario: Edit your account Information

	@When("User click on ‘Edit your account information’ link")
	public void user_click_on_edit_your_account_information_link() {
		retailPage.clickOnEditAccountInfo();
		logger.info("User click on ‘Edit your account information’ link");

	}

	@When("User modify below information")
	public void user_modify_below_information(DataTable dataTable) {
		List<Map<String, String>> infoForEditAcount = dataTable.asMaps(String.class, String.class);
		retailPage.enterFirstName(infoForEditAcount.get(0).get("firstname"));
		retailPage.enterLastName(infoForEditAcount.get(0).get("lastName"));
		retailPage.enterE_Mail(infoForEditAcount.get(0).get("email"));
		retailPage.enterTelephone(infoForEditAcount.get(0).get("telephone"));
		logger.info("User modified below information");
		UtilityClass.takeScreenShot();

	}

	@When("User click on continue button option")
	public void user_click_on_continue_button_option() {
		retailPage.clickOnContinue_Button();
		logger.info("User clicked on continue button option");

	}

	@Then("User should see a message Success: Your account has been successfully updated.")
	public void user_should_see_a_message_success_your_account_has_been_successfully_updated() {
		String expected = "Success: Your account has been successfully updated.";
		String actual = retailPage.verifySuccess_Message();
		Assert.assertEquals(expected, actual);
		logger.info("User see a message Success: Your account has been successfully updated.");
		UtilityClass.takeScreenShot();

	}

}