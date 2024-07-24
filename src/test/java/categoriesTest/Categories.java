package categoriesTest;

import dataGenrator.CategoriesGenerator;
import org.testng.annotations.Test;
import pageobjects.AdminDashboard;
import pageobjects.CategoriesPage;
import utilities.BaseClass;

public class Categories extends BaseClass {

    @Test
    public void createCategories() {
        System.out.println("Category page loaded successfully");
        AdminDashboard ad = new AdminDashboard(driver);
        ad.clickOnMasterDataCategories();

        CategoriesPage cP = new CategoriesPage(driver);
        cP.clickOnaddIcon();
        cP.addCategoryDetails(driver, CategoriesGenerator.categoryDetails);
    }

}
