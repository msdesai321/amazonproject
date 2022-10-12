package pOMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOMClass
{
	WebDriver driver;
	Actions act;
	
	public LoginPOMClass(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
		act = new Actions(driver);
	}
	
	
	@FindBy(xpath="(//input[@id='ap_email'])")
	WebElement mailid;
	public void sendMobNo()
	{
		mailid.sendKeys("8485825057");
	}
	
	@FindBy(xpath="(//input[@id='continue'])")
	private WebElement continue1;
	public void clickContinue()
	{
		continue1.click();
	}
	
	//password
	@FindBy(xpath="(//input[@id='ap_password'])")
	private WebElement password;
	public void sendPassword()
	{
		password.sendKeys("Mahi@255");
	}
	
	@FindBy(xpath="(//input[@id='signInSubmit'])")
	private WebElement sign;
	public void clickSignin1()
	{
		sign.click();
	}
	
	
	@FindBy(xpath="(//input[@id='ap_customer_name'])")
	private WebElement firstname;
	public void sendFirstName()
	{
		firstname.sendKeys("mahesh desai");
	}
	
	@FindBy(xpath="(//input[@id='ap_phone_number'])")
	private WebElement mobno;
	public void sendNewMobNo()
	{
		mobno.sendKeys("84598356");
	}
	
	@FindBy(xpath="(//input[@id='ap_password'])")
	private WebElement newpassword;
	public void sendNewPassword()
	{
		newpassword.sendKeys("rakesh6797");
	}
	


	

}
