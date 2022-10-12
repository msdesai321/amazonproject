package testClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC01_VerifyNewAccount extends BaseClass
{
	@Test
	public void VerifyCreateNewAcc()
	{
		//apply validation
		log.info("Apply validation");
		String expectedreslut = "https://www.amazon.in/ap/register";
		String actualresult = driver.getCurrentUrl();
		
		Assert.assertEquals(actualresult, expectedreslut);
	}
	

}
