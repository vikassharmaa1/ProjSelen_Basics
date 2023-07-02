package testNGAssertions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_Assertions {

	@Test
	public void testCaseVerifyHomePage() {
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://google.com");
		Assert.assertEquals("Google", driver.getTitle());
		Assert.assertEquals("Gooogle", driver.getTitle(), "Strings are not matching");
		// Write a code to login and write a method called
		// isUserLoggedInSuccessfully and isUserLoggedOut which returns boolean.
		Assert.assertTrue(isUserLoggedInSuccessfully(), "User failed to login");
		Assert.assertFalse(isUserLoggedOut());
	}

	private boolean isUserLoggedOut() {
		// TODO Auto-generated method stub
		return false;
	}

	private boolean isUserLoggedInSuccessfully() {
		// TODO Auto-generated method stub
		return false;
	}

}
