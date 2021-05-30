package com.indifi.mob.init;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Lib {
	
	
	
	

//	public Lib(AndroidDriver<AndroidElement> driver) {
//		openApp();
//	}

//	public static AndroidDriver<AndroidElement> openApp() {
//		DesiredCapabilities caps = new DesiredCapabilities();
//
//		// Set your access credentials -rahul
////		caps.setCapability("browserstack.user", "rahulrauth1");
////		caps.setCapability("browserstack.key", "JetxE9Wq7fZtyWBCpMvU");
//		
//		// Set your access credentials -ajay
//		caps.setCapability("browserstack.user", "ajayjagdeva1");
//		caps.setCapability("browserstack.key", "SMx6W2zPwpL7iT3xsKVg");
//
//		// Set URL of the application under test
//		//caps.setCapability("app", "bs://972295dfdd0e8fa6259337e8d265fce1e7f4c589"); // rahul
//		caps.setCapability("app", "bs://abf7ab53a9c51c91e71ddf30348dd2cebccd286f"); // ajay
//		// Specify device and os_version for testing
//		caps.setCapability("device", "Google Pixel 3");
//		caps.setCapability("os_version", "9.0");
//		
//		caps.setCapability("autoGrantPermissions", "true");
//		caps.setCapability("noReset", "false");
//
//
//		// Set other BrowserStack capabilities
//		caps.setCapability("project", "First Java Project");
//		caps.setCapability("build", "Java Android");
//		caps.setCapability("name", "first_test");
//
//		// Initialise the remote Webdriver using BrowserStack remote URL
//		// and desired capabilities defined above
//		AndroidDriver<AndroidElement> driver = null;
//		try {
//			driver = new AndroidDriver<AndroidElement>(
//					new URL("http://hub.browserstack.com/wd/hub"), caps);
//		} catch (MalformedURLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		return driver;
//
//	}
	
	
	
	public static AndroidDriver<MobileElement> setUp1()  {
		
		final String AUTOMATE_USERNAME = "ajayjagdeva1";
		final String AUTOMATE_ACCESS_KEY = "SMx6W2zPwpL7iT3xsKVg";
		
		AndroidDriver<MobileElement> driver = null;
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("os_version", "10.0");
		caps.setCapability("device", "Samsung Galaxy S20");
		caps.setCapability("real_mobile", "true");
		caps.setCapability("browserstack.local", "false");
		caps.setCapability("app", "bs://abf7ab53a9c51c91e71ddf30348dd2cebccd286f");
		caps.setCapability("autoGrantPermissions", "true");
		caps.setCapability("noReset", "false");


		URL url = null;
		try {
			url = new URL("https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return driver = new AndroidDriver<MobileElement>(url, caps);
		
	}
	
//public static AndroidDriver<MobileElement> setUp2()  {
//		
//		AndroidDriver<MobileElement> driver = null;
//		
//		DesiredCapabilities caps = new DesiredCapabilities();
//		caps.setCapability("platformName", "Android");
//		caps.setCapability("platformVersion", "8.1.0");
//		caps.setCapability("udid", "6c5ce4817d85");
//		caps.setCapability("appPackage", "com.riviera.indifi.app");
//		caps.setCapability("appActivity", ".MainActivity");
//		caps.setCapability("autoGrantPermissions", "true");
//		caps.setCapability("noReset", "false");
//
//
//		URL url = null;
//		try {
//			url = new URL("http://127.0.0.1:4723/wd/hub");
//		} catch (MalformedURLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		return driver = new AndroidDriver<MobileElement>(url, caps);
//		
//	}

public static AndroidDriver<MobileElement> setUp3()  {
	
	final String AUTOMATE_USERNAME = "ajayjagdeva1";
	final String AUTOMATE_ACCESS_KEY = "SMx6W2zPwpL7iT3xsKVg";
	
	AndroidDriver<MobileElement> driver = null;
	
	DesiredCapabilities caps = new DesiredCapabilities();
	caps.setCapability("os_version", "10.0");
	caps.setCapability("device", "Google Pixel 4");
	caps.setCapability("real_mobile", "true");
	caps.setCapability("browserstack.local", "false");
	caps.setCapability("app", "bs://abf7ab53a9c51c91e71ddf30348dd2cebccd286f");
	caps.setCapability("autoGrantPermissions", "true");
	caps.setCapability("noReset", "false");


	URL url = null;
	try {
		url = new URL("https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub");
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return driver = new AndroidDriver<MobileElement>(url, caps);
	
}


}
