package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class RetailPage_PageObject extends Base {

	public RetailPage_PageObject() {
		PageFactory.initElements(driver, this);
	}
//************************************************************************************************
//************************************************************************************************
	// Scenario: Register as an Affiliate user with Cheque Payment Method

	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement myAccount;
	@FindBy(xpath = "(//a[text()='Login'])[1]")
	private WebElement login;
	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement email;
	@FindBy(xpath = "//input[@id='input-password']")
	private WebElement password;
	@FindBy(xpath = "//input[@value='Login']")
	private WebElement loginButton;
	@FindBy(xpath = "//h2[text()='My Account']")
	private WebElement myAccountDashboard;
	@FindBy(xpath = "//a[text()='Register for an affiliate account']")
	private WebElement registerAsAffiliateUser;
	@FindBy(xpath = "//input[@id='input-company']")
	private WebElement company;
	@FindBy(xpath = "//input[@id='input-website']")
	private WebElement website;
	@FindBy(xpath = "//input[@id='input-tax']")
	private WebElement taxID;
	@FindBy(xpath = "(//div[@class='radio'])[2]")
	private WebElement paymentMethod;
	@FindBy(xpath="//input[@id='input-cheque']")
	private WebElement chequePayeName;
	@FindBy(xpath = "//input[@name='agree']")
	private WebElement checkBox;
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continueButton;
	@FindBy(xpath = "//div[text()=' Success: Your account has been successfully updated.']")
	private WebElement successMessage;

	public void clickOnMyAccount() {
		myAccount.click();

	}

	public void clickOnLogin() {
		login.click();

	}

	public void enterEmailAndPassword(String emailValue, String passwordValue) {
		email.sendKeys(emailValue);
		password.sendKeys(passwordValue);
	}

	public void clickOnLoginButton() {
		loginButton.click();

	}

	public String verifyMyAccountDashboard() {
		return myAccountDashboard.getText();

	}

	public void clickOnRegisterAsAffiliateUser() {
		registerAsAffiliateUser.click();

	}

	public void enterCompany(String companyName) {
		company.sendKeys(companyName);

	}

	public void enterWebsite(String websiteName) {
		website.sendKeys(websiteName);

	}

	public void enterTaxID(String taxIDValue) {
		taxID.sendKeys(taxIDValue);
	}

	public void clickOnPaymentMethod() {
		paymentMethod.click();

	}
	public void enterChequePayeeName(String valueChequePayeeName) {
		chequePayeName.sendKeys(valueChequePayeeName);
	}
	

	public void clickOnCheckBox() {
		checkBox.click();
	}

	public void clickOnContinueButton() {
		continueButton.click();

	}

	public String VerifySuccessMessage() {
		return successMessage.getText();
	}

	// ***********************************************************************************************
	// ***********************************************************************************************
// Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer

	@FindBy(xpath = "//a[text()='Edit your affiliate information']")
	private WebElement editYourAffiliateInformationlink;
	@FindBy(xpath = "//input[@value='bank']")
	private WebElement bankTransfer;
	@FindBy(xpath = "//input[@id='input-bank-name']")
	private WebElement bankName;
	@FindBy(xpath = "//input[@id='input-bank-branch-number']")
	private WebElement aBANumber;
	@FindBy(xpath = "//input[@id='input-bank-swift-code']")
	private WebElement swiftCode;
	@FindBy(xpath = "//input[@id='input-bank-account-name']")
	private WebElement accountName;
	@FindBy(xpath = "//input[@id='input-bank-account-number']")
	private WebElement accountNumber;

	public void clickOnEditYourAffiliateInformationlink() {
		editYourAffiliateInformationlink.click();
	}

	public void clickOnbankTransfer() {
		bankTransfer.click();
	}

	public void enterBankName(String bank_Name) {
		bankName.sendKeys("bank_Name");
	}

	public void enterABANumber(String aba_Number) {
		aBANumber.sendKeys("aba_Number");
	}

	public void enterSwiftCode(String swift_code) {
		swiftCode.sendKeys("swift_code");
	}

	public void enterAccountName(String account_name) {
		accountName.sendKeys("account_name");
	}

	public void enterAccountNumber(String account_num) {
		accountNumber.sendKeys("account_num");

	}

	// ***********************************************************************************************
	// ***********************************************************************************************
	// Scenario: Edit your account Information

	@FindBy(xpath = "//a[text()='Edit your account information']")
	private WebElement editAccountInfo;
	@FindBy(xpath = "//input[@id='input-firstname']")
	private WebElement firstName;
	@FindBy(xpath = "//input[@id='input-lastname']")
	private WebElement lastName;
	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement e_Mail;
	@FindBy(xpath = "//input[@id='input-telephone']")
	private WebElement telephone;
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continue_Button;
	@FindBy(xpath = "//div[text()=' Success: Your account has been successfully updated.']")
	private WebElement success_Message;

	public void clickOnEditAccountInfo() {
		editAccountInfo.click();

	}

	public void enterFirstName(String fName) {
		firstName.sendKeys("fName");

	}

	public void enterLastName(String lNmae) {
		lastName.sendKeys("lNmae");

	}

	public void enterE_Mail(String e_mail) {
		e_Mail.sendKeys("e_mail");

	}

	public void enterTelephone(String teleph) {
		telephone.sendKeys("teleph");

	}

	public void clickOnContinue_Button() {
		continue_Button.click();

	}

	public String verifySuccess_Message() {
		return success_Message.getText(); 

	}

}
