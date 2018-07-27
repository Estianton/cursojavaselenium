package EjemploSelenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class septimoseleniumesti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "\\Users\\adminlocal\\eclipse-workspace\\SeleniumTest\\lib\\geckodriver\\geckodriver.exe");
		System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		WebDriver driver = new FirefoxDriver();
		WebDriver driver1 = new FirefoxDriver();
		
	
		
		String baseUrl = "https://intranet.eurohelp.es/login.php";
		driver.get(baseUrl);

		WebElement username = driver.findElement(By.id("nom_usuario"));
		WebElement password = driver.findElement(By.id("contrasena"));
		
		
		username.sendKeys("eanton");
		password.sendKeys("templario10");
		
		WebElement login = driver.findElement(By.id("aceptar"));
		
		login.click();
		
		
		
		WebElement partes = driver.findElement(By.linkText("APLICACION    DE PARTES"));
		
		partes.click();
		
		String titulo = driver.getTitle();
		
		//System.out.println(titulo);
		
		driver1.get("https://intranet.eurohelp.es/enet-partes/home.do");
		
		
		
		
		//rellenar el parte de horas
		
				
		WebElement proyecto  = driver1.findElement(By.name("idProyE1"));
		
		proyecto.sendKeys("SR-234 / 001 - EJIE - MANTENIMIENTO Y EVOLUCION APLICACIONES IVAP");
	
		WebElement horasproyecto  = driver1.findElement(By.name("horasE1"));
		
		horasproyecto.sendKeys("4");
		
		
		WebElement proyectointerno  = driver1.findElement(By.name("idProyI"));
		
		proyectointerno.sendKeys("CS-050 / 001 - EUROHELP - PROYECTO INTERNO DE SGSI");
		
		WebElement horasproyectointerno  = driver1.findElement(By.name("horasI"));
		
		horasproyectointerno.sendKeys("3");
		
		
		
	
		
		
		

	}

}
