package com.computrabajo.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElegirTrabTest {
	

	WebDriver driver;
	
	@Before
	
	public void initDriver() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.computrabajo.com.co/");
	}
	

	@Test
	public void test() {
		
	}

}
