package ProgrammingKnowledge;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

//import pageObjects.Home_Page;

public class AddTest {

	//public static WebDriver driver = null;
	
	@Test
	public void Addtest() {
		MyJUnitClass junit = new MyJUnitClass();
		int result = junit.add(100, 200);
		assertEquals(300,result);
		 
		//System.setProperty("webdriver.chrome.driver", "C:\\selenium-java-3.11.0\\chromedriver.exe");
	    //WebDriver driver = new ChromeDriver();
	    //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    //driver.get("https://www.google.com.au/search?ei=TJwLW5WqC8T68QW--rbQBA&q=calculator+online&oq=calculator&gs_l=psy-ab.3.1.0i131i67k1j0i131k1l3j0l6.3326.5009.0.7794.10.9.0.0.0.0.407.1126.2-2j1j1.4.0....0...1c.1.64.psy-ab..6.4.1122...0i67k1.0.owozjacVH4k");
	    //int a = Integer.valueOf(driver.findElement(By.id("gsr")).getText());
	    //int b = Integer.valueOf(driver.findElement(By.id("cwbt35")).getText());
	    //Home_Page.lnk_MyAccount(driver).click();
		
		
	}

}
