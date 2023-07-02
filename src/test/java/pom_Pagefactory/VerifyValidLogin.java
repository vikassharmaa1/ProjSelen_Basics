package pom_Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import helper.BrowserFactory;

public class VerifyValidLogin

{

	@Test
	public void checkValidUser() {

		WebDriver driver = BrowserFactory.startBrowser("firefox", "http://demosite.center/wordpress/wp-login.php");
		LoginPageNew login_page = PageFactory.initElements(driver, LoginPageNew.class);
		login_page.login_wordpress("admin", "demo123");

	}

}
