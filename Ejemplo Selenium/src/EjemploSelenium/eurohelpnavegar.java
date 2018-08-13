package EjemploSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class eurohelpnavegar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\adminlocal\\eclipse-workspace\\SeleniumTest\\lib\\Chromedriver\\chromedriver.exe");
		



		WebDriver driver1 = new ChromeDriver();
		driver1.get("http://www.eurohelp.es/");
		driver1.manage().window().maximize();
		
		WebElement element1 = driver1.findElement(By.linkText("Company"));
		element1.click();
		
		WebElement element2 = driver1.findElement(By.linkText("Location"));
		element2.click();
		
		WebElement element3 = driver1.findElement(By.linkText("News"));
		element3.click();
		
		WebElement element4 = driver1.findElement(By.linkText("Employment"));
		element4.click();
		
		WebElement element5 = driver1.findElement(By.linkText("Clients"));
		element5.click();
		
		WebElement element6 = driver1.findElement(By.id("logoImg"));
		element6.click();
		
		
	}

}
