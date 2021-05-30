package com.indifi.mob.fastloan;

import org.testng.annotations.Test;


import com.indifi.mob.common.ComBase3;

public class LoginFlow2 extends ComBase3 {
	

	@Test(priority = 1)
	public static void CheckLoanActiveCase() throws InterruptedException{
		login();
		swipe(620,500,108,500);
		swipe(540,1100,540,0);
		creditScoreView();
		swipe(540,1100,540,0);
		pragatiPage();
		swipe(540,1100,540,0);
		navigateBack();
		loanStatement();
		topUp();
		requestSupport();
		navigateBack();
		swipe(540,1100,540,0);
		makePayment();
		logout();
		quit();
		
	}

}
