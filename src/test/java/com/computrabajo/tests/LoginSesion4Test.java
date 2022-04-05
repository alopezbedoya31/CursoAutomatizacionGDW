package com.computrabajo.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.computrabajo.pages.InicioCompu;
import com.computrabajo.pages.LoginSesion4;

public class LoginSesion4Test {

WebDriver driver;

LoginSesion4 factory;
	
	@Before
	
	public void initDriver() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe"); //  seteo de las propiedades del driver 
		driver = new ChromeDriver(); //instanciar el driver
		driver.get("http://sahitest.com/demo/training/login.htm");
		
		// inicializa los elementos  de la clase. Se debe hacer para todas las clases
		factory = PageFactory.initElements(driver, LoginSesion4.class);  
	}
	
	@Test
	public void test()  {
		factory.iniciarSesion("","");
		
		Assert.assertTrue("No inicio sesion", factory.validateLogin());
		
	}
	
	@After
	
	public void cerrar () {
		driver.quit();
	}
}
