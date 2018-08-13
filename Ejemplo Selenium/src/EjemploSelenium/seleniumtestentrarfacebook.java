package EjemploSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumtestentrarfacebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\Users\\adminlocal\\eclipse-workspace\\SeleniumTest\\lib\\Chromedriver\\chromedriver.exe");
		
		WebDriver driver1 = new ChromeDriver();
		driver1.get("http://www.google.com");
		driver1.manage().window().maximize();
		
		WebElement element = driver1.findElement(By.id("lst-ib"));
		element.sendKeys("Pruebas de Esti");
		element.submit();
		
		driver1.close();
		
		WebDriver driver2 = new ChromeDriver();
		driver2.get("https://es-es.facebook.com/");
		driver2.manage().window().maximize();
		
		WebElement username = driver2.findElement(By.name("email"));
		WebElement password = driver2.findElement(By.name("pass"));
		
		
		username.sendKeys("pinypon-ohana@hotmail.com");
		password.sendKeys("angel97");
		
		
		WebElement login = driver2.findElement(By.id("u_0_2"));
		
		login.click();
		
		
		
		driver2.close();
	}

}
