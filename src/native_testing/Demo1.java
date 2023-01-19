package native_testing;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.annotations.*;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Demo1 extends Native_testing {
	AndroidDriver<AndroidElement> driver;
	@BeforeTest
	public void BT() throws MalformedURLException{
		 driver = capability();
	}
	@Test
	public void test1() throws InterruptedException{
		 driver.findElement(MobileBy.AccessibilityId("Preference")).click();
		 Thread.sleep(1000);
		 driver.findElement(MobileBy.AccessibilityId("3. Preference dependencies")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.id("android:id/checkbox")).click();
		 Thread.sleep(1000);
		 driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"WiFi settings\")")).click();
		 //or u can use the below one
		// driver.findElementByAndroidUIAutomator("UiSelector().text(\"WiFi settings\")").click();
		// driver.findElement(By.xpath("//*[@text=WiFi settings")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.id("android:id/edit")).sendKeys("aswin");
		 Thread.sleep(1000);
		 driver.findElements(MobileBy.className("android.widget.Button")).get(0).click();
		 driver.navigate().back();
		 driver.pressKey(new KeyEvent(AndroidKey.HOME));
		 driver.openNotifications();
		 Thread.sleep(1000);
		// driver.findElement(MobileBy.AccessibilityId("Battery Saver")).click();
		// driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.findElementByXPath("//*[@content-desc='Battery Saver']").click();
		 
	}

}
