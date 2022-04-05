package com.computrabajo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class InicioCompu {

	
	WebDriver driver;
	WebElement txtcargo;
	WebElement botlogin;
	WebElement botbuscar;
	WebElement txtusu;
	WebElement txtpass;
	WebElement botentrar;
	WebElement nombreusu;
	Select sellugar;
	
	public InicioCompu(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public void login (String usuario, String pass) throws InterruptedException {
		botlogin = driver.findElement(By.xpath("//*[@id=\"logintoggle\"]/span"));
		
		Actions movera = new Actions (driver);
		movera.moveToElement(botlogin);
		
		movera.perform();
		
		Thread.sleep(2000);
		
		
		txtusu = driver.findElement(By.id("txEmail"));
		txtusu.sendKeys(usuario);
		
		txtpass = driver.findElement(By.id("txPwd"));
		txtpass.sendKeys(pass);
		
		botentrar = driver.findElement(By.id("btnLogin"));
		botentrar.click();
		
		
		
	}
	
	
	public boolean validateLogin() {
		boolean isValidateLogin = true;
		try {			
			nombreusu = driver.findElement(By.id("usernametitcan"));
			if(nombreusu.isDisplayed()){
				isValidateLogin = true;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return isValidateLogin;
	}
	
	public void buscarEmpleo(String cargo, String lugar) {
		txtcargo = driver.findElement(By.id("sq"));
		txtcargo.sendKeys(cargo);
		
		sellugar = new Select (driver.findElement(By.id("sl")));
		sellugar.selectByVisibleText(lugar);
		
		botbuscar = driver.findElement(By.id("search"));
		botbuscar.click();

	}
	
	
}
