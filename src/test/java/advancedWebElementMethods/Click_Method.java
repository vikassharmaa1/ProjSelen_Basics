package advancedWebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Click_Method {

	public static void main(String[] args) {
		WebDriver driver = null;

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\vikas\\eclipse-workspace\\ProjSelen_Basics\\src\\resources\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file://C:/Selectable.html");
		WebElement one = driver.findElement(By.name("one"));
		WebElement five = driver.findElement(By.name("five"));
		WebElement seven = driver.findElement(By.name("seven"));

		// Actions class: click() method; build and perform
		Actions builder = new Actions(driver);
		builder.click(one);
		builder.build().perform();

		builder.click(five);
		builder.build().perform();

		builder.click(seven);
		builder.build().perform();

	}

}
