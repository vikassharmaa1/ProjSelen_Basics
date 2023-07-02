package handlingAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = null;

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\vikas\\eclipse-workspace\\ProjSelen_Basics\\src\\resources\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://rediffmail.com");
		Thread.sleep(1000);

		// Alert interface: switchTo().alert() method
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());

		// Alert i/f: accept(), dismiss() and sendKeys() method
		alert.accept();
		alert.dismiss();
		alert.sendKeys("Ok");

	}

}
