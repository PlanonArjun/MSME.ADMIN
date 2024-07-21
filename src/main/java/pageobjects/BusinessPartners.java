package pageobjects;

import java.text.ParseException;
import java.time.Duration;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import WebdriverActionsUtilties.WebDriverUtility;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.text.SimpleDateFormat;

public class BusinessPartners {

	private WebDriverWait wait;
	private JavascriptExecutor js;
	
	//Grid Actions.
	@FindBy(css = ".k-loading-image")
	private WebElement kenduGridLoader;

	@FindBy(xpath = "//span[contains(@class,'relative inline-block icon add-permission c-pointer pulse')]")
	private WebElement addIcon;

	@FindBy(xpath = "//span[contains(@class,'icon edit-permission c-pointer pulse')]")
	private WebElement editIcon;

	@FindBy(xpath = "//span[contains(@class,'icon disable-permission c-pointer pulse')]")
	private WebElement activeInactiveIcon;

	@FindBy(xpath = "//span[contains(@class,'icon excel-permission c-pointer pulse')]")
	private WebElement exportToExcelIcon;
	
	//Form Actions
	/** Company Details **/
	@FindBy(css = ".animate-spin")
	private WebElement dropdownSpinner;

	@FindBy(xpath = "//input[@type='file' and @accept='.jpeg,.JPEG,jpg,.JPG,.png,.PNG']")
	private WebElement companyLogoImg;

	@FindBy(xpath = "//span[@class='ml-1 text-base' and contains(text(), 'Is Customer')]")
	private WebElement isCustomerCheckbox;

	@FindBy(xpath = "//span[@class='ml-1 text-base' and contains(text(), 'Is Vendor')]")
	private WebElement isVendorCheckbox;

	@FindBy(xpath = "//input[@placeholder='Company Name']")
	private WebElement companyNameTxt;

	@FindBy(xpath = "//select[@name='companyType' and @label='Company Type']")
	private WebElement companyTypeDrp;

	@FindBy(xpath = "//input[@placeholder='Parent Company']")
	private WebElement parentCompanyTypeTxt;

	@FindBy(xpath = "//input[@placeholder='CIN / IIP']")
	private WebElement cinIipTxt;

	@FindBy(xpath = "//input[@placeholder='GST IN']")
	private WebElement gstInTxt;

	@FindBy(xpath = "//input[@placeholder='PAN No']")
	private WebElement panNumberTxt;

	@FindBy(xpath = "//input[@name='companyPhoneNumber' and @placeholder='Phone No']")
	private WebElement phoneNumberTxt;

	@FindBy(xpath = "//input[@placeholder='FAX No']")
	private WebElement faxNumberTxt;

	@FindBy(xpath = "//input[@name='companyEmail' and @placeholder='Email']")
	private WebElement emailTxt;

	@FindBy(xpath = "//input[@name='website' and @placeholder='Website']")
	private WebElement websiteTxt;

	@FindBy(xpath = "//select[@name='gstType' and @label='Select GstType']")
	private WebElement gstTypeDrp;

	@FindBy(xpath = "//input[@placeholder='Opening Balance']")
	private WebElement openingBalanceTxt;

	/** Company Info **/

	@FindBy(xpath = "//input[@placeholder='Account Owner']")
	private WebElement accountOwnerTxt;

	@FindBy(xpath = "//select[@name='industry']")
	private WebElement industryDrp;

	@FindBy(xpath = "//select[@name='priority']")
	private WebElement priorityDrp;

	@FindBy(xpath = "//select[@name='source']")
	private WebElement sourceDrp;

	@FindBy(xpath = "//input[@id='inCorporationDate']")
	private WebElement corporationDateTxt;

	@FindBy(xpath = "//select[@name='inCorporationCountry']")
	private WebElement corporationCountryDrp;

	@FindBy(xpath = "//input[@name='location']")
	private WebElement locationTxt;

	@FindBy(xpath = "//textarea[@name='description']")
	private WebElement descriptionTxt;

	/** Address Details **/
	// Invoice Address
	@FindBy(xpath = "//input[@name='invAddressline1']")
	private WebElement invAddressline1Txt;

	@FindBy(xpath = "//input[@name='invAddressline2']")
	private WebElement invAddressline2Txt;

	@FindBy(xpath = "//select[@name='invState' and @label='State']")
	private WebElement invStateDrp;

	@FindBy(xpath = "//input[@name='invContactName']")
	private WebElement invContactNameTxt;

	@FindBy(xpath = "//input[@name='invPhone']")
	private WebElement invPhoneTxt;

	@FindBy(xpath = "//input[@name='invEmail']")
	private WebElement invEmailTxt;

	// Delivery Address
	@FindBy(xpath = "//input[@name='delAddressline1']")
	private WebElement delAddressline1Txt;

	@FindBy(xpath = "//input[@name='delAddressline2']")
	private WebElement delAddressline2Txt;

	@FindBy(xpath = "//select[@name='delState' and @label='State']")
	private WebElement delStateDrp;

	@FindBy(xpath = "//input[@name='delContactName']")
	private WebElement delContactNameTxt;

	@FindBy(xpath = "//input[@name='delContactName']/following::input[@placeholder='Phone No'][1]")
	private WebElement delPhoneTxt;

	@FindBy(xpath = "//input[@name='delEmail']")
	private WebElement delEmailTxt;

	// Other Address
	@FindBy(xpath = "//input[@name='othAddressline1']")
	private WebElement otherAddressline1Txt;

	@FindBy(xpath = "//input[@name='othAddressline2']")
	private WebElement otherAddressline2Txt;

	@FindBy(xpath = "//select[@name='otherState' and @label='State']")
	private WebElement otherStateDrp;

	@FindBy(xpath = "//input[@name='otherContactName']")
	private WebElement otherContactNameTxt;

	@FindBy(xpath = "//input[@name='otherContactName']/following::input[@name='otherPhone']")
	private WebElement otherPhoneTxt;

	@FindBy(xpath = "//input[@name='otherEmail']")
	private WebElement otherEmailTxt;

	// Key Contact Info
	@FindBy(xpath = "//select[@name='contactInfoTitle' and @label='Title']")
	private WebElement contactInfoTitleDrp;

	@FindBy(xpath = "//input[@name='contactInfoName' and @placeholder='Enter Name']")
	private WebElement contactInfoNameTxt;

	@FindBy(xpath = "//input[@name='department']")
	private WebElement contactInfoDepartmentTxt;

	@FindBy(xpath = "//input[@name='designation']")
	private WebElement contactInfoDesignationTxt;

	@FindBy(xpath = "//input[@name='contactInfoEmail']")
	private WebElement contactInfoEmailTxt;

	@FindBy(xpath = "//input[@name='designation']/following::input[@placeholder='Phone no']")
	private WebElement contactInfoPhonenumberTxt;

	@FindBy(xpath = "//label[text()='Alternative Phone No']//following::input[@placeholder='Phone No']")
	private WebElement contactInfoAlernativePhonenumberTxt;

	@FindBy(xpath = "//textarea[@name='contactInfoDescription']")
	private WebElement contactInfoDescriptionTxt;

	// save button
	@FindBy(xpath = "//button[contains(@class, 'custom-btn') and contains(text(),'Save')]")
	private WebElement saveBtn;

	public BusinessPartners(WebDriver driver) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Set the wait timeout to 10 seconds
		js = (JavascriptExecutor) driver;
		PageFactory.initElements(driver, this);
	}

	// Business Library
	public void clickOnaddIcon() {
		wait.until(ExpectedConditions.invisibilityOf(kenduGridLoader));
		wait.until(ExpectedConditions.elementToBeClickable(addIcon)).click();
	}

	// Business Library
	public void clickIsCustomerCheckbox() {
		wait.until(ExpectedConditions.invisibilityOf(kenduGridLoader));
		wait.until(ExpectedConditions.elementToBeClickable(isCustomerCheckbox)).click();
	}

	// Business Library
	public void clickIsVendorCheckbox() {
		wait.until(ExpectedConditions.invisibilityOf(kenduGridLoader));
		wait.until(ExpectedConditions.elementToBeClickable(isVendorCheckbox)).click();
	}

	public void addBusinessPartnerWithCustomer(WebDriver driver, Map<String, String> contactDetails)
			throws ParseException {

		// Retrieve values from the contactDetails map
		String companyLogo = contactDetails.get("companyLogo");
		String companyName = contactDetails.get("companyName");
		String companyType = contactDetails.get("companyType");
		String parentCompany = contactDetails.get("parentCompany");
		String cinIip = contactDetails.get("cinIip");
		String gstIn = contactDetails.get("gstIn");
		String panNumber = contactDetails.get("panNumber");
		String phoneNumber = contactDetails.get("phoneNumber");
		String faxNumber = contactDetails.get("faxNumber");
		String email = contactDetails.get("email");
		String website = contactDetails.get("website");
		String gstType = contactDetails.get("gstType");
		String openingBalance = contactDetails.get("openingBalance");
		String accountOwner = contactDetails.get("accountOwner");
		String industry = contactDetails.get("industry");
		String priority = contactDetails.get("priority");
		String source = contactDetails.get("source");
		String corporationDate = contactDetails.get("corporationDate");
		String corporationCountry = contactDetails.get("corporationCountry");
		String location = contactDetails.get("location");
		String description = contactDetails.get("description");

		String invAddressline1 = contactDetails.get("invAddressline1");
		String invAddressline2 = contactDetails.get("invAddressline2");
		String invState = contactDetails.get("invState");
		String invContactName = contactDetails.get("invContactName");
		String invPhone = contactDetails.get("invPhone");
		String invEmail = contactDetails.get("invEmail");

		String delAddressline1 = contactDetails.get("delAddressline1");
		String delAddressline2 = contactDetails.get("delAddressline2");
		String delState = contactDetails.get("delState");
		String delContactName = contactDetails.get("delContactName");
		String delPhone = contactDetails.get("delPhone");
		String delEmail = contactDetails.get("delEmail");

		String otherAddressline1 = contactDetails.get("otherAddressline1");
		String otherAddressline2 = contactDetails.get("otherAddressline2");
		String otherState = contactDetails.get("otherState");
		String otherContactName = contactDetails.get("otherContactName");
		String otherPhone = contactDetails.get("otherPhone");
		String otherEmail = contactDetails.get("otherEmail");

		String contactInfoTitle = contactDetails.get("contactInfoTitle");
		String contactInfoName = contactDetails.get("contactInfoName");
		String contactInfoDepartment = contactDetails.get("contactInfoDepartment");
		String contactInfoDesignation = contactDetails.get("contactInfoDesignation");
		String contactInfoEmail = contactDetails.get("contactInfoEmail");
		String contactInfoPhoneNumber = contactDetails.get("contactInfoPhoneNumber");
		String contactInfoAlternativePhoneNumber = contactDetails.get("contactInfoAlternativePhoneNumber");
		String contactInfoDescription = contactDetails.get("contactInfoDescription");

		// Fill in the fields
		// Company Details
		js.executeScript("return document.readyState").toString().equals("complete");
		wait.until(ExpectedConditions.invisibilityOfAllElements(dropdownSpinner));

		clickIsCustomerCheckbox();
		companyNameTxt.sendKeys(companyName);

		wait.until(ExpectedConditions.visibilityOf(companyTypeDrp));
		WebDriverUtility.handleDropDown("HUF", companyTypeDrp);

		parentCompanyTypeTxt.sendKeys(parentCompany);
		cinIipTxt.sendKeys(cinIip);
		gstInTxt.sendKeys(gstIn);
		/*
		 * panNumberTxt.clear(); panNumberTxt.sendKeys(panNumber);
		 */
		panNumberTxt.sendKeys(panNumber);
		phoneNumberTxt.sendKeys(phoneNumber);
		faxNumberTxt.sendKeys(faxNumber);
		emailTxt.sendKeys(email);
		websiteTxt.sendKeys(website);

		wait.until(ExpectedConditions.visibilityOf(gstTypeDrp));
		WebDriverUtility.handleDropDown(gstTypeDrp, "Registered Business - Regular");
		openingBalanceTxt.sendKeys(openingBalance);

		// Company Info
		wait.until(ExpectedConditions.visibilityOf(industryDrp));
		WebDriverUtility.handleDropDown("Education", industryDrp);
		accountOwnerTxt.sendKeys(accountOwner);

		wait.until(ExpectedConditions.visibilityOf(priorityDrp));
		WebDriverUtility.handleDropDown("1", priorityDrp);

		wait.until(ExpectedConditions.visibilityOf(sourceDrp));
		WebDriverUtility.handleDropDown("Web", sourceDrp);
		corporationDateTxt.sendKeys(new SimpleDateFormat("dd-MM-yyyy").format(
				new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", java.util.Locale.ENGLISH).parse(corporationDate)));

		wait.until(ExpectedConditions.visibilityOf(corporationCountryDrp));
		WebDriverUtility.handleDropDown("India", corporationCountryDrp);
		locationTxt.sendKeys(location);
		descriptionTxt.sendKeys(description);

		// Address Details
		invAddressline1Txt.sendKeys(invAddressline1);
		invAddressline2Txt.sendKeys(invAddressline2);

		wait.until(ExpectedConditions.visibilityOf(invStateDrp));
		WebDriverUtility.handleDropDown("Telangana", invStateDrp);
		invContactNameTxt.sendKeys(invContactName);
		invPhoneTxt.sendKeys(invPhone);
		invEmailTxt.sendKeys(invEmail);

		// Delivery Address
		delAddressline1Txt.sendKeys(delAddressline1);
		delAddressline2Txt.sendKeys(delAddressline2);

		wait.until(ExpectedConditions.visibilityOf(delStateDrp));
		WebDriverUtility.handleDropDown("Telangana", delStateDrp);
		delContactNameTxt.sendKeys(delContactName);
		delPhoneTxt.sendKeys(delPhone);
		delEmailTxt.sendKeys(delEmail);

		// Other Address
		otherAddressline1Txt.sendKeys(otherAddressline1);
		otherAddressline2Txt.sendKeys(otherAddressline2);

		wait.until(ExpectedConditions.visibilityOf(otherStateDrp));
		WebDriverUtility.handleDropDown("Telangana", otherStateDrp);

		otherContactNameTxt.sendKeys(otherContactName);
		otherPhoneTxt.sendKeys(otherPhone);
		otherEmailTxt.sendKeys(otherEmail);

		// Key Contact Info
		wait.until(ExpectedConditions.visibilityOf(contactInfoTitleDrp));
		WebDriverUtility.handleDropDown("Mr", contactInfoTitleDrp);
		contactInfoNameTxt.sendKeys(contactInfoName);
		contactInfoDepartmentTxt.sendKeys(contactInfoDepartment);
		contactInfoDesignationTxt.sendKeys(contactInfoDesignation);
		contactInfoEmailTxt.sendKeys(contactInfoEmail);
		contactInfoPhonenumberTxt.sendKeys(contactInfoPhoneNumber);
		contactInfoAlernativePhonenumberTxt.sendKeys(contactInfoAlternativePhoneNumber);
		contactInfoDescriptionTxt.sendKeys(contactInfoDescription);

		// Save
		saveBtn.click();

	}

}
