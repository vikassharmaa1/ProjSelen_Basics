package advancedWebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropBy_Method {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file://C:/DragMe.html");
		WebElement dragMe = driver.findElement(By.name("draggable"));
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(dragMe, 120, 0).perform();

	}

}
