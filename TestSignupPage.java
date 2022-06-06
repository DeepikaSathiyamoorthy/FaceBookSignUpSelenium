package com.vstl.TestFaceBook;

import com.vstl.FaceBook.FBSignUp;
import com.vstl.generic.ApplicationInitialization;

public class TestSignupPage extends ApplicationInitialization {

	public static void main(String[] args) throws InterruptedException {
		
		FBSignUp objSignUp = new FBSignUp();
		objSignUp.invokeApplication();
		objSignUp.setFirstNameOnFBSignUp();
		objSignUp.setLastNameOnFBSignUp();
		objSignUp.setMobileNumberOnSignUpPage();
		objSignUp.setPassWordOnFBSignUpPage();
		objSignUp.setDayOfDOBOnFBSignUpPage();
		objSignUp.setMonthOfDOBOnFBSignUpPage();
		objSignUp.setYearOfDOBOnFBSignUpPage();
		objSignUp.selectGenderOnFBSignUpPage();
		objSignUp.clickTermsInSignUpPageOnFBSignUpPage();
		objSignUp.mouseHoverLearnMore();
		
		//objSignUp.tearDown();
		//objSignUp.goBackToHomePage();
		
	}

}
