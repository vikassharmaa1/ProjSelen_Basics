package advancedWebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickOnWebElement_Action {

	public static void main(String[] args) {
		WebDriver driver = null;

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\vikas\\eclipse-workspace\\ProjSelen_Basics\\src\\resources\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file://C:/ContextClick.html");
		WebElement contextMenu = driver.findElement(By.id("div-context"));
		
		
		// Actions class: contextClickOnWebElement or Right Click method
		Actions builder = new Actions(driver);
		builder.contextClick(contextMenu);
		builder.click(driver.findElement(By.name("Item 4")));
		builder.perform();

	}

}
