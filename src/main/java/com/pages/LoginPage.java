package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	
	//Locators
	private By username = By.id("user-name");
	private By password = By.id("password");
	private By loginbtn = By.id("login-button");
	private By menu = By.xpath("//button[text()='Open Menu']");
	private By logoutbtn = By.xpath("//a[text()='Logout']");
	
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
	
	public void clickOnMenu() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(menu).click();
	}
	
	public void logout() throws InterruptedException{
		Thread.sleep(2000);
		driver.findElement(logoutbtn).click();
	}
	public void login(String username1, String password1) {
		driver.findElement(username).sendKeys(username1);
		driver.findElement(password).sendKeys(password1);
		driver.findElement(loginbtn).click();
		//return new InventoryPage();
	}

}
