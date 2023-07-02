package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetSize_Method {

	public static void main(String[] args) {
		WebDriver driver = null;

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\vikas\\eclipse-workspace\\ProjSelen_Basics\\src\\resources\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement searchButton = driver.findElement(By.name("btnk"));

		// WebElement getSize() method
		System.out.println(searchButton.getSize());
	}

}
