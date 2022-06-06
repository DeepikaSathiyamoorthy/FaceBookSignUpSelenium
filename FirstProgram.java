package com.vstl.SeleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstProgram {
	
		
	public void openBrowser() {
	
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		String strURL = "https://www.facebook.com/r.php";
		
		driver.get(strURL);
		
		driver.manage().window().maximize();
		
		WebElement fname = driver.findElement(By.name("firstname"));
		fname.sendKeys("Deepika");
		
		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys("Ratheesh");
		
		WebElement mobileNumber = driver.findElement(By.name("reg_email__"));
		mobileNumber.sendKeys("9600141746");
		
		driver.findElement(By.id("password_step_input")).sendKeys("Verves@123");
		
		Select dateofDOB = new Select(driver.findElement(By.id("day")));
		dateofDOB.selectByVisibleText("14");
		
		Select monthofDOB = new Select(driver.findElement(By.name("birthday_month")));
		monthofDOB.selectByIndex(02);
		
		Select yearofDOB = new Select(driver.findElement(By.id("year")));
		yearofDOB.selectByVisibleText("1991");
		
		WebElement genderofUser = driver.findElement(By.xpath("//input[@value='1']"));
		genderofUser.click();
		
		WebElement submitSignupPage = driver.findElement(By.name("websubmit"));
		submitSignupPage.click();
		
	}
	
	}


  