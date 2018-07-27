package EjemploSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class terceroseleniumesti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "\\Users\\adminlocal\\eclipse-workspace\\SeleniumTest\\lib\\geckodriver\\geckodriver.exe");
		System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		WebDriver driver = new FirefoxDriver();
		
		String baseUrl = "https://www.google.com/intl/es/gmail/about/#/";
		driver.get(baseUrl);
		
		
		
		WebElement myelement = driver.findElement(By.id("gmail-devices-play-button"));
		myelement.sendKeys("tutorial");
		
		driver.findElement(By.linkText("Gmail")).click();
		
		driver.close();
		
		System.exit(0);
		
		
		
		
		

	}

}
