package webTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DatePicker {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = null;

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\vikas\\eclipse-workspace\\ProjSelen_Basics\\src\\resources\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtOnwardCalendar")).click();
		Thread.sleep(3000);
		List<WebElement> fromDate = driver.findElements(By.xpath(".//*[@id='rbcal_txtOnwardCalendar']/table[1]//td"));
		int fromCalender = fromDate.size();
		for (int i = 0; i < fromCalender; i++) {
			String Depdate = fromDate.get(i).getText();
			if (Depdate.equalsIgnoreCase("14")) {
				fromDate.get(i).click();
				break;
			}
			Thread.sleep(3000);
			driver.findElement(By.id("txtReturnCalendar")).click();
			Thread.sleep(3000);
			List<WebElement> toDate = driver.findElements(By.xpath(".//*[@id='rbcal_txtReturnCalendar']/table[2]//td"));
			int toCalender = toDate.size();
			for (int j = 0; j < toCalender; j++) {
				String Retdate = toDate.get(j).getText();
				if (Retdate.equalsIgnoreCase("28")) {
					toDate.get(j).click();
					break;
				}
				driver.quit();

			}

		}

	}
}
