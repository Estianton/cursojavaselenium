package EjemploSelenium;

import java.io.Console;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class seleniumpantallamodal {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "C:\\Users\\adminlocal\\git\\repository\\Ejemplo Selenium\\lib\\IEdriver\\IEDriverServer.exe");		

		////prueba uno no tiene activo la alertas no se muestra da error

	    InternetExplorerDriver driver= new InternetExplorerDriver();
        driver.navigate().to("http://www.agoda.com/?ymsg=1");
        Thread.sleep(3000L);
        //driver.switchTo().alert().accept();
       // System.out.println("Transaction Completed Successfully");
        driver.close();
        
        
        InternetExplorerDriver driver1= new InternetExplorerDriver();

        		driver1.get("http://www.agoda.ae/partners/googlelanding.aspx?CkInYear=2012&CkInMonth=09&CkInDay=04&CkOutYear=2012&CkOutMonth=09&CkOutDay=08&CID=1437890&HotelCode=97190&currency=RUB&language=en&pricedisplay=16960.00&verification=false");
        		//driver1.switchTo().alert().accept();
        		
        		driver1.close();
        		
        		// da error al encontrar el elemento
        		
        		InternetExplorerDriver driver2= new InternetExplorerDriver();
    			driver2.get("http://toolsqa.wpengine.com/handling-alerts-using-selenium-webdriver/");
    			Thread.sleep(3000L);
    			
    			driver2.findElement(By.linkText("pushAlert()")).click();
    			 
    			// Switch the control of 'driver' to the Alert from main Window
    			Alert simpleAlert = driver2.switchTo().alert();
    			
    			// '.Text' is used to get the text from the Alert
    			String alertText = simpleAlert.getText();
    			System.out.println("Alert text is " + alertText);
    					
    			// '.Accept()' is used to accept the alert '(click on the Ok button)'
    			simpleAlert.accept();
    			
    			// driver2.close();
    			
    			
    			
        		

	}

}
