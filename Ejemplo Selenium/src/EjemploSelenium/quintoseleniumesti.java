package EjemploSelenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.gargoylesoftware.htmlunit.WebClient;

public class quintoseleniumesti {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "\\Users\\adminlocal\\eclipse-workspace\\SeleniumTest\\lib\\geckodriver\\geckodriver.exe");
		System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		WebDriver driver = new FirefoxDriver();
		
		
	
		
		String baseUrl = "https://intranet.eurohelp.es/login.php";
		driver.get(baseUrl);
		WebElement username = driver.findElement(By.id("nom_usuario"));
		WebElement password = driver.findElement(By.id("contrasena"));
		
		System.out.println("usuario para entrar" + username);
		System.out.println("contraseña para entrar " + password);
		
		username.sendKeys("eanton");
		password.sendKeys("templario10");
		
		//borrar los valores de los campos
		//username.clear();
		//password.clear();
		
		//para entrar en la aplicacion
		WebElement login = driver.findElement(By.id("aceptar"));
		
		login.click();
		
		//para navegar por al aplicacion
		
		WebElement directorio = driver.findElement(By.linkText("Directorio"));
		
		directorio.click();
		
				
		//WebElement correo = driver.findElement(By.linkText("Correo"));
		
		//correo.click();
		
		WebElement RSS = driver.findElement(By.linkText("RSS"));
		
		RSS.click();
		
		WebElement contacto = driver.findElement(By.linkText("Contacto"));
		
		contacto.click();
		
		WebElement inicio = driver.findElement(By.linkText("Inicio"));
		
		inicio.click();
		
		
		WebElement formacion = driver.findElement(By.linkText("FORMACIÓN ONLINE"));
		
		formacion.click();
		
	
		
		
		
		driver.close();
		

	}

}
