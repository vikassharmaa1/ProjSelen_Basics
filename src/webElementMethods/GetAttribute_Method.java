package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetAttribute_Method {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement searchButton = driver.findElement(By.name("btnk"));

		System.out.println("Id of the button is :" + searchButton.getAttribute("id"));
		System.out.println("Name of the button is :" + searchButton.getAttribute("name"));
		System.out.println("Class of the button is :" + searchButton.getAttribute("class"));
		System.out.println("Label of the button is :" + searchButton.getAttribute("aria- label"));

	}

}
