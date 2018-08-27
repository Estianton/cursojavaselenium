package EjemploSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class entrarivapxlnet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\adminlocal\\eclipse-workspace\\SeleniumTest\\lib\\Chromedriver\\chromedriver.exe");
		



		WebDriver driver1 = new ChromeDriver();
		driver1.get("http://www.ivap.jakina.ejiedes.net/s20bWar/comunJSP/s20binicio.do");
		driver1.manage().window().maximize();
		WebElement element1 = driver1.findElement(By.linkText("Sartzeko esteka"));
		element1.click();
		
		WebElement username = driver1.findElement(By.name("idUsuario"));
		WebElement password = driver1.findElement(By.name("idPassword"));
		username.sendKeys("S20S20B1");
		password.sendKeys("S20S20B1");
		
		WebElement login = driver1.findElement(By.name("aceptar"));
		login.click();
		
		String winhandlebefore = driver1.getWindowHandle();
		driver1.switchTo().window(winhandlebefore);
		
		driver1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		WebElement element2 = driver1.findElement(By.linkText("Eu"));
		element2.click();
	
		
		
		
		
	}

}
