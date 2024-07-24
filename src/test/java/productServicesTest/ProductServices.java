package productServicesTest;


import org.testng.annotations.Test;
import pageobjects.AdminDashboard;
import utilities.BaseClass;

public class ProductServices extends BaseClass {

    @Test
    public void productServices() {
        System.out.println("Category page loaded successfully");
        AdminDashboard ad = new AdminDashboard(driver);
        ad.clickOnMasterDataProductsServices();


    }
}
