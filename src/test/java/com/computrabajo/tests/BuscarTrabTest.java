package com.computrabajo.tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.computrabajo.pages.InicioCompu;



public class BuscarTrabTest {

	WebDriver driver;
	
	@Before
	
	public void initDriver() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.computrabajo.com.co/");
	}
	
	
	@Test
	public void test() {
		InicioCompu inidri = new InicioCompu(driver);
		inidri.buscarEmpleo("Automatizador QA", "Bogotá, D.C.");
		
	}
	
	@After
	public void close() {
		//driver.close();
	}
	
}