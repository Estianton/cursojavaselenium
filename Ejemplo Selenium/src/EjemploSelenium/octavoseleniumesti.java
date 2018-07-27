package EjemploSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class octavoseleniumesti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "\\Users\\adminlocal\\eclipse-workspace\\SeleniumTest\\lib\\geckodriver\\geckodriver.exe");
		System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://intranet.eurohelp.es/enet-partes/home.do");
		WebElement username = driver.findElement(By.id("nom_usuario"));
		WebElement password = driver.findElement(By.id("contrasena"));
		
		
		username.sendKeys("eanton");
		password.sendKeys("templario10");
		
		WebElement login = driver.findElement(By.id("aceptar"));
		
		login.click();
		
		driver.get("https://intranet.eurohelp.es/enet-partes/home.do");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//guardar sin rellenar nada
		
		WebElement guardar = driver.findElement(By.name("envio"));
		
		guardar.click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//rellenar el parte de horas
		
		
				WebElement proyecto  = driver.findElement(By.name("idProyE1"));
				
				proyecto.sendKeys("SR-234 / 001 - EJIE - MANTENIMIENTO Y EVOLUCION APLICACIONES IVAP");
			
				WebElement horasproyecto  = driver.findElement(By.name("horasE1"));
				
				horasproyecto.sendKeys("4");
				
				
				WebElement proyectointerno  = driver.findElement(By.name("idProyI"));
				
				proyectointerno.sendKeys("CS-050 / 001 - EUROHELP - PROYECTO INTERNO DE SGSI");
				
				WebElement horasproyectointerno  = driver.findElement(By.name("horasI"));
				
				horasproyectointerno.sendKeys("3");
				
		
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}

}
