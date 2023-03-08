package tek.sdet.framework.steps;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailAccountSteps extends CommonUtility {

	// extends CommonUtilityClass
	// Create object of POMFactory
	// Write implementation steps

	POMFactory factory = new POMFactory();

	@When("User click on Account option")
	public void userClickOnAccountOption() {
		click(factory.homePage().accountOption);
		logger.info("User Click on Account");

	}

	@And("User update Name {string} and Phone {string}")
	public void userUpdateNameAndPhoneNumber(String name, String phoneNumber) {

		// clear the existing value
		// enter new value
		clearTextUsingSendKeys(factory.accountPage().nameInput);
		sendText(factory.accountPage().nameInput, name);
		clearTextUsingSendKeys(factory.accountPage().phoneInput);
		sendText(factory.accountPage().phoneInput, phoneNumber);
		logger.info("Updating Name and Phone Number");}

	@And("User click on Update button")
	public void userClickOnUpdateButton() {
		click(factory.accountPage().updateButton);
		logger.info("Click on update button");
	}
	@Then("user profile information should be updated")
	public void userProfileInfoShouldUpdate() {

		waitTillPresence(factory.accountPage().personalInfoUpdateMessage);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().personalInfoUpdateMessage));
		String actualMessage = factory.accountPage().personalInfoUpdateMessage.getText();
		String expectedMessage = "Personal Information Updated Successfully";
		Assert.assertEquals(expectedMessage, actualMessage);
		logger.info("User Profile Information Updated");
	}

}
