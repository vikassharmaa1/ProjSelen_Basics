package framesAndWindowshandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FramesHandlingEx {

	public static void main(String[] args) {
		WebDriver driver = null;

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\vikas\\eclipse-workspace\\ProjSelen_Basics\\src\\resources\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("");

		// Frame Handling: switchTo().frame() method
		driver.switchTo().frame(0);
		WebElement fname1Element = driver.findElement(By.name("fname1"));
		fname1Element.sendKeys("FirstName1");

		// Frame Handling: switchTo().defaultContent() method
		driver.switchTo().defaultContent();

		driver.switchTo().frame(1);
		WebElement fname2Element = driver.findElement(By.name("fname2"));
		fname2Element.sendKeys("FirstName2");

		driver.switchTo().defaultContent();
		
		// Frame Handling: switchTo().frame() method; usage-here: switching to another frame
		driver.switchTo().frame(2);
		WebElement fname3Element = driver.findElement(By.name("fname3"));
		fname3Element.sendKeys("FirstName3");

	}

}
