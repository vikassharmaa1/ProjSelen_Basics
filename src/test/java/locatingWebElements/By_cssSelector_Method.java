package locatingWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class By_cssSelector_Method {

	public static void main(String[] args) {
		WebDriver driver = null;

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\vikas\\eclipse-workspace\\ProjSelen_Basics\\src\\resources\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		// By.cssSelector Locator
		WebElement searchButton = driver.findElement(By.cssSelector("#gbqfba"));
		System.out.println(searchButton.getText());

	}

}
