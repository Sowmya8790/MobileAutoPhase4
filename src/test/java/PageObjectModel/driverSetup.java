package PageObjectModel;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

@SuppressWarnings("unused")
public class driverSetup {
	public static AndroidDriver<MobileElement>driver;
	public static Actions action;
	public static Properties prop;
	
	@BeforeClass
	public static WebDriver Driver() throws IOException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
		cap.setCapability("plateformName","ANDROID");
		cap.setCapability("ignoreHiddenApiPolicyError", true);
		cap.setCapability("appPackage","com.flipkart.android");
		cap.setCapability("appActivity","com.flipkart.android.SplashActivity");
		cap.setCapability("noReset",true);
	    driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);	
		return driver;	
	}

	

}