package advancedWebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveByOffset_Method {

	public static void main(String[] args) {
		WebDriver driver = null;

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\vikas\\eclipse-workspace\\ProjSelen_Basics\\src\\resources\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file://C:/Selectable.html");
		WebElement seven = driver.findElement(By.name("seven"));
		System.out.println(
				"X Coordinate : " + seven.getLocation().getX() + "Y Coordinate : " + seven.getLocation().getY());

		// Actions class: WE moveByOffset method
		Actions builder = new Actions(driver);
		builder.moveByOffset(seven.getLocation().getX() + 1, seven.getLocation().getY() + 1).click();
		builder.perform();

	}

}
