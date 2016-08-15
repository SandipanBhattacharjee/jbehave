package test.jbehave.steps;
import org.jbehave.core.annotations.*;

import net.thucydides.core.annotations.Steps;
import test.jbehave.steps.serenity.DemoQaProcessingSteps;

public class TooltipJBehave_Steps{
	
	@Steps
	DemoQaProcessingSteps demoQaSteps;
	
	@Given("i am able to get into demoQa site")
	public void givenIAmAbleToGetIntoDemoQaSite(){
		System.out.println("inside given");
		demoQaSteps.openTheHomePage();
	    demoQaSteps.validate_I_Am_On_Home_Page();
	}
	
	@When("I click on the tooltip button")
	public void whenIClickOnTheTooltipButton(){
		demoQaSteps.click_On_Tooltip();
		 
	}
	@Then("I should be able to verify the tooltip text is<text>")
	public void thenIShouldBeAbleToVerifyTheTooltipTextIstext(@Named("text") String expectedString){
		 demoQaSteps.verifyCorrectnessOfTooltipText(expectedString);
	}
}