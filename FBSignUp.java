package com.vstl.FaceBook;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.vstl.generic.ApplicationInitialization;

public class FBSignUp extends ApplicationInitialization {

	public void setFirstNameOnFBSignUp() {
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(getName(8));
	}
	
	public void setLastNameOnFBSignUp() {
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(getName(8));
	}
		
	public void setMobileNumberOnSignUpPage() {
		
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(getMobileNumber(7));
	}

	public void setPassWordOnFBSignUpPage() {
		
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys(getPassword(8));
	}

	public void setDayOfDOBOnFBSignUpPage() {
		
		Select dateofDOB = new Select(driver.findElement(By.xpath("//select[@id='day']")));
		dateofDOB.selectByVisibleText(getDate());
		}
	
	public void setMonthOfDOBOnFBSignUpPage() {
	
		Select monthofDOB = new Select(driver.findElement(By.xpath("//select[@name='birthday_month']")));
		monthofDOB.selectByValue(getMonth());
	}
	
	public void setYearOfDOBOnFBSignUpPage() {
		
		Select yearofDOB = new Select(driver.findElement(By.xpath("//select[@id='year']")));
		yearofDOB.selectByValue(getRandomYear());
		}

	public void selectGenderOnFBSignUpPage() {
		
		if(getRandomThreeGender().equalsIgnoreCase("Female"))
		driver.findElement(By.xpath("//input[@value = '1']")).click();
		else if (getRandomThreeGender().equalsIgnoreCase("Male"))
			driver.findElement(By.xpath("//input[@value = '2']")).click();
		else 
			driver.findElement(By.xpath("//input[@value = '-1']")).click();
			//Select customPronoun = new Select(driver.findElement(By.xpath("//select[@name='preferred_pronoun']")));
			//customPronoun.selectByValue("They:Wish her a Happy Birthday!");
	}

	public void clickTermsInSignUpPageOnFBSignUpPage() {
		
		driver.findElement(By.xpath("//a[@id='terms-link']")).click();
	}
	
	public void mouseHoverLearnMore() {
		mouseHover("//a[@id='non-users-notice-link']");
	}
	
}
