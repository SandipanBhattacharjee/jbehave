package test.jbehave.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import test.jbehave.pages.orangeHrm.OrangeHrmDirectoryPage;
import test.jbehave.pages.orangeHrm.OrangeHrmLoginPage;

public class OrangeHRMSerenitySteps extends ScenarioSteps {
	
	private static final long serialVersionUID = -5169785221305694474L;
	
	OrangeHrmLoginPage loginPage;
	OrangeHrmDirectoryPage directoryPage;
	
	@Step
	public void validateLandingOnOrangeHRMLoginPage(){
		loginPage.open();
		loginPage.getDriver().manage().window().maximize();
		String expectedLoginPanel="Login Panel";
		loginPage.loginPage_ValidateWeAreOnLoginPage(expectedLoginPanel);
	}
	
	@Step
	public void putTextInLoginTextField(String userName){
		loginPage.loginPage_FillInUserName(userName);
	}

	@Step
	public void putTextInPassWordTextField(String passWord){
		loginPage.loginPage_FillInPassword(passWord);
	}
	
	@Step
	public void clickOnLoginButton(){
		loginPage.loginPage_ClickOnLoginButton();
	}
	
	@Step
	public void validateWeLandedOnDirectoryPage(){
		directoryPage.validate_WeAreOnDirectoryPage();
	}
	
	@Step
	public void clickOnDirectoryLink(){
		directoryPage.directoryPage_ClickOnDirectoryLink();
	}
	
	@Step
	public void validateWeLandedOnSearchPageAndEnterSearchText(String searchText){
		directoryPage.validate_WeAreOnSearchPage();
		directoryPage.directoryPage_fillInSearchTextField(searchText);
	}
	
	@Step
	public void clickOnSearchButton(){
		directoryPage.directoryPage_clickOnSearchButton();
	}
	
	@Step
	public void validateSearchResult(String expectedSearchResult){
		directoryPage.validateSearchIsCorrect(expectedSearchResult);
		directoryPage.logout();
	}
	
	
}
