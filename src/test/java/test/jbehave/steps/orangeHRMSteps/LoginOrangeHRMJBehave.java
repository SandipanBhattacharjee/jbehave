package test.jbehave.steps.orangeHRMSteps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import net.thucydides.core.annotations.Steps;
import test.jbehave.steps.serenity.OrangeHRMSerenitySteps;

public class LoginOrangeHRMJBehave{
	@Steps
	OrangeHRMSerenitySteps orngSteps;

	
	@Given("the user is on the OrangeHRM page")	
	public void givenTheUserIsOnTheOrangeHRMPage(){
		orngSteps.validateLandingOnOrangeHRMLoginPage();
	}
	
	@When("user enters username as <userName>")
	public void whenUserEntersUsername(@Named("userName") String userName){
		 orngSteps.putTextInLoginTextField(userName);
	}
	
	@When("user enters password as <passWord>")
	public void whenUserEntersPassword(@Named("passWord") String passWord){
		orngSteps.putTextInPassWordTextField(passWord);
	}
	
	@When("user clicks on Login button")
	public void whenUserClicksOnLoginButton(){
		orngSteps.clickOnLoginButton();
	}
	
	@Then("user should land on Dashboard page")
	public void thenUserShouldLandOnDashboardPage(){
		 orngSteps.validateWeLandedOnDirectoryPage();
	}

}
