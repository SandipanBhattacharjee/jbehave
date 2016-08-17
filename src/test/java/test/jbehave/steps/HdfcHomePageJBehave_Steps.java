package test.jbehave.steps;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.jbehave.core.annotations.*;
import org.jbehave.core.model.ExamplesTable;

import net.thucydides.core.annotations.Steps;
import test.jbehave.steps.serenity.HdfcBank_SerenitySteps;
public class HdfcHomePageJBehave_Steps{

	@Steps
	HdfcBank_SerenitySteps hdfcSteps;
	
	@Given("I am on the hdfc home page")
	public void givenIAmOnTheHdfcHomePage(){
		hdfcSteps.validateIamOnHdfcHomePage();
	}

	@When("I click on the dropdown")
	public void whenIClickOnTheDropdown(){
		hdfcSteps.validate_ICanClickOnDropdown();
	}

	@Then("I am able to verify the:$options")
	public void thenIAmAbleToVerifyTheoptions(ExamplesTable options){
		hdfcSteps.validate_TheNumberOfOptions(getListOfExpectedOptions(options));
	}
	
	
	
	private List<String> getListOfExpectedOptions(ExamplesTable table){
		List<String> optionsList=new ArrayList<String>();
		for(Map<String, String> row: table.getRows()){
			String option=row.get("options");
			optionsList.add(option);
		}
		return optionsList;
	}

}