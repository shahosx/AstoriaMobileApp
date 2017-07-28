package AstoriaBankApp;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.junit.Test;
import org.testng.annotations.AfterTest;
import io.appium.java_client.android.AndroidDriver;

public class Test1 {

	AndroidDriver driver;
	
	// Objects Refereances
	SignIn SignInPage; 
	
	public static void main (String[] args) throws Exception {
		AndroidDriver driver;
		
		DesiredCapabilities Cap = new DesiredCapabilities();
		Cap.setCapability("deviceName", "Moto G");
		// Stays same for other project
		Cap.setCapability(CapabilityType.BROWSER_NAME, "Android");
		Cap.setCapability(CapabilityType.VERSION, "5.1.1");
		Cap.setCapability("platformName", "Android");
		//Change occurs
		Cap.setCapability("appPackage", "com.mfoundry.mb.android.mb_770");
		Cap.setCapability("appActivity", "com.mfoundry.mb.android.mb_770.Astoria_770Activity");
		
		driver = new AndroidDriver (new URL("http://127.0.0.1:4723/wd/hub"),Cap);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(15000);
		
	
		SignIn log = new SignIn(driver);
		log.SignInApp("shahadatx23", "1234");
		
		TransactionHistory tran = new TransactionHistory (driver);
		tran.ClickTransaction();
		tran.scrol();
		
		
		MakeDeposit MakeDep = new MakeDeposit (driver);
		MakeDep.MakeDepositApp();
		
//		SignOut sout = new SignOut(driver);
//		sout.SignOutApp();
//		
//		driver.quit();
	

	}
	
}
