package test.jbehave.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import test.jbehave.pages.DemoQaFormRegistrationPage;
import test.jbehave.pages.DemoQaHomePage;
import test.jbehave.pages.TooltipPage;

public class DemoQaProcessingSteps extends ScenarioSteps{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2468070118312065388L;
	
	DemoQaHomePage demoQaHomePage;
	DemoQaFormRegistrationPage formPage;
	TooltipPage toolTipPage;
	
	@Step
	public void validate_I_Am_On_Home_Page(){
		demoQaHomePage.assertPageTitle();
		
	}
  
	@Step
	public void validate_I_Am_On_Form_Page(){
	  waitABit(1200);
	  formPage.assertLocalPageTitle();
	}
	
	@Step
	public void validate_Registration_Button_Is_Visible(){
		demoQaHomePage.assertElementVisible();
	}
	
	@Step
	public void click_On_The_RegistrationButton(){
		System.out.println("inside resgistration button -- page");
		demoQaHomePage.clickOnRegistation();
		 waitABit(1200);
	}
	
	@Step
	public void fillUpTheRegistrationForm(){
		formPage.filRegistrationForm();
	}
	
	@Step
	public void submitTheForm(){
		formPage.clickOnSubmit();
	}
	
	@Step
	public void openTheHomePage(){
		System.out.println("inside steps");
		demoQaHomePage.openUrl();
	}

	@Step
	public void click_On_Tooltip() {
		demoQaHomePage.homePage_Click_On_TooltipButton();
		toolTipPage.toolTipPage_assertTitle();
	}

	@Step
	public void verifyCorrectnessOfTooltipText(String expectedTooltipText) {
		toolTipPage.validateCorrectesnessOfTooltip(expectedTooltipText);
		
	}
}