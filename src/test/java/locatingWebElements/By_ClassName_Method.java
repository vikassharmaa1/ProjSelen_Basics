package locatingWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class By_ClassName_Method {

	public static void main(String[] args) {
		WebDriver driver = null;

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\vikas\\eclipse-workspace\\ProjSelen_Basics\\src\\resources\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		// By is a class in org.openqa.selenium package
		// By.className Locator
		WebElement searchBox = driver.findElement(By.className("gsfi"));

		searchBox.sendKeys("Selenium");
		// By.name Locator
		WebElement searchBtn = driver.findElement(By.name("btnG"));

		searchBtn.click();

	}

}
