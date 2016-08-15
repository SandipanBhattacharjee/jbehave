package test.jbehave.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import net.thucydides.core.annotations.Steps;
import test.jbehave.steps.serenity.DemoQaProcessingSteps;
public class DemoQA_Jbehave_Steps{
	
	@Steps
	DemoQaProcessingSteps demoQaSteps;
	
	
	@Given("I launch demoQa site")
	public void givenILaunchDemoQaSite(){
		demoQaSteps.openTheHomePage(); 
	}
	
	@When("registration button is visible")
	public void whenRegistrationButtonIsVisible(){
		 demoQaSteps.validate_Registration_Button_Is_Visible();
		 demoQaSteps.validate_I_Am_On_Home_Page();
	}
	
	@Then("Click registration button and confirm we are on correct page")
	public void thenClickRegistrationButtonAndConfirmWeAreOnCorrectPage(){
		System.out.println("This is registration button clicking");
		 demoQaSteps.click_On_The_RegistrationButton();
		 demoQaSteps.validate_I_Am_On_Form_Page();
	}
//-------------------------------------------------- second story steps in the story file-------------------------	
	@Given("I click on the registration button")
	public void givenIClickOnTheRegistrationButton(){
		demoQaSteps.openTheHomePage();
		demoQaSteps.click_On_The_RegistrationButton();
	}
	
	@When(" I fill up the form")
	public void whenIFillUpTheForm(){
		 demoQaSteps.fillUpTheRegistrationForm();
	}
	
	@Then("I am able to click on the submit button.")
	public void thenIAmAbleToClickOnTheSubmitButton(){
		demoQaSteps.submitTheForm();
	}
}