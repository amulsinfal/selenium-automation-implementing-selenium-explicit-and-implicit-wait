package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LogoutTest extends BaseTest{
	
	@Test
	public void testLogout() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage = loginPage.login("standard_user", "secret_sauce").logout();
		assertTrue(loginPage.isPageDisplayed(), "Login Page is not displayed.");
	}
}
