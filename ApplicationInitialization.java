package com.vstl.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import LoginPageAutomation.UtilitiesFunctions;

public class ApplicationInitialization extends UtilitiesFunctions {

	public WebDriver driver;
	
	public void invokeApplication() {
		
		System.setProperty("webdriver.chromedriver", System.getProperty("user.dir")+"drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		
	}

	public void closeCurrentWindow() throws InterruptedException {
		driver.wait(3000);
		driver.close();
		
	}

	public void tearDown() {
			
			driver.quit();
		}
	
	public WebDriver gerDriver() {
		return driver;
	}
	
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	public void goBackToHomePage() {
		driver.navigate().back();
	}
	
	public void mouseHover(String strxpathVale) {
		
		WebElement objWebElement = driver.findElement(By.xpath(strxpathVale));
		Actions objActions = new Actions(driver);
		objActions.moveToElement(objWebElement).perform();
	}
}
