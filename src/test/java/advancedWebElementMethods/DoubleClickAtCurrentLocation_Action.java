package advancedWebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAtCurrentLocation_Action {

	public static void main(String[] args) {
		WebDriver driver = null;

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\vikas\\eclipse-workspace\\ProjSelen_Basics\\src\\resources\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file://C:/DoubleClick.html");
		WebElement dblClick = driver.findElement(By.name("dblClick"));

		// Actions class: WE doubleClickAtCurrentLocation method
		Actions builder = new Actions(driver);
		builder.moveToElement(dblClick).doubleClick().perform();

	}

}
