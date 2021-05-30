package com.indifi.mob.fastloan;

import org.testng.annotations.Test;

import com.indifi.mob.common.Combase4;

public class LoginFlow3 extends Combase4 {
	
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

}
