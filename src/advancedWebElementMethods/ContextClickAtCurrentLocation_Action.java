package advancedWebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickAtCurrentLocation_Action {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file://C:/ContextClick.html");
		WebElement contextMenu = driver.findElement(By.id("div-context"));

		Actions builder = new Actions(driver);
		builder.moveToElement(contextMenu);
		builder.contextClick();
		builder.click(driver.findElement(By.name("Item 4")));
		builder.perform();

	}

}
