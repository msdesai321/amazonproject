package pOMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePOMClass 
{
	WebDriver driver;
	Actions act;
	
	public HomePOMClass(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
		act = new Actions(driver);
	}
	
	
	@FindBy(xpath="//a[@id='nav-link-accountList']")
	WebElement signin;
	public void movesign()
	{
		act.moveToElement(signin).perform();
	}
	
	@FindBy(xpath="(//span[text()='Sign in'])[1]")
	WebElement signin1;
	public void clickSignin()
	{
		signin1.click();
	}
	
	//create new Account
	@FindBy(xpath="(//a[text()='Start here.'])[1]")
	private WebElement newaccount;
	public void clickhere()
	{
		newaccount.click();
	}
	
	//click on signout
	@FindBy(xpath="//span[text()='Sign Out']")
	private WebElement signout;
	public void clickSignOut()
	{
		signout.click();
	}

}
