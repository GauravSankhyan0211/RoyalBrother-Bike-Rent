package bikeTest;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import bikecapability.bikecapabilityclass;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class storeClass extends bikecapabilityclass {
	
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
//		driver.findElement(MobileBy.xpath("//*[@text='SKIP']")).click();
//		Thread.sleep(2000);
//		driver.findElement(MobileBy.xpath("//*[@text='BANGALORE']")).click();
		Thread.sleep(2000);
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"RB Store\"))").click();
		
		
		driver.findElement(MobileBy.xpath("//*[@text='VIEW ALL']")).click();
		Thread.sleep(2000);
		driver.findElement(MobileBy.xpath("//*[@text='Menu']")).click();
		Thread.sleep(2000);
		driver.findElement(MobileBy.xpath("//*[@text='Products']")).click();
		Thread.sleep(2000);
		driver.findElement(MobileBy.xpath("//*[@text='Motorcycle Accessories']")).click();
		Thread.sleep(2000);
		driver.findElement(MobileBy.xpath("//*[@text='Mobile Phone Holders']")).click();
		Thread.sleep(2000);
		
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		
		
		
		
	}
	@Test
	public void test2() throws InterruptedException {
//	driver.findElement(MobileBy.id("com.royalbrothers:id/half_interstitial_button2")).click();
//	Thread.sleep(2000);
	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"RB Store\"))").click();
	
		driver.findElement(MobileBy.xpath("//*[@text='VIEW ALL']")).click();
		Thread.sleep(2000);
		driver.findElement(MobileBy.xpath("//*[@text='Menu']")).click();
		Thread.sleep(2000);
		driver.findElement(MobileBy.xpath("//*[@text='Brands']")).click();
		Thread.sleep(2000);
		driver.findElement(MobileBy.xpath("//*[@text='LS2']")).click();
		Thread.sleep(2000);
		
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
	}
	@Test
	public void test3() throws InterruptedException {
//	driver.findElement(MobileBy.id("com.royalbrothers:id/half_interstitial_button2")).click();
//	Thread.sleep(2000);
	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"RB Store\"))").click();
	
		driver.findElement(MobileBy.xpath("//*[@text='VIEW ALL']")).click();
		Thread.sleep(2000);
		driver.findElement(MobileBy.xpath("//*[@text='Search our site']")).click();
		Thread.sleep(2000);
		driver.findElement(MobileBy.className("android.widget.EditText")).sendKeys("Gloves");
		Thread.sleep(2000);
		driver.findElement(MobileBy.xpath("//*[@text='SEARCH FOR “GLOVES”']")).click();
		Thread.sleep(2000);
		
		
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
	}
	@Test
	public void test4() throws InterruptedException {
	driver.findElement(MobileBy.id("com.royalbrothers:id/half_interstitial_button2")).click();
//	Thread.sleep(2000);
	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"RB Store\"))").click();
	
		driver.findElement(MobileBy.xpath("//*[@text='VIEW ALL']")).click();
		Thread.sleep(2000);
		driver.findElement(MobileBy.xpath("//*[@text='Cart']")).click();
		Thread.sleep(2000);
		
		driver.findElement(MobileBy.xpath("//*[@text='RETURN TO SHOP']")).click();
		
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
	}
	
	
	
	
}
