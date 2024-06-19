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

public class menuTest extends bikecapabilityclass{
	
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
		//driver.findElement(MobileBy.xpath("//*[@text='SKIP']")).click();
	//	
//		driver.findElement(MobileBy.xpath("//*[@text='Select City']")).click();
//		Thread.sleep(2000);
//		driver.findElement(MobileBy.xpath("//*[@text='BANGALORE']")).click();
		Thread.sleep(2000);
		driver.findElement(MobileBy.xpath("//*[@text='MENU']")).click();
		
		driver.findElement(MobileBy.xpath("//*[@text='Help & Support']")).click();
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Greivances\"))").click();
		
		
		
		driver.findElements(MobileBy.className("android.view.ViewGroup")).get(0).click();
		
		
	}
	
	@Test
	public void test2() throws InterruptedException {
			
			driver.findElement(MobileBy.id("com.royalbrothers:id/half_interstitial_button2")).click();
			Thread.sleep(2000);
			//driver.findElement(MobileBy.xpath("//*[@text='SKIP']")).click();
		//	
//			driver.findElement(MobileBy.xpath("//*[@text='Select City']")).click();
//			Thread.sleep(2000);
//			driver.findElement(MobileBy.xpath("//*[@text='BANGALORE']")).click();
			Thread.sleep(2000);
			driver.findElement(MobileBy.xpath("//*[@text='MENU']")).click();
			
			driver.findElement(MobileBy.xpath("//*[@text='Log in or Sign up']")).click();
			
			
			driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view."
					+ "ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view."
					+ "ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup")).click();
			driver.findElement(MobileBy.xpath("//*[@text='INDIA']")).click();
			
			driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget"
					+ ".LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android"
					+ ".view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.EditText\n"
					+ "")).sendKeys("708281362");
			
			
//			driver.findElement(MobileBy.xpath("//*[@text='Enter Your Phone Number']")).sendKeys("7082813625");
//			
			driver.findElement(MobileBy.xpath("//*[@text='GET OTP']")).click();
			Thread.sleep(35000);
			//driver.pressKey(new KeyEvent(AndroidKey.BACK));
			
			
			
			
			
			
	}
	@Test
	public void test3() throws InterruptedException {
			
			driver.findElement(MobileBy.id("com.royalbrothers:id/half_interstitial_button2")).click();
			Thread.sleep(2000);
			//driver.findElement(MobileBy.xpath("//*[@text='SKIP']")).click();	
//			driver.findElement(MobileBy.xpath("//*[@text='Select City']")).click();
//			Thread.sleep(2000);
			//driver.findElement(MobileBy.xpath("//*[@text='BANGALORE']")).click();
			Thread.sleep(2000);
			driver.findElement(MobileBy.xpath("//*[@text='MENU']")).click();
			Thread.sleep(2000);
			driver.findElement(MobileBy.xpath("//*[@text='Log in or Sign up']")).click();
			
			
			driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view."
					+ "ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view."
					+ "ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup")).click();
			//driver.findElement(MobileBy.xpath("//*[@text='INDIA']")).click();
			
			driver.findElement(MobileBy.xpath("//*[@text='THAILAND']")).click();
			driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget"
					+ ".LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android"
					+ ".view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.EditText\n"
					+ "")).sendKeys("708281362A");
			Thread.sleep(2000);
			driver.findElement(MobileBy.xpath("//*[@text='GET OTP']")).click();
			
}
	@Test
	public void test4() throws InterruptedException {
			
			driver.findElement(MobileBy.id("com.royalbrothers:id/half_interstitial_button2")).click();
			Thread.sleep(2000);
			driver.findElement(MobileBy.xpath("//*[@text='SKIP']")).click();	
//			driver.findElement(MobileBy.xpath("//*[@text='Select City']")).click();
//			Thread.sleep(2000);
			driver.findElement(MobileBy.xpath("//*[@text='BANGALORE']")).click();
			Thread.sleep(2000);
			driver.findElement(MobileBy.xpath("//*[@text='MENU']")).click();
			Thread.sleep(2000);
			driver.findElement(MobileBy.xpath("//*[@text='Log in or Sign up']")).click();
			
			
			driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view."
					+ "ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view."
					+ "ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup")).click();
			driver.findElement(MobileBy.xpath("//*[@text='INDIA']")).click();
			
			driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget"
					+ ".LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android"
					+ ".view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.EditText\n"
					+ "")).sendKeys("7082813625");
			
			driver.findElement(MobileBy.xpath("//*[@text='GET OTP']")).click();
			
}
}
