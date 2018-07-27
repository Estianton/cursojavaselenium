package EjemploSelenium;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sextoejemploesti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.gecko.driver", "\\Users\\adminlocal\\eclipse-workspace\\SeleniumTest\\lib\\geckodriver\\geckodriver.exe");
		System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		WebDriver driver = new FirefoxDriver();
		
		
	
		
		String baseUrl = "https://intranet.eurohelp.es/login.php";
		driver.get(baseUrl);

		WebElement username = driver.findElement(By.id("nom_usuario"));
		WebElement password = driver.findElement(By.id("contrasena"));
		
		
		username.sendKeys("eanton");
		password.sendKeys("templario10");
		
		WebElement login = driver.findElement(By.id("aceptar"));
		
		login.click();
		
		
		// buscar en la pagina de directorio
		
				WebElement directorio1 = driver.findElement(By.linkText("Directorio"));
				
				directorio1.click();
				
				WebElement nombre = driver.findElement(By.id("nombre"));
				
				nombre.sendKeys("esti");
				
				WebElement oficina = driver.findElement(By.name("oficina"));
				
				oficina.sendKeys("Bilbao");
				
				
				
				WebElement buscar = driver.findElement(By.id("busca"));
				
				buscar.click();
				
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
			String personalink = driver.findElement(By.xpath("//table/tbody/tr[2]/td[3]")).getText();
			
			System.out.println(personalink);
				
			WebElement persona = driver.findElement(By.xpath("//table/tbody/tr[2]/td[3]"));
				
				persona.click();
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				WebElement volver = driver.findElement(By.id("volver"));
				
				volver.click();	
				
				WebElement cerrarsesion = driver.findElement(By.linkText("Desconectar"));
				
				cerrarsesion.click();
				
					
			
			driver.quit();
				
				
	}

}
