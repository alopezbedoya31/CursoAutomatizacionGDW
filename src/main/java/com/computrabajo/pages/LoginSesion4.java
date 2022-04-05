package com.computrabajo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginSesion4 extends PageFactory { //Hereda 

	@FindBy(name = "user") // anotacion + buscar el objeto
	WebElement txtusu;
	
	@FindBy(name = "password")
	WebElement txtpass;
	
	@FindBy(xpath = "//*[@value='Login']")
	WebElement botlog;
	
	@FindBy(id = "errorMessage")
	WebElement txterr;
	
	
	public void iniciarSesion (String usuario, String password) { // metodo de las acciones
		txtusu.sendKeys(usuario);
		txtpass.sendKeys(password);
		botlog.click();
		
	}
	
	public boolean validateLogin() {
		boolean isValidateLogin = true;
		try {			
			if(txterr.isDisplayed()){
				isValidateLogin = false;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return isValidateLogin;
	}
	
	
}
