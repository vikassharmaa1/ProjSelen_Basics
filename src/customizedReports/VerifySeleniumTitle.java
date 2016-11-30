package customizedReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class VerifySeleniumTitle {
	
	@Test
	public void VerifyTitle(){
		ExtentReports logger;
			
		logger = new ExtentReports("C:\\Users\\VS0071652\\Downloads\\ExtentReports for Selenium\\Report\\Customized Report.html", true);
		
		ExtentTest test = logger.startTest("VerifySeleniumTitle", "VerifySeleniumTitle");
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		test.log(LogStatus.INFO, "Browser is up and running");
		
		driver.get("http://learn-automation.com");
		test.log(LogStatus.INFO, "Application is up and running");
		
		String title = driver.getTitle();
		test.log(LogStatus.INFO, "Ttile Captured");
		
		Assert.assertTrue(title.contains("Selenium"));
		test.log(LogStatus.PASS, "Selenium Title is Verified");
		
		logger.endTest(test);
		logger.flush();
		
	}

}
