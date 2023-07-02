package advancedWebElementMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold_CurrentLocation {

	public static void main(String[] args) {
		WebDriver driver = null;

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\vikas\\eclipse-workspace\\ProjSelen_Basics\\src\\resources\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file://C:/Selectable.html");

		// Actions class: clickAndHold at currentLocation method
		Actions builder = new Actions(driver);
		builder.moveByOffset(200, 20);
		builder.clickAndHold();
		builder.moveByOffset(120, 0);
		builder.perform();

	}

}
