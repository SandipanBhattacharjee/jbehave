package test.jbehave.steps.orangeHRMSteps;
import org.jbehave.core.annotations.*;

import net.thucydides.core.annotations.Steps;
import test.jbehave.steps.serenity.OrangeHRMSerenitySteps;
public class OrangeHRMJBehave{
	
	@Steps
	OrangeHRMSerenitySteps orngSteps;

	@Given("user is on Directory page")
	public void givenUserIsOnDirectoryPage(){
		 orngSteps.validateWeLandedOnDirectoryPage();
		 orngSteps.clickOnDirectoryLink();
	}
	
	@When("user enter <searchText> as Name")
	public void whenUserEnterSearchString(@Named("searchText") String searchString){
		orngSteps.validateWeLandedOnSearchPageAndEnterSearchText(searchString);
	}
	
	@When("user click on Search")
	public void whenUserClickOnSearch(){
		orngSteps.clickOnSearchButton();
	}
	
	@Then("<searchResult> should display in the search result")
	public void thenCorrectResultShouldDisplayInTheSearchResult(@Named("searchResult") String searchResult){
		orngSteps.validateSearchResult(searchResult);
	}

	
	
}