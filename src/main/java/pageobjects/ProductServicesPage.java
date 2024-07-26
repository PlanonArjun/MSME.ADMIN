package pageobjects;

import WebdriverActionsUtilties.WebDriverUtility;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Map;

public class ProductServicesPage {
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
    /** Product or Service DetailsDetails **/
    @FindBy(css = ".animate-spin")
    private WebElement dropdownSpinner;

    @FindBy(xpath = "//select[@name='type' and @label='Type']")
    private WebElement typeDrp;;

    @FindBy(xpath = "//input[@type='checkbox' and @value='external']")
    private WebElement externalRawMaterialCheckbox;

    @FindBy(xpath = "//input[@name='code']")
    private WebElement productCodeTxt;

    @FindBy(xpath = "//input[@name='name']")
    private WebElement productNameText;

    @FindBy(xpath = "//select[@name='category' and @label='Category']")
    private WebElement categoryDrp;

    @FindBy(xpath = "//select[@name='subCategory' and @label='Select SubCategory']")
    private WebElement subCategoryDrp;

    @FindBy(xpath = "//input[@placeholder='Enter Code' and @name='product']")
    private WebElement hSNCodeTxt;

    @FindBy(xpath = "//span[text()='Tax Applicable']")
    private WebElement taxApplicableCheckbox;

    @FindBy(xpath = "//textarea[@name='description']")
    private WebElement descriptionTxt;

    /**Unit Of Measurement**/
    @FindBy(xpath = "//div[@data-tip='Add']")
    private WebElement unitMeasurementAddIcon;

    @FindBy(xpath = "//div[@data-tip='Edit']")
    private WebElement unitMeasurementEditIcon;

    @FindBy(xpath = "//div[@data-tip='Delete']")
    private WebElement unitMeasurementDeleteIcon;

    /**Add Unit Of Measurement (UOM) Details**/
    @FindBy(xpath = "//select[@name='uom']")
    private WebElement umoDrp;

    @FindBy(xpath = "//select[@name='locationId']")
    private WebElement locationDrp;

    @FindBy(xpath = "//input[@name='unitPrice']")
    private WebElement sellingPriceTxt;

    @FindBy(xpath = "//input[@name='map']")
    private WebElement mapTxt;

    @FindBy(xpath = "//input[@name='quantityinStock']")
    private WebElement stockInHandTxtNum;

    @FindBy(xpath = "//input[@name='reorderLevel']")
    private WebElement reorderLevelTxt;

    @FindBy(xpath = "//*[@type='button' and text()='Ok']")
    private WebElement uomPageOkBtn;

    @FindBy(xpath = "//*[@type='button' and text()=' Cancel']")
    private WebElement uomPageCancelBtn;

    //
    @FindBy(xpath = "//button[text()='Cancel']")
    private WebElement cancelBtn;

    @FindBy(xpath = "//button[@type=\"button\" and text()=' Save']")
    private WebElement saveBtn;

    public ProductServicesPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Set the wait timeout to 10 seconds
        js = (JavascriptExecutor) driver;
        PageFactory.initElements(driver, this);
    }
    public void clickOnAddIcon() {
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

    public void addProductServicesDetails(WebDriver driver, Map<String, String> productDetails){

        String type = productDetails.get("type");//drp
        String code = productDetails.get("code");
        String name = productDetails.get("name");
        String category = productDetails.get("category");//drp
        String subCategory = productDetails.get("subCategory");//drp
        String description = productDetails.get("description");
        String umo = productDetails.get("umo");//drp
        String location = productDetails.get("location");//drp
        String sellingPrice = productDetails.get("sellingPrice");
        String map = productDetails.get("map");

        js.executeScript("return document.readyState").toString().equals("complete");
        wait.until(ExpectedConditions.invisibilityOfAllElements(dropdownSpinner));

        wait.until(ExpectedConditions.visibilityOf(typeDrp));
        WebDriverUtility.handleDropDown("Product", typeDrp);

        wait.until(ExpectedConditions.elementToBeClickable(externalRawMaterialCheckbox));
        externalRawMaterialCheckbox.click();

        wait.until(ExpectedConditions.visibilityOf(productCodeTxt));
        productCodeTxt .sendKeys(code);






    }


}
