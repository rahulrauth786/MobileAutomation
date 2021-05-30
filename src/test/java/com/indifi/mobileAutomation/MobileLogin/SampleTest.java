package com.indifi.mobileAutomation.MobileLogin;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.TestCase;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class SampleTest {

  private AndroidDriver driver;

  @BeforeClass
  public void setUp() throws MalformedURLException {
    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
    desiredCapabilities.setCapability("platformName", "Android");
    desiredCapabilities.setCapability("platformVersion", "10.0");
    desiredCapabilities.setCapability("deviceName", "Galaxy M31");
    desiredCapabilities.setCapability("udid", "RZ8N905QF7N");
    desiredCapabilities.setCapability("appPackage", "com.riviera.indifi.app");
    desiredCapabilities.setCapability("appActivity", ".MainActivity");
    desiredCapabilities.setCapability("ensureWebviewsHavePages", true);

    URL remoteUrl = new URL("http://localhost:4723/wd/hub");

    driver = new AndroidDriver(remoteUrl, desiredCapabilities);
  }

  @org.testng.annotations.Test
  public void sampleTest() throws InterruptedException {
	  
	  driver.findElementById("com.riviera.indifi.app:id/loginPhoneEditText").sendKeys("8888833333");
      System.out.println("com.riviera.indifi.app:id/loginPhoneEditText");
      driver.findElementById("com.riviera.indifi.app:id/loginContinueButton").click();
      System.out.println("com.riviera.indifi.app:id/loginPhoneEditText");
      Thread.sleep(5000);
      driver.findElementById("com.riviera.indifi.app:id/editOtpBox1").sendKeys("1");
      driver.findElementById("com.riviera.indifi.app:id/editOtpBox2").sendKeys("2");
	    driver.findElementById("com.riviera.indifi.app:id/editOtpBox3").sendKeys("3");
	    driver.findElementById("com.riviera.indifi.app:id/editOtpBox4").sendKeys("4");
	    driver.findElementById("com.riviera.indifi.app:id/buttonLoanStatement").click();
	    driver.findElementByXPath("(//android.widget.ImageButton[@content-desc=\"TODO\"])[2]").click();
	    driver.findElementById("com.android.permissioncontroller:id/permission_allow_button").click();
	    driver.findElementByAccessibilityId("Go Back").click();
	    System.out.println("com.riviera.indifi.app:id/editOtpBox1");
	    driver.findElementById("com.riviera.indifi.app:id/otpButtonVerify").click();
	    System.out.println("com.riviera.indifi.app:id/otpButtonVerify");
	    Thread.sleep(10000);
    // Invoke driver.quit() after the test is done to indicate that the test is completed.
       driver.quit();
  }

  @AfterClass
  public void tearDown() {
    driver.quit();
  }
}