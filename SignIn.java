package AstoriaBankApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.thoughtworks.selenium.Wait.WaitTimedOutException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.android.AndroidDriver;

public class SignIn {
AndroidDriver driver;

public SignIn (AndroidDriver driver) {
	
	this.driver = driver;
}

	//Object Artifacts : LOG IN 
	
	By UserName = By.xpath("//android.widget.EditText");
	By Password = By.xpath("//android.widget.EditText");
	By Remember = By.xpath("//android.view.View");
	By SignOn = By.xpath("//android.widget.Button[@text='Sign On']");
	
	 
	 
	public void setUserName (String strUserName)  { 
		WebDriverWait wait= new WebDriverWait(driver, 2);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.EditText")));
		driver.findElements(UserName).get(0).sendKeys(strUserName);
	}
	public void setPassword (String strPassword) { 
		WebDriverWait wait= new WebDriverWait(driver,2);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.EditText")));
		driver.findElements(Password).get(1).sendKeys(strPassword);
	}
	public void  TapRemember() throws InterruptedException { 
		WebDriverWait wait= new WebDriverWait(driver,1);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View")));
		driver.findElements(Remember).get(0).click();
	}
	public void TapSignOn () throws InterruptedException   {
		Thread.sleep(3000);
		
		driver.findElements(SignOn).get(0).click();
	}
	
	void SignInApp (String strUserName, String strPassword) throws InterruptedException  {
		
		
		this.setUserName(strUserName);
		this.setPassword(strPassword);
		this.TapRemember();
		this.TapSignOn();
		
	}
	
}
