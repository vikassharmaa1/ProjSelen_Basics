package xploreNavigate_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigate_Method {

	public static void main(String[] args) {

		WebDriver driver = null;

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\vikas\\eclipse-workspace\\ProjSelen_Basics\\src\\resources\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://www.google.com/");

		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Selenium");
		WebElement searchButton = driver.findElement(By.name("btnG"));
		searchButton.click();
		searchBox.clear();
		searchBox.sendKeys("Selenium WebDriver");
		searchButton.click();

		//WebDriver Navigate methods
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();

	}

}
