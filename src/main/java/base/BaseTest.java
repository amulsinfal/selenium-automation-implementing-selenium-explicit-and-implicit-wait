package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import factory.DriverFactory;

public class BaseTest {
	
	protected WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver = DriverFactory.initializeDriver("Chrome");
		driver.get("https://www.saucedemo.com");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
