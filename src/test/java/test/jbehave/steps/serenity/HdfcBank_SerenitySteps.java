package test.jbehave.steps.serenity;

import java.util.List;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import test.jbehave.pages.HdfcHomePage;

public class HdfcBank_SerenitySteps extends ScenarioSteps{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8007069286276461997L;
	HdfcHomePage homePage;
	
	@Step
	public void validateIamOnHdfcHomePage(){
	  homePage.open();
	  getDriver().manage().window().maximize();
	  homePage.hdfcPage_clickOnClosePopUp();
	  homePage.hdfcPage_validatePageTitle();
	}
	
	@Step
	public void validate_ICanClickOnDropdown(){
		homePage.hdfcPage_clickOnHdfcDropdown();
	}
	
	@Step
	public void validate_TheNumberOfOptions(List<String> expectedOptionsList){
	 homePage.hdfcPage_validateExpectedAndActualAreSame(expectedOptionsList, homePage.hdfcPage_getListOfOptions());
	}

}
