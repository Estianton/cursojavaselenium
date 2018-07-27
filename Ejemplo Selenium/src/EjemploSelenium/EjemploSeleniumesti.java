package EjemploSelenium;

import org.openqa.grid.common.SeleniumProtocol;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EjemploSeleniumesti {

	private static final String URL = "http://www.ivap.jakina.ejiedes.net/itzulnet/indice_e.html";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "\\Users\\adminlocal\\eclipse-workspace\\SeleniumTest\\lib\\geckodriver\\geckodriver.exe");
		System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		
		
		
		
		WebDriver driver = new FirefoxDriver();
		driver.get(URL);
		
		
		
		
		
		
		driver.close();
		
		
	}

}
