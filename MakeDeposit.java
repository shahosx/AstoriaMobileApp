package AstoriaBankApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.appium.java_client.MobileDriver;

import io.appium.java_client.android.AndroidDriver;

public class MakeDeposit {
	
AndroidDriver driver;
	
	public MakeDeposit (AndroidDriver driver) {
		
		this.driver = driver;
	}
	
	By Menu = By.xpath("//android.widget.Button");
	By CheckDeposit = By.xpath("//android.widget.TextView[@text='Check Deposit']");
	By DepositCheck = By.xpath("//android.widget.Button[@text='Deposit Check']");
	By ContinueDeposit = By.xpath("//android.widget.Button[@text='Continue']");
	By FrontCheck = By.xpath("//android.widget.ImageView");
	By BackCheck = By.xpath("//android.widget.ImageView[408,184][658,332]");
	By TakeShot = By.xpath("//android.widget.ImageButton[@resource-id='com.mfoundry.mb.android.mb_770:id/Take_Button']");
	By ApproveShot = By.xpath("//android.widget.ImageButton[@resource-id='com.mfoundry.mb.android.mb_770:id/Accept_Button']");
	By CheckAmount = By.xpath("//android.widget.TextView[@text='Amount']");
	By EnterAmount = By.xpath("//android.widget.Button");
	By DoneAmount = By.xpath("//android.widget.Button[text='Done']");
	By DepositTo = By.xpath("//android.widget.TextView[@text='Deposit To']");
	By CheckAccount = By.xpath("//android.widget.TextView[@text='SIMPLE *0502']");

	public void TapMenu () throws InterruptedException {
	Thread.sleep(5);
		driver.findElements(Menu).get(0).click();
		
	} 
	public void TapCheckDeposit() throws InterruptedException {
		Thread.sleep(5);
		driver.findElement(CheckDeposit).click();
	}
	public void TapDepositCheck() throws InterruptedException {
		Thread.sleep(10);
		driver.findElement(DepositCheck).click();
	}
	public void ContinueDeposit() throws InterruptedException {
		Thread.sleep(10);
		driver.findElement(ContinueDeposit).click();
	}
	public void TapCheckFront() throws InterruptedException{
		Thread.sleep(10);
		driver.findElements(FrontCheck).get(0).click();
	}
	public void TapCheckBack() throws InterruptedException {
		Thread.sleep(10);
	 driver.findElement(BackCheck).click();
		
	}
	public void TakeShot() throws InterruptedException {
		Thread.sleep(15);
		driver.findElement(TakeShot).click();

	}
	public void ApproveShot() throws InterruptedException {
		Thread.sleep(15);
		driver.findElement(ApproveShot).click();

	}
	public void TapAmount() throws InterruptedException {
		Thread.sleep(10);
		driver.findElement(CheckAmount).click();
	}
	public void EnterAmount () throws InterruptedException {
		Thread.sleep(10);
	driver.findElements(EnterAmount).get(0).click();
	Thread.sleep(5);
	driver.findElements(EnterAmount).get(1).click();
	Thread.sleep(5);
	driver.findElements(EnterAmount).get(1).click();
	
	driver.findElements(EnterAmount).get(1).click();
	
	driver.findElements(EnterAmount).get(1).click();
	}
	
	public void DoneAmount () throws InterruptedException {
		Thread.sleep(10);
		driver.findElement(DoneAmount).click();
	}
	public void DepositTo () throws InterruptedException {
		Thread.sleep(10);
		driver.findElement(DepositTo).click();
	}

	public void CheckAmount () throws InterruptedException	 {	
		Thread.sleep(10);
	driver.findElement(CheckAmount).click();
	}

	
	public void MakeDepositApp () throws InterruptedException {
		
		this.TapMenu();
		this.TapCheckDeposit();
		this.TapDepositCheck();
		this.ContinueDeposit();
		this.TapCheckFront();
		this.TakeShot();
		this.ApproveShot();
//		this.TapCheckBack();
//		this.TakeShot();
//		this.ApproveShot();
		this.TapAmount();
		this.EnterAmount ();
		this.DoneAmount ();
		this.DepositTo ();
		this.CheckAmount ();	
		
	}
	
	
	
	
	
	
}
