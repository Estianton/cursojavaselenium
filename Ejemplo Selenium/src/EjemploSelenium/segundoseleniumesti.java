package EjemploSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class segundoseleniumesti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "\\Users\\adminlocal\\eclipse-workspace\\SeleniumTest\\lib\\geckodriver\\geckodriver.exe");
		System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		WebDriver driver = new FirefoxDriver();
		
		String baseUrl = "http://www.facebook.com/";
		String tagname = "";
		String tagname1 = "";
		
		driver.get(baseUrl);
		
		
		
		tagname =driver.findElement(By.id("email")).getTagName();
		System.out.println(" Email de la pagina web " + tagname);
		
		tagname1 =driver.findElement(By.linkText("Registrarte")).getTagName();
		System.out.println(" Texto encontrado en la pagina web " + tagname1);
		
		tagname1 =driver.findElement(By.name("locale")).getTagName();
		System.out.println(" Name encontrado en la pagina web " + tagname1);
		
		//tagname1 =driver.findElement(By.linkText("https://www.facebook.com/recover/initiate?lwv=110&amp;ars=royal_blue_bar\"")).getTagName();
		//System.out.println(" Texto de enlace  encontrado en la pagina web " + tagname1);
		
		//tagname1 =driver.findElement(By.tagName("contraseña")).getTagName();
		//System.out.println(" Etiqueta encontrado en la pagina web " + tagname1);
		
		//tagname1 =driver.findElement(By.xpath("//www.facebook.com/recover/initiate?lwv=110&amp;ars=royal_blue_bar")).getTagName();
		//System.out.println(" path encontrado en la pagina web " + tagname1);
		
		
		driver.close();
		System.exit(0);
		
		
		

	}

}
