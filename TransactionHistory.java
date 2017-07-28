package AstoriaBankApp;


	import org.openqa.selenium.By;
	import org.openqa.selenium.Dimension;
	import io.appium.java_client.android.AndroidDriver;

public class TransactionHistory {

		AndroidDriver driver;
		public TransactionHistory (AndroidDriver driver) {
			
			this.driver = driver;
		}

		
		//WebDriver driver;

		
		By TranHistory = By.xpath("//android.widget.TextView[@text='Transfers']");
		By SearchTran= By.xpath("//android.widget.Button[@text='Search']");
		
		
	public void ClickTransaction () throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(TranHistory).click();
		
	}
	
		public void scrol() throws InterruptedException {
		
			        for(int i=5;i<10;i++)
			        {
	            
//	            if (driver.findElements(By.xpath("//android.view.View]")).get(i).isDisplayed())
	            	           

					Dimension dimensions = driver.manage().window().getSize();
					Double screenHeightStart = dimensions.getHeight() * 0.5;
					int scrollStart = screenHeightStart.intValue();
					System.out.println("s="+scrollStart);
					Double screenHeightEnd = dimensions.getHeight() * 0.2;
					int scrollEnd = screenHeightEnd.intValue();
					driver.swipe(0,scrollStart,0,scrollEnd,2000);
				Thread.sleep(10000);
			        }}

 public void SearchTran() {
	 driver.findElement(SearchTran).click();
	 
 } 
	 
 

}
