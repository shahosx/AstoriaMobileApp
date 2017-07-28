package AstoriaBankApp;


	import java.io.IOException;
	import java.net.MalformedURLException;
	import java.net.URL;
	import java.util.concurrent.TimeUnit;
	import org.junit.rules.Timeout;
	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.remote.CapabilityType;
	import org.openqa.selenium.remote.DesiredCapabilities;
	import org.openqa.selenium.remote.RemoteWebDriver;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	import com.gargoylesoftware.htmlunit.javascript.configuration.BrowserName;

	import io.appium.java_client.MobileDriver;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
	import io.appium.java_client.android.AndroidDriver;

public class MultiTouchAstoria {

		AndroidDriver driver;
		
		//WebDriver driver;

		@BeforeTest
		public void setUpProject() throws IOException  {
			
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
			
		}
		
		
		
		//Object Artifacts : LOG IN 
		
		By UserName = By.xpath("//android.widget.EditText");
		By Password = By.xpath("//android.widget.EditText");
		By Remember = By.xpath("//android.view.View");
		By SignOn = By.xpath("//android.widget.Button[@text='Sign On']");
		
		//Object Artifacts : Transaction History
		By TranHistory = By.xpath("//android.widget.TextView[@text='Transfers']");
		
		//Object Artifacts : Search 
		
		//Object Artifacts : Sign Out
		
		By SignOff = By.xpath("//android.widget.TextView[@text='Sign Off']");
		By ConfirmSignOff = By.xpath("//android.widget.CheckedTextView[@resource-id='android:id/text1']");
		
		
		
		
		
		public void setUserName (String strUserName) { 
			driver.findElements(UserName).get(0).sendKeys(strUserName);
		}
		
		
		public void setPassword (String strPassword) { 
			driver.findElements(UserName).get(0).sendKeys(strPassword);
		}
		public void  clickRemember() { 
			driver.findElements(Password).get(1).click();
		}
		public void TapSignOn () { 
			driver.findElements(SignOn).get(0).click();
		}
		
		
		
		
		
		
		
		
//		@Test
//		public void Swipe_H() throws Exception {
//			int Length =50;
//			for (int i=0;i<Length;i++) {
//				driver.findElements(By.id("com.mobeta.android.demodslv:id/activity_title")).get(i).click();
//
//				 new TouchAction((MobileDriver) driver).longPress(driver.findElements(By.id("com.mobeta.android.demodslv:id/drag_handle")).get(i)).moveTo(32,383 ).release().perform();
//				 	
//			}}

		public void scrol() throws Exception {Thread.sleep(15000);
		driver.findElements(UserName).get(0).click();
		driver.findElements(By.xpath("//android.widget.EditText")).get(1).sendKeys(haha);
		driver.findElements(By.xpath("//android.view.View")).get(0).click();
		


		//
//		driver.findElement(By.xpath("//android.widget.EditText[@text='User ID']")).sendKeys("Shahadatx");
	 Thread.sleep(10000);
		driver.findElement(By.xpath("//android.widget.Button[@text='Sign On']")).click();
		//Thread.sleep(5000);
		//System.out.println("Your Balance is " +driver.findElements(By.xpath("//android.widget.TextView")).get(0));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Transfers']")).click();
		
		//driver.findElement(By.xpath("//android.widget.TextView[@text='Sign Off']")).click();

		Thread.sleep(3000);
		//driver.findElement(By.xpath("//android.widget.CheckedTextView[@resource-id='android:id/text1']")).click();
		Thread.sleep(3000); 
			
			
			
			
			
			
			
			
			
			
			
			        for(int i=0;i<4;i++)
			        {
//			            Thread.sleep(2000);
//			            if (driver.findElement(By.xpath("//android.widget.TextView[@text='some']")).isDisplayed())
//			            {
//			                driver.findElement(By.xpath("//android.widget.TextView[@text='some']")).click();
//			                System.out.println("Im Here line 60");
//			              
//			                
			     
			
					Dimension dimensions = driver.manage().window().getSize();
					Double screenHeightStart = dimensions.getHeight() * 0.5;
					int scrollStart = screenHeightStart.intValue();
					System.out.println("s="+scrollStart);
					Double screenHeightEnd = dimensions.getHeight() * 0.2;
					int scrollEnd = screenHeightEnd.intValue();
					driver.swipe(0,scrollStart,0,scrollEnd,2000);
				Thread.sleep(5000);
			        }}

		String haha= "208695387shapol";
		@AfterTest
		public void closeApp()	{
		//driver.quit();		
			
		
		}

}
