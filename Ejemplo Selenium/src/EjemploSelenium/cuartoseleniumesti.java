package EjemploSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class cuartoseleniumesti {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "\\Users\\adminlocal\\eclipse-workspace\\SeleniumTest\\lib\\geckodriver\\geckodriver.exe");
		System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		WebDriver driver = new FirefoxDriver();
		WebDriver driver1 = new FirefoxDriver();
		Alert alertmessage;
		
		String baseUrl = "https://wiki.eurohelp.es/login.action?os_destination=%2Fhomepage.action";
		driver.get(baseUrl);
		
		
		System.out.println("Titulo de la pagina web mostrada : " + driver.getTitle());
		
		//System.out.println("codigo fuente de la pagina web mostrada como valor de cadena : " + driver.getPageSource());
		
		System.out.println("direccion URL actual de la pagina web mostrada : " + driver.getCurrentUrl());
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
							
		
			
		
		//driver.getClass();
		driver.findElement(By.id("loginButton")).click();
		
		// para usar en una pantalla que salgan alertas 
		//alertmessage = driver.switchTo().alert();
		
	//	String texto = alertmessage.getText();
		
		// alertmessage = driver.switchTo().alert().getText();
		
		 //System.out.println(texto);
		
		
	
		
		
		
		
		
		
		
		//driver1.navigate().to("https://jira.eurohelp.es/secure/Dashboard.jspa");
		driver1.get("https://jira.eurohelp.es/secure/Dashboard.jspa");
		//driver1.getClass();
		//System.out.println(driver1.findElement(By.className("button")));
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		// WebElement txtGoogle = (WebElement) Wait.until(ExpectedConditions.elementToBeClickable(By.id("login")));
		//txtGoogle.click();
		driver1.findElement(By.id("login")).click();
		
		
		
		
		
		driver.close();
		driver1.close();
		
		
		
		//System.exit(0);
		

	}

}
