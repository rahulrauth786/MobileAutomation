package com.indifi.mobileAutomation.MobileLogin;

import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class AppiumDemo {

	static AndroidDriver<MobileElement> driver;

	public static void main(String[] args) {
		try {
			openIndifiApp();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.getCause();
			e.getMessage();
			e.printStackTrace();
		}
	}

	public static void openIndifiApp() throws Exception {

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "10.0");
		caps.setCapability("udid", "RZ8N905QF7N");
		caps.setCapability("appPackage", "com.riviera.indifi.app");
		caps.setCapability("appActivity", ".MainActivity");
		caps.setCapability("autoGrantPermissions", "true");
		caps.setCapability("noReset", "false");


		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(url, caps);
		Thread.sleep(5000);
		// driver.findElementById("Xpath//*[@id=\"screenshotContainer\"]/div/div/div/div/div/div[1]").click();;
		WebElement num = driver.findElementById("android:id/text1");
		num.click();
		WebElement enterPhoneNumber = driver.findElementById("com.riviera.indifi.app:id/loginPhoneEditText");
		enterPhoneNumber.clear();
		enterPhoneNumber.sendKeys("8888833333");
		WebElement next = driver.findElementById("com.riviera.indifi.app:id/loginContinueButton");
		next.click();
		Thread.sleep(10000);

		driver.findElementById("com.riviera.indifi.app:id/editOtpBox1").sendKeys("1");
		driver.findElementById("com.riviera.indifi.app:id/editOtpBox2").sendKeys("2");
		driver.findElementById("com.riviera.indifi.app:id/editOtpBox3").sendKeys("3");
		driver.findElementById("com.riviera.indifi.app:id/editOtpBox4").sendKeys("4");
		driver.findElementById("com.riviera.indifi.app:id/otpButtonVerify").click();
		 System.out.println("1");
		Thread.sleep(20000);
		 System.out.println("2");
		 
		//Horizontal Scroling
//        TouchAction action = new TouchAction((MobileDriver) driver);
//        action.longPress(ElementOption.element(null)).moveTo(ElementOption.element(null, 250, 250)).release().perform();
		 
//		 TouchAction swipe = new TouchAction(driver).press(PointOption.point(972,500)).waitAction(waitOptions(ofMillis(800))).moveTo(PointOption.point(972,500)).release().perform();
////		 
//		 TouchAction swipeLeft = new TouchAction(driver);
//
//		 swipeLeft.longPress(PointOption.point(972, 500))
//		               .moveTo(PointOption.point(108, 500))
//		               .release()
//		               .perform();
//		 
//		 TouchAction swipeDown = new TouchAction(driver);
//
//		 swipeDown.longPress(PointOption.point(540, 1824))
//		               .moveTo(PointOption.point(540, 672))
//		               .release()
//		               .perform();
//		 
//		 //loan
//  	     driver.findElementById("com.riviera.indifi.app:id/buttonLoanStatement").click();
//		 Thread.sleep(5000);
//    	 driver.findElementByXPath("(//android.widget.ImageButton[@content-desc=\"TODO\"])[2]").click();
//		 Thread.sleep(10000);
////		 driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[1]").click();
////		 Thread.sleep(5000);
//		 driver.findElementByAccessibilityId("Go Back").click();
//		 
		//creditScire
//		
//		 driver.findElementById("com.riviera.indifi.app:id/cibilExploreMore").click();
//		 Thread.sleep(5000);
//		 driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[6]/android.view.View[1]").click();
//		 Thread.sleep(5000);
//		 driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View").click();
//		 Thread.sleep(5000);
//		 driver.navigate().back();
//		 
//		 Thread.sleep(5000);		 
//		 driver.findElementById("com.riviera.indifi.app:id/pragatiExploreMore").click();
//		 Thread.sleep(10000);
//		 driver.navigate().back();
//		 Thread.sleep(5000);
		
		
//		// Vertical Scrolling
//		MobileElement listitem = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+ "new UiSelector().description(\"Switches\")):"));
//		    System.out.println(listitem.getLocation());
//		    listitem.click();
		 
		//TopUp
			
		 driver.findElementById("com.riviera.indifi.app:id/loanDetailsCustomerButton1").click();
		 Thread.sleep(5000);
		 driver.findElementById("com.riviera.indifi.app:id/topupTncCheckBox").click();
	     driver.findElementById("com.riviera.indifi.app:id/buttonApplyTopup").click();
	     Thread.sleep(3000);
	     MobileElement p=driver.findElementById("com.riviera.indifi.app:id/thankyoutitle");
	     String ActualTitle = p.getText();
	     System.out.println(ActualTitle);
	     String ExpectedTitle = "THANK YOU FOR APPLYING";
	     Assert.assertEquals(ExpectedTitle, ActualTitle);
		 driver.findElementByAccessibilityId("Go Back").click();
		 Thread.sleep(5000);
		 
		// Request Support
			driver.findElementById("com.riviera.indifi.app:id/buttonSupport").click();
			Thread.sleep(10000);
			driver.findElementById("android:id/text1").click();
			Thread.sleep(5000);
			driver.findElementByXPath(
					"/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]")
					.click();
			driver.findElementById("com.riviera.indifi.app:id/concernText").sendKeys("Nach Keys");
			driver.findElementById("com.riviera.indifi.app:id/requestSupportButton").click();
			Thread.sleep(5000);
			driver.findElementByAccessibilityId("Go Back").click();
			Thread.sleep(3000);
			
		
		
		//Payment
		driver.findElementById("com.riviera.indifi.app:id/buttonMakePayment").click();
		Thread.sleep(2000);
		driver.findElementById("com.riviera.indifi.app:id/editTextAmount").sendKeys("500");;
		driver.findElementById("com.riviera.indifi.app:id/buttonMakePayment").click();
		Thread.sleep(5000);
		driver.findElementByAccessibilityId("Go Back").click();
		Thread.sleep(5000);

//		//creditScire
//		
//		 driver.findElementById("com.riviera.indifi.app:id/cibilExploreMore").click();
//		 driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[5]").click();
//		 driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[5]").click();
//		 driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[3]").click();
//		 driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.view.View[3]").click();
//		 driver.findElementByXPath("//android.view.View[@content-desc=\"\"]/android.widget.TextView").click();
//		 driver.navigate().back();
		
		
		

		System.out.println("App Started Successfully");

	}

	public static void topUpPage() {
		driver.findElementById("com.riviera.indifi.app:id/loanDetailsCustomerButton1").click();
	}

}
