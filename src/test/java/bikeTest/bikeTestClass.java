package bikeTest;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import bikecapability.bikecapabilityclass;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class bikeTestClass extends bikecapabilityclass{
	
	AndroidDriver<AndroidElement> driver;
	@BeforeTest
	public void bt() throws MalformedURLException {
	 driver = capability();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	}
	@Test
	public void test1() throws InterruptedException {
		
		driver.findElement(MobileBy.id("com.royalbrothers:id/half_interstitial_button2")).click();
		Thread.sleep(2000);
		driver.findElement(MobileBy.xpath("//*[@text='SKIP']")).click();
		
		//driver.findElement(MobileBy.xpath("//*[@text='Select City']")).click();
		Thread.sleep(2000);
		driver.findElement(MobileBy.xpath("//*[@text='BANGALORE']")).click();
		
		//driver.findElement(MobileBy.xpath("//*[@text='VIEW ALL']")).click();
		Thread.sleep(2000);

		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Royal Enfield Meteor Supernova 350\"))").click();
	
		Thread.sleep(2000);
		driver.findElement(MobileBy.xpath("//*[@text='7 DAYS']")).click();
		Thread.sleep(2000);
		
		
//		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0, 500)");
		
		Thread.sleep(2000);
		
	//	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"\"))");
		
		
		
		driver.findElement(MobileBy.xpath("//*[@text='HOME']")).click();
		
		
		driver.findElement(MobileBy.xpath("//*[@text='Offers']")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(MobileBy.xpath("//*[@text='FIRSTRIDE']")).click();
		Thread.sleep(2000);
		
		driver.findElement(MobileBy.xpath("//*[@text='T&C']")).click();
		Thread.sleep(2000);
		
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(5000);
		
		driver.findElement(MobileBy.xpath("//*[@text='VIEW ALL']")).click();
		Thread.sleep(2000);
		driver.findElement(MobileBy.xpath("//*[@text='Search by Model']")).click();
		Thread.sleep(2000);
		
		
		AndroidElement search = driver.findElement(MobileBy.xpath("//*[@text='Search for bike models']"));
		
		 search.sendKeys("Honda Activa 6G");
		 
		 
		 driver.findElements(MobileBy.className("android.widget.TextView")).get(0).click();
		 
//		 Thread.sleep(2000);
//		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"VIEW ALL\"))").click();
//		Thread.sleep(2000);
		
		//driver.findElement(MobileBy.xpath("//*[@text='BOOK NOW']")).click();
		
//		Thread.sleep(2000);
//		
//		driver.findElement(MobileBy.xpath("//*[@text='Search by Model']")).click();
//		
//		
//		 AndroidElement search = driver.findElement(MobileBy.xpath("//*[@text='Search for bike models']"));
//		
//		 search.sendKeys("Bajaj Pulsar 150 Neon");
//		 
//		 driver.findElements(MobileBy.className("android.widget.TextView")).get(0).click();
//		 Thread.sleep(2000);
//		 
//		 driver.findElement(MobileBy.xpath("//*[@text='7 DAYS']")).click();
//		
//		 Thread.sleep(5000);
//		// driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"₹ 2880.00\"))").click();
//		 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"₹ 2880.00\"))").click();
//			
//		 
//		 driver.findElement(MobileBy.xpath("//*[@text='BOOK NOW']")).click();
//		 
//		// driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"₹ 30.00 /hr\"))").click();
//			
//			Thread.sleep(2000);

			
		
	//	driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		

//		driver.pressKey(new KeyEvent(AndroidKey.BACK));
//		Thread.sleep(2000);
//		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"RB Store\"))");
//		
//		Thread.sleep(2000);
//		driver.findElement(MobileBy.xpath("//*[@text='VIEW ALL']")).click();
//		
//		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		
		//Royal Enfield Continental GT 650
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0, 500);");
		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Royal Enfield Meteor Supernova 350\"))").click();
		
	 // by index use get(1) with findelements
		//driver.findElement(MobileBy.xpath("//*[@text='7 DAYS']")).click();
//		
		//driver.findElement(MobileBy.xpath("//*[@text='Royal Enfield Interceptor 650']")).click();
	//	Thread.sleep(2000);
//		driver.findElement(MobileBy.xpath("//*[@text='BOOK NOW']")).click();
//		Thread.sleep(2000);
//		driver.findElement(MobileBy.xpath("//*[@text='Date']")).click();
//		Thread.sleep(2000);
//		
//		driver.findElement(MobileBy.className("android.view.ViewGroup")).click();
//		Thread.sleep(2000);
		
		
	//	driver.findElement(MobileBy.xpath("//*[@text='HOME']")).click();
		
		
		
	}
	
	}
	


