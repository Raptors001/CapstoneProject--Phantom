package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup {
	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(xpath = "//img[@alt='profile pic']")
	public WebElement accountProfilePicture;
	
	
	@FindBy(xpath = "//input[@id='nameInput']")
	public WebElement nameInput;
	
	@FindBy(xpath = "//input[@id='personalPhoneInput']")
	public WebElement phoneInput;
	
	@FindBy(xpath = "//button[@id='personalUpdateBtn']")
	public WebElement updateButton;
	
	@FindBy(xpath = "//div[text()='Personal Information Updated Successfully']")
	public WebElement personalInfoUpdateMessage;
	
	
	
	
}
