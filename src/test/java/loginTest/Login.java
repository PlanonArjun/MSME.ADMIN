package loginTest;

import org.testng.annotations.Test;

import pageobjects.AdminDashboard;
import utilities.BaseClass;

public class Login extends BaseClass {

	@Test
	public void loginapp() {
		System.out.println("Login sucessfull");
		
		AdminDashboard ad = new AdminDashboard(driver);
		ad.clickOnMasterDataCategories();

	}

}
