package pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.xml.xpath.XPath;
import java.security.PrivateKey;

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

    @FindBy(xpath = "//button[text()='Cancel']")
    private WebElement cancelBtn;

    @FindBy(xpath = "//button[@type=\"button\" and text()=' Save']")
    private WebElement saveBtn;
}
