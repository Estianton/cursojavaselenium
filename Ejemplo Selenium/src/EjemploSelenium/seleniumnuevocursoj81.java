package EjemploSelenium;

import java.util.Iterator;

import java.util.Set;

import javax.swing.Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;




public class seleniumnuevocursoj81 {
	
	//static InternetExplorerDriver driver1 = new InternetExplorerDriver();

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("java.net.preferIPv4Stack", "true");
System.setProperty("webdriver.ie.driver", "C:\\Users\\adminlocal\\git\\repository\\Ejemplo Selenium\\lib\\IEdriver\\IEDriverServer.exe");		




		
InternetExplorerDriver driver1 = new InternetExplorerDriver();




		driver1.get("http://www.ivap.des.ejgv.jaso/ikastaroak/indice_c.html");
		
		
	
		
		
		String mainwindowshadle = driver1.getWindowHandle();
		
		Set<String> handles = driver1.getWindowHandles();
		
		Iterator<String> it =handles.iterator();
		
		 Alert alert = driver1.switchTo().alert(); 
		 alert.accept();
		
		while (it.hasNext())
		{
			
			String parent = it.next();
			String newin = it.next();
			
			driver1.switchTo().window(newin);
			Thread.sleep(500L);
			driver1.manage().window().maximize();
						
			
					
		
			driver1.manage().window().maximize();
				  
			
			
			WebDriverWait wait0 = new WebDriverWait (driver1, 40);
			WebElement element0 = wait0.until(ExpectedConditions.elementToBeClickable(By.linkText("Vaya a este sitio web (no recomendado).")));
			System.out.println("Se ha cargado la pagina de los permisos");
			WebElement element00 = driver1.findElement(By.linkText("Vaya a este sitio web (no recomendado)."));
			element00.click();
			
		
			
		
			
			
			WebDriverWait wait = new WebDriverWait (driver1, 40);
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Sartzeko esteka")));
					
			
			WebElement element1 = driver1.findElement(By.linkText("Sartzeko esteka"));
			element1.click();
			
			WebElement username = driver1.findElement(By.name("idUsuario"));
			WebElement password = driver1.findElement(By.name("idPassword"));
			username.sendKeys("JURIBEOL");
			password.sendKeys("16265343");
			
			WebElement login = driver1.findElement(By.name("aceptar"));
			login.click();
			
			//esperar hasta que se carga la pagina y se ve el link
			
			String winhandlebefore = driver1.getWindowHandle();
			driver1.switchTo().window(winhandlebefore);
			System.out.println("titulo de la pantalla en la que estamos " + driver1.getTitle());
			
			
			WebDriverWait wait1 = new WebDriverWait (driver1, 50);
			WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Cursos")));
			System.out.println("abrir la opcion menu del menu  curso");
			WebElement menucursos = driver1.findElement(By.linkText("Cursos"));
			menucursos.click();
			
			
			//seleccionar la opcion del menu nuevo curso
			System.out.println("abrir la opcion menu de nuevo curso");
			WebElement consultacursos = driver1.findElement(By.linkText("Nuevo Curso"));
			consultacursos.click();
			Thread.sleep(500L);
			
			//añadir los datos para un curso nuevo,  todos los datos correctos
			
			//pestaña datos generales
			
			Select carpeta1 = new Select (driver1.findElement(By.name("carpeta")));
			carpeta1.selectByVisibleText("UNIVERSIDAD DEUSTO");
						
			WebElement tema1 = driver1.findElement(By.name("T20"));
			tema1.sendKeys("88");
			
			WebElement familia1 = driver1.findElement(By.name("F20"));
			familia1.sendKeys("0");
							
			WebElement des1 = driver1.findElement(By.name("DC20"));
			des1.sendKeys(" Curso de pruebas de esti desde Selenium ");
			
			WebElement des2 = driver1.findElement(By.name("DE20"));
			des2.sendKeys(" EU Curso de pruebas de esti desde Selenium ");
			
			WebElement año = driver1.findElement(By.name("AL20"));
			año.sendKeys("2018");
			
			Select idioma = new Select (driver1.findElement(By.name("ID20")));
			idioma.selectByVisibleText("Euskera");
			
			
			
			Select control = new Select (driver1.findElement(By.name("PC20")));
			control.selectByVisibleText("PUBLICADO");
			
			WebElement concepto = driver1.findElement(By.name("ID_CODIGO20"));
			concepto.sendKeys("002032");
			
			Select idioma1 = new Select (driver1.findElement(By.name("ID20")));
			idioma1.selectByVisibleText("Euskera");
			
			// pestaña lugar y coste
			
			WebElement lugarycoste = driver1.findElement(By.id("capa2"));
			lugarycoste.click();

			Select th = new Select (driver1.findElement(By.name("TH20")));
			th.selectByVisibleText("BIZKAIA");
			
			Thread.sleep(5000L); // esperar que se carge el municipio
			
			Select municipio = new Select (driver1.findElement(By.name("MU20")));
			municipio.selectByVisibleText("SANTURTZI");
			
			Select asistente = new Select (driver1.findElement(By.name("tipoAsistente")));
			asistente.selectByVisibleText("OTROS");
			WebElement añadirasistente = driver1.findElement(By.id("CamposTipAsis"));
			añadirasistente.findElement(By.className("CursorHand"));
	
			
			añadirasistente.click();
			
			
			Select titulacion = new Select (driver1.findElement(By.name("grupoTitulacion")));
			titulacion.selectByVisibleText("A1");
			
			
			WebElement plazas = driver1.findElement(By.name("PL20"));
			plazas.sendKeys("100");
			
			Select tipo = new Select (driver1.findElement(By.name("TC20")));
			tipo.selectByVisibleText("SELECTIVO");
			
			WebElement matricula = driver1.findElement(By.name("MA20"));
			matricula.sendKeys("100");
			
			// pestaña calendario
			
			WebElement calendario = driver1.findElement(By.id("capa3"));
			calendario.click();
			
			WebElement fecha = driver1.findElement(By.name("FIC20"));
			fecha.sendKeys("01/10/2018");
			
			WebElement duracion = driver1.findElement(By.name("DU20"));
			duracion.clear();
			duracion.sendKeys("40:00");
			
			WebElement horario1 = driver1.findElement(By.name("HD20"));
			horario1.sendKeys("09:00");
			
			WebElement horario2 = driver1.findElement(By.name("HH20"));
			horario2.sendKeys("14:00");
			
			//guardar los datos del nuevo curso
			
			WebElement datosgenerales = driver1.findElement(By.id("capa1"));
			datosgenerales.click();
			
			WebElement guardar = driver1.findElement(By.id("botonGuardar"));
			guardar.click();
			Thread.sleep(5000L);
			
			System.out.println ("hemos ejecutado el boton guardar ");
			
			Alert alert1 = driver1.switchTo().alert(); 
			 alert1.accept();
			
			WebElement atras = driver1.findElement(By.linkText("Atrás"));
			atras.click();
			
			//WebElement inicio = driver1.findElement(By.linkText("Inicio"));
			//inicio.click();
			
			
			
			
			// cerrar la pantalla inicial
			driver1.switchTo().window(parent);
			
			
		}
		
	
	}

	
	}

	

