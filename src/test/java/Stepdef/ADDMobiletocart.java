package Stepdef;

import org.testng.annotations.Test;

import PageObjectModel.Webele;
import PageObjectModel.driverSetup;

public class ADDMobiletocart extends driverSetup{
	
	
	@Test
	public void AFlipkarttest() throws InterruptedException {
		   
		Webele ele = new Webele(driver);
		ele.buymobile("mobiles");
		ele.validate();
			
		
	}
	
	@Test
	public void teardown() {
		
		driver.quit();
		
	}

}
