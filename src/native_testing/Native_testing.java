package native_testing;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Native_testing {

	public static AndroidDriver<AndroidElement> capability() throws MalformedURLException {
		DesiredCapabilities cp = new DesiredCapabilities();
		//cp.setCapability(MobileCapabilityType.DEVICE_NAME, "ASUS_X00TD");
		cp.setCapability(MobileCapabilityType.DEVICE_NAME, "Aswin");
		cp.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");	
		cp.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "io.appium.android.apis");
		cp.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "io.appium.android.apis.ApiDemos");
		//cp.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.google.android.apps.messaging");
		//cp.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.google.android.apps.messaging.main.MainActivity");
		 AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),cp);
         return driver;
	}

}
