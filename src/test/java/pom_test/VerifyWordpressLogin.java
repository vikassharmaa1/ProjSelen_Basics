/**
 * 
 */
package pom_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pom_Ex.LoginPage;

/**
 * @author VS0071652
 *
 */
public class VerifyWordpressLogin {

	@Test
	public void verifyValidLogin() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://wordpress.com/wp-login.php");

		LoginPage login = new LoginPage(driver);
		login.typeUsername();
		login.typePassword();
		login.clickOnLoginButton();
		driver.quit();
				
	}

}
