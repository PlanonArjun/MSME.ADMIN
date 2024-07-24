package pageobjects;

import java.time.Duration;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CategoriesPage {
	private WebDriver driver;
	private WebDriverWait wait;
	private JavascriptExecutor js;

	// Grid Actions
	@FindBy(css = ".k-loading-image")
	private WebElement kenduGridLoader;

	@FindBy(xpath = "//span[contains(@class,'add-permission')]")
	private WebElement addIcon;

	@FindBy(xpath = "//span[contains(@class,'icon edit-permission')]")
	private WebElement editIcon;

	@FindBy(xpath = "//span[contains(@class,'icon delete-permission')]")
	private WebElement deleteIcon;

	@FindBy(xpath = "//span[contains(@class,'icon disable-permission')]")
	private WebElement activeInactiveIcon;

	@FindBy(xpath = "//span[contains(@class,'icon excel-permission c-pointer pulse')]")
	private WebElement exportToExcelIcon;

	// Form Actions
	/** Category Details **/
	@FindBy(css = ".animate-spin")
	private WebElement dropdownSpinner;

	@FindBy(xpath = "//input[@name='code']")
	private WebElement categoryCodeTxt;

	@FindBy(xpath = "//input[@name='name' and @placeholder='Enter Name']")
	private WebElement categoryNameTxt;

	/** Subcategory Details **/
	@FindBy(xpath = "//div[@data-tip='Add']")
	private WebElement subCategoryAddIcon;

	@FindBy(xpath = "//div[@data-tip='Edit']")
	private WebElement subCategoryEditIcon;

	@FindBy(xpath = "//div[@data-tip='Delete']")
	private WebElement subCategoryDeleteIcon;

	@FindBy(xpath = "//input[@name='subCategoryCode']")
	private WebElement subCategoryCodeTxt;

	@FindBy(xpath = "//input[@name='subCategory' and @placeholder='Enter Name']")
	private WebElement subCategoryNameTxt;

	@FindBy(xpath = "//*[@type='button' and text()='Ok']")
	private WebElement subCategoryOkBtn;

	@FindBy(xpath = "//*[@type='reset' and text()=' Cancel']")
	private WebElement subCategoryCancelBtn;

	@FindBy(xpath = "//span[@class='icon check']")
	private WebElement categorySaveBtn;

	@FindBy(xpath = "//button[@type='reset']")
	private WebElement categoryCancelBtn;

	public CategoriesPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Set the wait timeout to 10 seconds
		js = (JavascriptExecutor) driver;
		PageFactory.initElements(driver, this);
	}

	public void clickOnaddIcon() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.invisibilityOf(kenduGridLoader));
		wait.until(ExpectedConditions.elementToBeClickable(addIcon)).click();
	}

	public void clickOnEditIcon() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.invisibilityOf(kenduGridLoader));
		wait.until(ExpectedConditions.elementToBeClickable(editIcon)).click();
	}

	public void clickOnDeleteIcon() {
		wait.until(ExpectedConditions.invisibilityOf(kenduGridLoader));
		wait.until(ExpectedConditions.elementToBeClickable(deleteIcon)).click();
	}

	public void clickOnActiveInactiveIcon() {
		wait.until(ExpectedConditions.invisibilityOf(kenduGridLoader));
		wait.until(ExpectedConditions.elementToBeClickable(activeInactiveIcon)).click();
	}

	public void clickOnExportToExcelIcon() {
		wait.until(ExpectedConditions.invisibilityOf(kenduGridLoader));
		wait.until(ExpectedConditions.elementToBeClickable(exportToExcelIcon)).click();
	}

	public void addCategoryDetails(WebDriver driver, Map<String, String> categoryDetails) {

		String categoryCode = categoryDetails.get("categoryCode");
		String categoryName = categoryDetails.get("categoryName");
		String subCategoryCode = categoryDetails.get("subCategoryCode");
		String subCategoryName = categoryDetails.get("subCategoryName");

		js.executeScript("return document.readyState").toString().equals("complete");
		wait.until(ExpectedConditions.invisibilityOfAllElements(dropdownSpinner));

		wait.until(ExpectedConditions.visibilityOfAllElements(categoryCodeTxt));
		categoryCodeTxt.sendKeys(categoryCode);

		wait.until(ExpectedConditions.visibilityOfAllElements(categoryNameTxt));
		categoryNameTxt.sendKeys(categoryName);

		wait.until(ExpectedConditions.elementToBeClickable(subCategoryAddIcon));
		subCategoryAddIcon.click();

		wait.until(ExpectedConditions.visibilityOfAllElements(subCategoryCodeTxt));
		subCategoryCodeTxt.sendKeys(subCategoryCode);

		wait.until(ExpectedConditions.visibilityOfAllElements(subCategoryNameTxt));
		subCategoryNameTxt.sendKeys(subCategoryName);

		wait.until(ExpectedConditions.visibilityOfAllElements(subCategoryOkBtn));
		subCategoryOkBtn.click();

		wait.until(ExpectedConditions.invisibilityOfAllElements(subCategoryOkBtn));
		wait.until(ExpectedConditions.visibilityOfAllElements(categorySaveBtn));
		categorySaveBtn.click();

	}
}
