package handlingCookies;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StoreCookieInfo {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("vikassharmaa1@gmail.com");
		;
		driver.findElement(By.name("pass")).sendKeys("facebook");
		;
		driver.findElement(By.name("persistent")).click();
		driver.findElement(By.name("pass")).submit();

		File f = new File("browser.data");
		try {
			f.delete();
			f.createNewFile();
			FileWriter fos = new FileWriter(f);
			BufferedWriter bos = new BufferedWriter(fos);
			Set<Cookie> n = driver.manage().getCookies();

			for (Cookie ck : n) {
				bos.write((ck.getName() + ";" + ck.getValue() + ";" + ck.getDomain() + ";" + ck.getPath() + ";"
						+ ck.getExpiry() + ";" + ck.isSecure()));
				bos.newLine();
			}
			bos.flush();
			bos.close();
			fos.close();
		} catch (Exception ex) {

			ex.printStackTrace();
		}

	}

}
