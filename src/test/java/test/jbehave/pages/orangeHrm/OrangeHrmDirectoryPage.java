package test.jbehave.pages.orangeHrm;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class OrangeHrmDirectoryPage extends PageObject{
	
	@FindBy(linkText="Directory")
	private WebElementFacade directoyMenuItem;
	
	@FindBy(id="searchDirectory_emp_name_empName")
	private WebElementFacade searchEmpNameTextField;
	
	@FindBy(id="searchBtn")
	private WebElementFacade searchButton;
	
	@FindBy(id="welcome")
	private WebElementFacade welcomeMenu;
	
	@FindBy(linkText="Logout")
	private WebElementFacade logoutLink;
	
	
	private final String readTableXpathFixedFirstPart=".//*[@id='resultTable']/tbody/tr[" ;
	private final String readTableXpathFixedSecondPart="]/td[2]/ul/li[1]/b";
			
	
	public void validate_WeAreOnDirectoryPage(){
		Assert.assertTrue(directoyMenuItem.isEnabled());
	}
	
	public void directoryPage_ClickOnDirectoryLink(){
		directoyMenuItem.click();
	}

	public void validate_WeAreOnSearchPage(){
		Assert.assertTrue(searchButton.isEnabled());
	}
	
	public void directoryPage_fillInSearchTextField(String searchText){
		searchEmpNameTextField.sendKeys(searchText);
		searchEmpNameTextField.sendKeys(Keys.ENTER);
	}
	
	public void directoryPage_clickOnSearchButton(){
		searchButton.click();
	}
	
	public void validateSearchIsCorrect(String expectedSearchResult){
		int i=2;
		boolean stringMatched=false;
		String actualSearchResult=null;
		while(true){
			try{
				actualSearchResult=getDriver().findElement(By.xpath(readTableXpathFixedFirstPart+
																			i+readTableXpathFixedSecondPart)).getText();
			}catch (NoSuchElementException e) {
				break;
			}																	
			if(actualSearchResult.equals(expectedSearchResult)){
				stringMatched=true;
				break;
			}else{
				i++;
				System.out.println(i);
			}
		}
		Assert.assertTrue(stringMatched);
	}
	
	public void logout(){
		welcomeMenu.click();
		logoutLink.click();
	}
}
