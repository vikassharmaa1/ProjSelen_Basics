package framesAndWindowshandling;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowsHandlingEx {

	public static void main(String[] args) {
		WebDriver driver = null;

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\vikas\\eclipse-workspace\\ProjSelen_Basics\\src\\resources\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("");

		// Window Handling: getWindowHandle() method
		String firstWindow = driver.getWindowHandle();
		System.out.println("firstWindow:" + firstWindow);
		driver.findElement(By.xpath("")).click();
		System.out.println(driver.getWindowHandle());
		
		// Window Handling: getWindowHandles() method: usage-here: to get set of window
		// handles and iterate using iterator
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> iterator = windowHandles.iterator();
		
		String secondWindow = "";

		//ignore windowId?equals(firstWindow):secondWindow = windowId& print
		while (iterator.hasNext()) {

			String windowId = iterator.next();
			if (windowId.equalsIgnoreCase("firstWindow")) {

				System.out.println("Ignore");
			} else {

				secondWindow = windowId;

			}

		}
		System.out.println("secondWindow" + secondWindow);
		
		//Window Handling: switchTo().window() method
		driver.switchTo().window(secondWindow);
		System.out.println(driver.getWindowHandle());
		WebElement userElement = driver.findElement(By.id(""));
		userElement.sendKeys("Vikas");
		driver.close();

	}

}
