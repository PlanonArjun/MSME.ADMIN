package pageobjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AdminDashboard {

	private WebDriver driver;
	private WebDriverWait wait;
	private JavascriptExecutor js;

	@FindBy(css = ".k-loading-image")
	private WebElement kenduGridLoader;

	// Master Data side Menu.
	@FindBy(xpath = "//h4[text()='Master Data' ]//ancestor::*[contains(@class, 'dropdown')]")
	private WebElement masterData;

	@FindBy(xpath = "//h4[text()='Master Data' ]//ancestor::*[contains(@href,'/category')]")
	private WebElement masterDataCategory;

	@FindBy(xpath = "//a[contains(text(),'Categories')]")
	private WebElement CategoriesLnk;

	@FindBy(xpath = "//a[contains(text(),'Product or Services')]")
	private WebElement ProductServicesLnk;

	public AdminDashboard(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Set the wait timeout to 10 seconds
		js = (JavascriptExecutor) driver;
		PageFactory.initElements(driver, this);
	}

	//Master Data Section.
	public void clickOnMasterDataCategories() {
		//side Menu
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@href='/category']//parent::div")));

		WebdriverActionsUtilties.WebDriverUtility.mouseHoverAction(driver, masterData);
		wait.until(ExpectedConditions.visibilityOfAllElements(masterDataCategory));
		masterDataCategory.click();

		WebdriverActionsUtilties.WebDriverUtility.mouseHoverAction(driver, masterData);
		wait.until(ExpectedConditions.visibilityOfAllElements(CategoriesLnk));
		CategoriesLnk.click();
	}

	public void clickOnMasterDataProductsServices() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@href='/category']//parent::div")));

		WebdriverActionsUtilties.WebDriverUtility.mouseHoverAction(driver, masterData);
		wait.until(ExpectedConditions.visibilityOfAllElements(masterDataCategory));
		masterDataCategory.click();

		WebdriverActionsUtilties.WebDriverUtility.mouseHoverAction(driver, masterData);
		wait.until(ExpectedConditions.visibilityOfAllElements(ProductServicesLnk));
		ProductServicesLnk.click();
	}


	

}
