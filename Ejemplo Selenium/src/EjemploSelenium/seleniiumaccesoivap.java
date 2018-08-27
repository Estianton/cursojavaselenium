package EjemploSelenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class seleniiumaccesoivap {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\adminlocal\\eclipse-workspace\\SeleniumTest\\lib\\Chromedriver\\chromedriver.exe");
		



		WebDriver driver1 = new ChromeDriver();
		driver1.get("http://www.ivap.des.ejgv.jaso/ikastaroak/indice_c.html");
		driver1.manage().window().maximize();
		
		
		String mainwindowshadle = driver1.getWindowHandle();
		
		Set<String> handles = driver1.getWindowHandles();
		
		Iterator<String> it =handles.iterator();
		
		
		while (it.hasNext())
		{
			
			String parent = it.next();
			String newin = it.next();
			
			driver1.switchTo().window(newin);
			
		
			driver1.manage().window().maximize();
			
			System.out.println("En que ventana del navegador estoy " + driver1.getCurrentUrl());
			
			// esperar hasta que se carga la pagina y se ve el link
			
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
			
			
			WebDriverWait wait1 = new WebDriverWait (driver1, 40);
			WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Cursos")));
			
			WebElement menucursos = driver1.findElement(By.linkText("Cursos"));
			menucursos.click();
			Thread.sleep(500L);
			
			// seleccion de la opcion del menu consulta de cursos
			WebElement consultacursos = driver1.findElement(By.linkText("Consulta Cursos"));
			consultacursos.click();
			Thread.sleep(500L);
			
			// seleccion de los resultados 
			WebElement resultados = driver1.findElement(By.id("capa2"));
			resultados.click();
			Thread.sleep(5000L);
			WebElement criterios = driver1.findElement(By.id("capa1"));
			criterios.click();
			
			//realizar una busqueda por el campo nombre del curso
			
			WebElement des = driver1.findElement(By.name("NOMBRECURSO"));
			des.sendKeys("esti");
			WebElement buscar = driver1.findElement(By.linkText("Buscar"));
			buscar.click();
			Thread.sleep(5000L);
			WebElement criterios2 = driver1.findElement(By.id("capa1"));
			criterios2.click();
			
			//buscar por los datos incorrectos  de un curso
			Select carpeta = new Select (driver1.findElement(By.name("comboCarpeta")));
			
			carpeta.selectByVisibleText("UNIVERSIDAD DEUSTO");
						
			WebElement tema = driver1.findElement(By.name("TEMA"));
			tema.sendKeys("esti");
			WebElement familia = driver1.findElement(By.name("FAMILIA"));
			familia.sendKeys("esti");
			WebElement buscar1 = driver1.findElement(By.linkText("Buscar"));
			buscar1.click();
			Thread.sleep(5000L);
			WebElement criterios3 = driver1.findElement(By.id("capa1"));
			criterios3.click();
			WebElement limpiar = driver1.findElement(By.linkText("Limpiar"));
			limpiar.click();
			
			// buscar con los datos correctos de un curso con todos
			
			Select carpeta1 = new Select (driver1.findElement(By.name("comboCarpeta")));
			carpeta1.selectByVisibleText("UNIVERSIDAD DEUSTO");
						
			WebElement tema1 = driver1.findElement(By.name("TEMA"));
			tema1.sendKeys("88");
			
			WebElement familia1 = driver1.findElement(By.name("FAMILIA"));
			familia1.sendKeys("0");
							
			WebElement des1 = driver1.findElement(By.name("NOMBRECURSO"));
			des1.sendKeys("esti");
			
			Select situacion = new Select (driver1.findElement(By.name("SITUACION")));
			situacion.selectByVisibleText("Finalizado");
			
			WebElement codigo = driver1.findElement(By.name("CODESI"));
			codigo.sendKeys("12");
			
			WebElement buscar2 = driver1.findElement(By.linkText("Buscar"));
			buscar2.click();
						
			Thread.sleep(5000L);
			WebElement criterios4 = driver1.findElement(By.id("capa1"));
			criterios4.click();
			WebElement limpiar1 = driver1.findElement(By.linkText("Limpiar"));
			limpiar1.click();
			
			
			
			
			
			
			
			
			
			
			
			//Thread.sleep(5000L);
			//WebElement atras = driver1.findElement(By.linkText("Atrás"));
			//atras.click();
			

			
			
			driver1.switchTo().window(parent);
			driver1.close();
			
			
			
			}
			
		}
		
		
			
		
	}


