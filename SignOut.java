package AstoriaBankApp;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;

public class SignOut {
	AndroidDriver driver;
	
	public SignOut (AndroidDriver driver) {
		
		this.driver = driver;
	}
	
	By SignOff = By.xpath("//android.widget.TextView[@text='Sign Off']");
	By ConfirmSignOff = By.xpath("//android.widget.CheckedTextView[@resource-id='android:id/text1']");

	
	
	public void TapSignOff () {
		driver.findElement(SignOff).click();
	
	}
	
	public void TapConfirmSignOff() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(ConfirmSignOff).click();
	}
	
	public void SignOutApp () throws InterruptedException {
		
		this.TapSignOff();
		this.TapConfirmSignOff();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
