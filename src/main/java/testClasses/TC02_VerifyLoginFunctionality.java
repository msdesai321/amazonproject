package testClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC02_VerifyLoginFunctionality extends BaseClass2
{
	@Test
	public void verifylogin()
	{
		//apply validation
		log.info("Apply validation");
		String actualresult = driver.getTitle();
		String expectedresult = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		Assert.assertEquals(actualresult, expectedresult);
	}

}
