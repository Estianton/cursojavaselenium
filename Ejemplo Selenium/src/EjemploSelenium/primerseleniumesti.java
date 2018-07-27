package EjemploSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class primerseleniumesti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "\\Users\\adminlocal\\eclipse-workspace\\SeleniumTest\\lib\\geckodriver\\geckodriver.exe");
		System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		WebDriver driver = new FirefoxDriver();
		
		String baseUrl = "http://www.eurohelp.es/";
        String expectedTitle = "EUROHELP | TECNOLOGIAS DE LA INFORMACIÓN.";
        String actualTitle = "";
		
        driver.get(baseUrl);
        
        actualTitle = driver.getTitle();
        
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
        
        driver.close(); 
        
        
        
        
	}

}
