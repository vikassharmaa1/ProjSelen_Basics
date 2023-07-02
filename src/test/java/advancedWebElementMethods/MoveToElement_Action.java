package advancedWebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement_Action {

	public static void main(String[] args) {
		WebDriver driver = null;

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\vikas\\eclipse-workspace\\ProjSelen_Basics\\src\\resources\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file://C:/Selectable.html");
		WebElement three = driver.findElement(By.name("three"));

		// Actions class: WE moveToElement method
		Actions builder = new Actions(driver);
		builder.moveToElement(three);
		builder.clickAndHold();
		builder.moveByOffset(120, 0);
		builder.perform();

	}

}
