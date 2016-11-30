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
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("");
		String firstWindow = driver.getWindowHandle();
		System.out.println("firstWindow:"+ firstWindow);
		driver.findElement(By.xpath("")).click();
		System.out.println(driver.getWindowHandle());
		
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> iterator = windowHandles.iterator();
		String secondWindow = "";
		
		while(iterator.hasNext())
		{
			
			String WindowId = iterator.next();
			if(WindowId.equalsIgnoreCase("firstWindow"))
			{
				
				System.out.println("Ignore");
			}
			else
			{
				
				secondWindow = WindowId;
				
			}
			
		}
		System.out.println("secondWindow"+ secondWindow);
		driver.switchTo().window(secondWindow);
		System.out.println(driver.getWindowHandle());
		WebElement userElement = driver.findElement(By.id(""));
		userElement.sendKeys("Vikas");
		driver.close();
		
		

	}

}
