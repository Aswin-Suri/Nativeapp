package native_testing;


import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.LongPressOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.TapOptions.tapOptions;
//import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Demo2 extends Native_testing {
	AndroidDriver<AndroidElement> driver;
	@BeforeTest
	public void BT() throws MalformedURLException{
		driver = capability();
	}
	@Test(enabled=false)
		public void test1() throws InterruptedException{
		// driver.findElement(MobileBy.AccessibilityId("Views")).click();
		 driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		WebElement list = driver.findElementByAndroidUIAutomator("new UiSelector().clickable(true)");
		Dimension number = list.getSize();
		System.out.println(number);
		WebElement El =  driver.findElement(MobileBy.AccessibilityId("Expandable Lists"));
		TouchAction ta = new TouchAction(driver);
		//tap actions an alternative for clicks
	    ta.tap(tapOptions().withElement(element(El))).perform();
	    Thread.sleep(3000);
	    driver.findElement(MobileBy.AccessibilityId("1. Custom Adapter")).click();
	    WebElement la = driver.findElementByAndroidUIAutomator("text(\"People Names\")");
	  Thread.sleep(3000);
	 // la.click();
	 //   ta.longPress(LongPressOptions().withElement(element(la)).withDuration(ofSeconds(3))).release().perform();
      ta.longPress(longPressOptions().withElement(element(la)).withDuration(ofSeconds(3))).release().perform();
    //  driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().
      Thread.sleep(3000);
     WebElement l = driver.findElements(MobileBy.className("android.widget.TextView")).get(1);
     System.out.println(l.getText());
     l.click();
    
	    
	}
	@Test(enabled=false)
	//scrolling how to scroll
	public void test2() throws InterruptedException{
		 driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		 Thread.sleep(2000);
		 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"))").click();
	}
	@Test(enabled=false)
	//drag from one point to another
	public void test3() throws InterruptedException{
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.AccessibilityId("Date Widgets")).click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.AccessibilityId("2. Inline")).click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.AccessibilityId("9")).click();
		WebElement btn1= driver.findElement(MobileBy.AccessibilityId("15"));
		WebElement btn2= driver.findElement(MobileBy.AccessibilityId("45"));
		TouchAction ta = new TouchAction(driver);
		ta.longPress(longPressOptions().withElement(element(btn1)).withDuration(ofSeconds(2))).moveTo(element(btn2)).release().perform();
	//	driver.pressKey(new KeyEvent(AndroidKey.not));
	//	driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
		//driver.pressKey(new KeyEvent(AndroidKey.HOME));
	}
	@Test(enabled=false)//longpresss
	public void test4() throws InterruptedException{
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.AccessibilityId("Drag and Drop")).click();
		Thread.sleep(3000);
		WebElement bt1 =driver.findElementById("io.appium.android.apis:id/drag_dot_1");
		WebElement bt2 =driver.findElementById("io.appium.android.apis:id/drag_dot_3");
		TouchAction ta = new TouchAction(driver);
		ta.longPress(longPressOptions().withElement(element(bt1))).moveTo(element(bt2)).release().perform();
	}
	@Test(enabled=false)
	public void test5() throws InterruptedException{
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.startActivity(new Activity("com.google.android.dialer","com.google.android.apps.dialer.extensions.GoogleDialtactsActivity"));
		System.out.println("Current activity package name is"+ driver.getCurrentPackage());
		driver.startActivity(new Activity("com.google.android.dialer","com.google.android.apps.dialer.extensions.GoogleDialtactsActivity"));
		System.out.println("Current activity package name is"+ driver.getCurrentPackage());
		Thread.sleep(2000);
		driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
		Thread.sleep(2000);
		driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
	}
	@Test(enabled=false)
	public void test6() throws InterruptedException{
		 driver.findElementByAccessibilityId("Views").click();
		 Thread.sleep(2000);
		 driver.findElementByAccessibilityId("Auto Complete").click();
         //performing screen top
		 driver.findElementByXPath("//android.widget.TextView[@content-desc=\"1. Screen Top\"]").click();
		 Thread.sleep(2000);
		
		 driver.findElementByAccessibilityId("Give me Focus").click();
		 Thread.sleep(2000);
		 driver.findElement(By.id("io.appium.android.apis:id/edit")).sendKeys("Ind");
		 driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		 driver.pressKey(new KeyEvent(AndroidKey.DEL));
		 Thread.sleep(2000);
		 driver.pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
		 driver.pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
		 driver.pressKey(new KeyEvent(AndroidKey.ENTER));
	}
	@Test(enabled=false)
	public void test7() throws InterruptedException{
		driver.findElementByAccessibilityId("OS").click();
		Thread.sleep(2000);
		 driver.findElementByAccessibilityId("SMS Messaging").click();
		 Thread.sleep(2000);
		// driver.findElement(By.id("io.appium.android.apis:id/sms_recipient")).sendKeys("(555) 521-5554");
		// Thread.sleep(2000);
		// driver.findElement(By.id("io.appium.android.apis:id/sms_content")).sendKeys("7373");
	//	 Thread.sleep(2000);
		// driver.findElementByAccessibilityId("Send").click();
		 //WebDriverWait wait = new WebDriverWait(driver,30);
		 driver.startActivity(new Activity("com.google.android.apps.messaging","com.google.android.apps.messaging.home.HomeActivity"));
	Thread.sleep(10000);
	String s =driver.findElementById("com.google.android.apps.messaging:id/conversation_snippet").getText();
	

//		 driver.findElements(MobileBy.className("android.widget.RelativeLayout")).get(0).click();
//		 driver.findElements(MobileBy.className(" android.widget.LinearLayout")).get(11).;
	}
}

