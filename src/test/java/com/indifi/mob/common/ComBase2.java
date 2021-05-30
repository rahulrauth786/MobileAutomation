package com.indifi.mob.common;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import com.indifi.mob.init.Lib;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class ComBase2 {
	
	static AndroidDriver<MobileElement> driver =  Lib.setUp1();
	
	
	
	
	public static void login() throws InterruptedException {
		driver.findElementById("com.riviera.indifi.app:id/loginPhoneEditText").sendKeys("8888833333");
		driver.findElementById("com.riviera.indifi.app:id/loginContinueButton").click();
		Thread.sleep(5000);
		driver.findElementById("com.riviera.indifi.app:id/editOtpBox1").sendKeys("1");
		driver.findElementById("com.riviera.indifi.app:id/editOtpBox2").sendKeys("2");
		driver.findElementById("com.riviera.indifi.app:id/editOtpBox3").sendKeys("3");
		driver.findElementById("com.riviera.indifi.app:id/editOtpBox4").sendKeys("4");
		driver.findElementById("com.riviera.indifi.app:id/otpButtonVerify").click();
		Thread.sleep(20000);
		System.out.println("Login and Otp Page Checked");
		
	}
	
	


	public static void topUp() throws InterruptedException {
		//TopUp
		 driver.findElementById("com.riviera.indifi.app:id/loanDetailsCustomerButton1").click();
		 Thread.sleep(5000);
		 driver.findElementById("com.riviera.indifi.app:id/topupTncCheckBox").click();
	     driver.findElementById("com.riviera.indifi.app:id/buttonApplyTopup").click();
	     Thread.sleep(3000);
		 driver.findElementByAccessibilityId("Go Back").click();
		 System.out.println("TopUp Page Checked");
		 Thread.sleep(5000);
	}
	
	
	
	public static void requestSupport() throws InterruptedException {
		driver.findElementById("com.riviera.indifi.app:id/buttonSupport").click();
		Thread.sleep(10000);
		driver.findElementById("android:id/text1").click();
		Thread.sleep(5000);
		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]")
				.click();
		driver.findElementById("com.riviera.indifi.app:id/concernText").sendKeys("Nach Keys");
		//driver.findElementById("com.riviera.indifi.app:id/requestSupportButton").click();
		//Thread.sleep(5000);
		//driver.findElementByAccessibilityId("Go Back").click();
		 System.out.println("Request Support Page Checked");
		 Thread.sleep(5000);
       
//		click("android:id/text1");

		
	}
	
	public static void loanStatement() throws InterruptedException {
		 //loan
		 driver.findElementById("com.riviera.indifi.app:id/buttonLoanStatement").click();
		 Thread.sleep(5000);
		 driver.findElementByXPath("(//android.widget.ImageButton[@content-desc=\"TODO\"])[2]").click();
		 //Thread.sleep(5000);
		 //driver.findElementById("com.android.permissioncontroller:id/permission_allow_button").click();
		// driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[1]").click();
		 Thread.sleep(5000);
		 driver.findElementByAccessibilityId("Go Back").click();
		 System.out.println("LoanStatement Page Checked");
		 Thread.sleep(5000);
	}
	
	public static void makePayment() throws InterruptedException {
		//Payment
			driver.findElementById("com.riviera.indifi.app:id/buttonMakePayment").click();
			Thread.sleep(2000);
			driver.findElementById("com.riviera.indifi.app:id/editTextAmount").sendKeys("500");;
			driver.findElementById("com.riviera.indifi.app:id/buttonMakePayment").click();
			Thread.sleep(5000);
			driver.findElementByAccessibilityId("Go Back").click();
			System.out.println("Make Payment Page Checked");
			Thread.sleep(5000);
	}
	
	public static void creditScoreView() throws InterruptedException {
		//creditScire
		driver.findElementById("com.riviera.indifi.app:id/cibilExploreMore").click();
		Thread.sleep(5000);
		 
		 //payments
		 TouchAction tips = new TouchAction(driver);
		 tips.tap(PointOption.point(379, 1389)).perform();
		 
		 Thread.sleep(5000);
		 
		 TouchAction creditReportBack = new TouchAction(driver);
		 creditReportBack.tap(PointOption.point(58,1167)).perform();
		 
		 Thread.sleep(5000);
		 
		 TouchAction touchPayment = new TouchAction(driver);
		 touchPayment.tap(PointOption.point(205,1748)).perform();
		 
		 Thread.sleep(5000);
		 
		 TouchAction checkOptions = new TouchAction(driver);
		 checkOptions.tap(PointOption.point(984,617)).perform();
		 
		 Thread.sleep(5000);
		 
		 creditReportBack.tap(PointOption.point(58,1167)).perform();
		 
		 //driver.findElementById("Tips").click();
		 // driver.findElement("id","Tips").click();
		 //driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[6].click();
		 //driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[6]").click();
		 //Thread.sleep(5000);
		 //driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View").click();
		 Thread.sleep(2000);
		 driver.navigate().back();
		 System.out.println("Credit Score Page Checked");
		 Thread.sleep(5000);
		
	}
	
	public static void pragatiPage() throws InterruptedException {
	    driver.findElementById("com.riviera.indifi.app:id/pragatiExploreMore").click();
//	    Thread.sleep(10000);
//		driver.navigate().back();
//		System.out.println("Pragati Page Checked");
//		 Thread.sleep(5000);
	}
	
	
	
	public static void swipe(int startx, int starty, int endx, int endy) {
		
		System.out.println("Swipe Screen");
	    TouchAction touchAction = new TouchAction(driver);

	    touchAction.longPress(PointOption.point(startx, starty))
	  
	               .moveTo(PointOption.point(endx, endy))
	               .release()
	               .perform();
      
	}
	
	
	public static void logout() throws InterruptedException {
	 driver.findElementByAccessibilityId("TODO").click();
	 Thread.sleep(3000);
	 driver.findElementById("android:id/content").click();
	 System.out.println("LogOut Checked");
	 Thread.sleep(1000);
	 
		
	}
	
	public static void quit() {
		driver.quit();
	}
	
	public static void navigateBack() throws InterruptedException {
		driver.navigate().back();
		Thread.sleep(5000);
	}
	
	
//	public static void TopUp() throws InterruptedException {
//		driver.findElementById("com.riviera.indifi.app:id/loginPhoneEditText").sendKeys("8888833333");
//		System.out.println("com.riviera.indifi.app:id/loginPhoneEditText");
//		driver.findElementById("com.riviera.indifi.app:id/loginContinueButton").click();
//		System.out.println("com.riviera.indifi.app:id/loginPhoneEditText");
//		Thread.sleep(5000);
//		driver.findElementById("com.riviera.indifi.app:id/editOtpBox1").sendKeys("1");
//		driver.findElementById("com.riviera.indifi.app:id/editOtpBox2").sendKeys("2");
//		driver.findElementById("com.riviera.indifi.app:id/editOtpBox3").sendKeys("3");
//		driver.findElementById("com.riviera.indifi.app:id/editOtpBox4").sendKeys("4");
//		driver.findElementById("com.riviera.indifi.app:id/otpButtonVerify").click();
//
//		
//	}
//	
//	public static void MakePayment() throws InterruptedException {
//		driver.findElementById("com.riviera.indifi.app:id/loginPhoneEditText").sendKeys("8888833333");
//		System.out.println("com.riviera.indifi.app:id/loginPhoneEditText");
//		driver.findElementById("com.riviera.indifi.app:id/loginContinueButton").click();
//		System.out.println("com.riviera.indifi.app:id/loginPhoneEditText");
//		Thread.sleep(5000);
//		driver.findElementById("com.riviera.indifi.app:id/editOtpBox1").sendKeys("1");
//		driver.findElementById("com.riviera.indifi.app:id/editOtpBox2").sendKeys("2");
//		driver.findElementById("com.riviera.indifi.app:id/editOtpBox3").sendKeys("3");
//		driver.findElementById("com.riviera.indifi.app:id/editOtpBox4").sendKeys("4");
//		driver.findElementById("com.riviera.indifi.app:id/otpButtonVerify").click();
//
//		
//	}
//	
//	
//	public static void CreditScoreAnalysis() throws InterruptedException {
//		driver.findElementById("com.riviera.indifi.app:id/loginPhoneEditText").sendKeys("8888833333");
//		System.out.println("com.riviera.indifi.app:id/loginPhoneEditText");
//		driver.findElementById("com.riviera.indifi.app:id/loginContinueButton").click();
//		System.out.println("com.riviera.indifi.app:id/loginPhoneEditText");
//		Thread.sleep(5000);
//		driver.findElementById("com.riviera.indifi.app:id/editOtpBox1").sendKeys("1");
//		driver.findElementById("com.riviera.indifi.app:id/editOtpBox2").sendKeys("2");
//		driver.findElementById("com.riviera.indifi.app:id/editOtpBox3").sendKeys("3");
//		driver.findElementById("com.riviera.indifi.app:id/editOtpBox4").sendKeys("4");
//		driver.findElementById("com.riviera.indifi.app:id/otpButtonVerify").click();
//
//		
//	}





}
