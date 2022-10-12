package testClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import pOMClass.HomePOMClass;

public class TC03_LogOut extends BaseClass2
{
	@Test
	public void VerifySignOut()
	{
		HomePOMClass m = new HomePOMClass(driver);
		m.movesign();
		log.info("curser move to sign up");
		m.clickSignOut();
		log.info("Click on signout");
		
		//apply validation
		log.info("Apply validation");
		String actualresult = driver.getTitle();
		String expectedresult = "Amazon Sign In";
		Assert.assertEquals(actualresult, expectedresult);
		
	}

}
