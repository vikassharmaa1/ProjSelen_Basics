package advancedWebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop_Method {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file://C:/DragMe.html");
		WebElement src = driver.findElement(By.name("draggable"));
		WebElement tgt = driver.findElement(By.name("droppable"));
		Actions builder = new Actions(driver);
		builder.dragAndDrop(src, tgt).perform();

	}

}
