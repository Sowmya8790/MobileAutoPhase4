package PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Webele {

	AndroidDriver<MobileElement>driver;
	public Webele(AndroidDriver<MobileElement>driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
		
		@FindBy(xpath = "//android.widget.TextView[@text='Search for products']")
		WebElement clicksearch;
		
		@FindBy(xpath = "//android.widget.EditText[@text='Search for Products, Brands and More']")
		WebElement  clicksearchtwice;
		
		@FindBy(xpath = "//android.widget.TextView[@text='mobiles']")
		WebElement  clickMobile;
		
		@FindBy(xpath = "//android.widget.TextView[@text='Infinix HOT 20 Play (Fantasy Purple, 64 GB)']")
		WebElement  selectmobile;
		
		@FindBy(xpath = "//android.widget.TextView[@text='Go to cart']")
		WebElement  gotocart;
		
		@FindBy(xpath = "//android.widget.TextView[@text='My Cart']")
		WebElement  mycart;
		
		
		public void buymobile(String element) throws InterruptedException {
			
			Thread.sleep(5000);			
			clicksearch.click();
			Thread.sleep(5000);
			clicksearchtwice.sendKeys(element);
			Thread.sleep(5000);
			clickMobile.click();
			Thread.sleep(5000);
			selectmobile.click();
			Thread.sleep(5000);
			gotocart.click();
			Thread.sleep(5000);
		
		}
		
		public void validate () {
			
			boolean cart = clickMobile.isDisplayed();
			Assert.assertTrue(cart);
		}
		
		
		
		
		
	

}
