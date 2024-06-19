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

public class offerClass extends bikecapabilityclass {
	
	AndroidDriver<AndroidElement> driver;
	@BeforeTest
	public void bt() throws MalformedURLException {
	 driver = capability();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	}
	
	
	
	@Test
	public void test4() throws InterruptedException {
	driver.findElement(MobileBy.id("com.royalbrothers:id/half_interstitial_button2")).click();
	Thread.sleep(2000);
	
		driver.findElement(MobileBy.xpath("//*[@text='Offers']")).click();
		Thread.sleep(2000);
		driver.findElement(MobileBy.xpath("//*[@text='FIRSTRIDE']")).click();
		Thread.sleep(2000);
		
		driver.findElement(MobileBy.xpath("//*[@text='T&C']")).click();
		Thread.sleep(2000);
		
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
	}
}
