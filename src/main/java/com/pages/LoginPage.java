package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	
	//Locators
	private By username = By.id("user-name");
	private By password = By.id("password");
	private By loginbtn = By.id("login-button");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterUserName(String un) {
		driver.findElement(username).sendKeys(un);
	}
	
	public void enterpassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void clickOnLoginbtn() {
		driver.findElement(loginbtn).click();
	}
	
	public String pageTitle() {
		return driver.getTitle();
	}
	
	public String landingPageURL() {
		return driver.getCurrentUrl();
	}

}
