package customizedReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class VerifySeleniumTitle {
	
	@Test
	public void VerifyTitle(){
		ExtentReports logger;
			
		logger = new ExtentReports();
		
		ExtentTest test = logger.createTest("VerifySeleniumTitle", "VerifySeleniumTitle");
				
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		test.info("Browser is up and running");		
		driver.get("http://learn-automation.com");
		test.info("Application is up and running");
		
		String title = driver.getTitle();
		test.info("Ttile Captured");
		
		Assert.assertTrue(title.contains("Selenium"));
		test.info("Selenium Title is Verified");
		
		logger.removeTest(test);
		logger.flush();
		
	}

}
