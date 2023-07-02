package handlingDropdowns;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HandlingDropDown {

	WebDriver driver;

	/**
	 * 
	 * Set up browser settings and open the application
	 * 
	 */

	@Before(value = "")

	public void setUp() {

		driver = new FirefoxDriver();

		// Opened the application

		driver.get("file:///F:/Work/Blogs/testingstuff/DemoWebAlert.html");

		driver.manage().window().maximize();

	}

	/**
	 * 
	 * Test to select the dropdown values
	 * 
	 * @throws InterruptedException
	 * 
	 */

	@Test

	public void testSelectFunctionality() throws InterruptedException {

		// Go to google

		driver.findElement(By.linkText("Google")).click();

		// navigate back to previous webpage

		driver.navigate().back();

		Thread.sleep(5000);

		// select the first operator using "select by value"

		Select sbval = new Select(driver.findElement(By.id("SelectID_One")));

		sbval.selectByValue("greenvalue");

		Thread.sleep(5000);

		// select the second dropdown using "select by visible text"

		Select sbvt = new Select(driver.findElement(By.id("SelectID_Two")));

		sbvt.selectByVisibleText("Lime");

		Thread.sleep(5000);

		// select the third dropdown using "select by index"

		Select sbi = new Select(driver.findElement(By.id("SelectID_Three")));

		sbi.selectByIndex(2);

		Thread.sleep(5000);

	}

	/**
	 * 
	 * Tear down the setup after test completes
	 * 
	 */

	@After(value = "")

	public void tearDown() {

		driver.quit();

	}

}
