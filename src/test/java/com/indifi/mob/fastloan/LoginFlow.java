package com.indifi.mob.fastloan;

import org.testng.annotations.Test;


import com.indifi.mob.common.ComBase2;

public class LoginFlow extends ComBase2 {
	
	
	@Test(priority = 1)
	public static void CheckLoanActiveCase() throws InterruptedException{
		login();
		swipe(921,610,175,620);
		swipe(540,1824,540,672);
		creditScoreView();
		swipe(540,1824,540,672);
		pragatiPage();
		swipe(540,1824,540,672);
		navigateBack();
		loanStatement();
		topUp();
		requestSupport();
		navigateBack();
		swipe(540,1824,540,672);
		makePayment();
		logout();
		quit();
		
	}
	
//	@Test(priority = 1)
//	public static void Checkpragati() throws InterruptedException{
//		login();
//		swipe(540,1824,540,672);
//		pragatiPage();
//		Thread.sleep(10000);
//		swipe(540,1824,540,672);
//		navigateBack();
//		swipe(540,1824,540,672);
//		logout();
//		quit();
//		
//	}
	
	
	
	
//	@Test(priority = 1)
//	public static void Login() throws InterruptedException {
//		input("com.riviera.indifi.app:id/loginPhoneEditText", "8888833333");
//		click("com.riviera.indifi.app:id/loginContinueButton");
//		Thread.sleep(10000);
//	}
//	
//	@Test(priority = 2)
//	public static void OtpPage() throws InterruptedException {
//		
//		input("com.riviera.indifi.app:id/editOtpBox1", "1");
//		input("com.riviera.indifi.app:id/editOtpBox2", "2");
//		input("com.riviera.indifi.app:id/editOtpBox3", "3");
//		input("com.riviera.indifi.app:id/editOtpBox4", "4");
//		click("com.riviera.indifi.app:id/otpButtonVerify");
//		Thread.sleep(10000);
//	
//		
//	}
	
//	@Test(priority = 3)
//	public static void TopUpPage() throws InterruptedException {
//		
//		click("com.riviera.indifi.app:id/loanDetailsCustomerButton1");
//		click("com.riviera.indifi.app:id/topupTncCheckBox");
//		click("com.riviera.indifi.app:id/buttonApplyTopup");
//		click("com.riviera.indifi.app:id/goBackButton");
//		Thread.sleep(10000);
//		
//		
//	}
	
//	@Test(priority = 4)
//	public static void LoanStatementPage() throws InterruptedException {
//		
//		click("com.riviera.indifi.app:id/buttonLoanStatement");
//		//click("com.riviera.indifi.app:id/downloadLoanStatementButton");
//		//Thread.sleep(5000);
//		click("com.android.permissioncontroller:id/permission_allow_button");
//
//
//		
//		
//		//clickByClass("android.widget.Button");
//		click("com.riviera.indifi.app:id/goBackButton");
//		Thread.sleep(10000);
//
//		
//	}
//	
//	@Test(priority = 5)
//	public static void RequestSupportDisbursal() throws InterruptedException {
//		
//		click("com.riviera.indifi.app:id/buttonSupport");
//		click("android:id/text1");
//		click("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]");
//		click("com.riviera.indifi.app:id/concernText");
//		input("com.riviera.indifi.app:id/concernText","Hello");
//		click("com.riviera.indifi.app:id/requestSupportButton");
//		click("com.riviera.indifi.app:id/goBackButton");
//		Thread.sleep(10000);
//		
//	}
	
//	@Test(priority = 6)
//	public static void MakePayment() throws InterruptedException {
//		
//		click("android.widget.EditText");
//		click("com.riviera.indifi.app:id/buttonMakePayment");
//	    click("com.riviera.indifi.app:id/goBackButtonWebview");
//		Thread.sleep(10000);
//		driver.quit();
//		
//	}
//	
//	@Test(priority = 7)
//	public static void ScoreCardView() throws InterruptedException {
//		
//		click("com.riviera.indifi.app:id/cibilExploreMore");
//		click("Payments");
//	    click("Xpath#//android.view.View[@content-desc=\"\"]/android.widget.TextView");
//		Thread.sleep(10000);
//		driver.quit();
//		
//	}
	

}
