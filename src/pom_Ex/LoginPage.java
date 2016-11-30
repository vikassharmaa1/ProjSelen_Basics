/**
 * 
 */
package pom_Ex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author VS0071652
 *
 */
public class LoginPage {
	WebDriver driver;

	By username = By.id("user_login");
	By password = By.xpath(".//*[@id='user_pass']");
	By loginButton = By.name("wp-submit");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void typeUsername() {
		driver.findElement(username).sendKeys("admin");
	}

	public void typePassword() {
		driver.findElement(password).sendKeys("demo123");
	}

	public void clickOnLoginButton() {
		driver.findElement(loginButton).click();
	}
}
