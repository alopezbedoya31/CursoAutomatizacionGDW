package com.computrabajo.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.computrabajo.pages.InicioCompu;



public class LoginTest {

	WebDriver driver;
	
	@Before
	
	public void initDriver() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe"); //  seteo de las propiedades del driver 
		driver = new ChromeDriver(); //instanciar el driver
		driver.get("https://www.computrabajo.com.co/");
	}
	
	@Test
	public void test() throws InterruptedException {
		InicioCompu inidri = new InicioCompu(driver);
		
		inidri.login("andreskamui.31@gmail.com", "andr35l0p3z");
		
		Assert.assertTrue("Edgar Andres Lopez Bedoya", inidri.validateLogin());
		
	}
	
	@After
	
	public void cerrar () {
		//driver.close();
	}

}
