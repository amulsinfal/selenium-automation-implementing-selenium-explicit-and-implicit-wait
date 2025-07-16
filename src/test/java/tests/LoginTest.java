package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.ProductsPage;

public class LoginTest extends BaseTest {

	@Test
	public void testLoginWithValidCredentials() {
		LoginPage loginPage = new LoginPage(driver);
		ProductsPage productsPage = loginPage.login("standard_user", "secret_sauce");
		assertTrue(productsPage.isPageDisplayed(), "Products Page is not displayed.");
	}
}
