package testClasses;

import java.io.IOException;
import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pOMClass.HomePOMClass;
import pOMClass.LoginPOMClass;
import utilityClass.ScreenshotClass;

public class BaseClass 
{
	WebDriver driver;
	Logger log = Logger.getLogger("amezon");
	
	@BeforeMethod
	public void VerifyloginFunctionality(String browsername) throws IOException, InterruptedException
	{
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",
					"./DriverFolder\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browsername.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",
					"./DriverFolder\\geckodriver.exe");	
			driver = new FirefoxDriver();
		}
		else
		{
			System.setProperty("webdriver.opera.driver",
					"./DriverFolder\\operadriver.exe");
			driver = new OperaDriver();
		}
		
		PropertyConfigurator.configure("log4j.properties");
		
		driver.get("https://www.amazon.in/");
		log.info("Browser is opened");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		ScreenshotClass.Screenshot(driver, "HomePage");
		
		HomePOMClass m = new HomePOMClass(driver);
		m.movesign();
		log.info("cursor move to signup");
		m.clickSignin();
		log.info("click on sign button");
		LoginPOMClass m1 = new LoginPOMClass(driver);
		Thread.sleep(3000);
		ScreenshotClass.Screenshot(driver, "NewAccWindow");
		m1.sendFirstName();
		log.info("first name is entered");
		m1.sendNewMobNo();
		log.info("mobile no is entered");
		m1.sendNewPassword();
		log.info("Password is entered");
		m1.clickContinue();
		log.info("continue butten clicked");
		Thread.sleep(3000);
		ScreenshotClass.Screenshot(driver, "OTPWindow");
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.close();
		log.info("browser is closed");
		log.info("end of th program");
	}

}
