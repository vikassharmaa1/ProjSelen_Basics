package capabilities;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserCapabilities {

	public static void main(String[] args) {
		WebDriver driver = null;

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\vikas\\eclipse-workspace\\ProjSelen_Basics\\src\\resources\\geckodriver.exe");
		Map capabilitiesMap = new HashMap();
		capabilitiesMap.put("takesScreenshot", "true");
		DesiredCapabilities capabilities = new DesiredCapabilities(capabilitiesMap);
		driver = new FirefoxDriver(capabilities);
		driver.get("https://www.google.com/");
		File srcfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		System.out.println(srcfile.getAbsolutePath());

	}

}
