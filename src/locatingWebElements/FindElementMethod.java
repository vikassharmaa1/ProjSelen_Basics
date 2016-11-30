package locatingWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//Locate a WebElement using findElement Method

public class FindElementMethod {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement findElement = driver.findElement(By.name("q"));
		findElement.sendKeys("Selenium");
		findElement.submit();

	}

}
