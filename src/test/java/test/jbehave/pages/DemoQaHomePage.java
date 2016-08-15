package test.jbehave.pages;


import org.junit.Assert;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://demoqa.com/")
public class DemoQaHomePage extends BasePage{
	
	private static final String PAGE_TITLE="Demoqa | Just another WordPress site";

	@FindBy(linkText="Registration")
	WebElementFacade registrationButton;
	
	@FindBy(linkText="Tooltip")
	WebElementFacade tooltipButton;
	
	public void clickOnRegistation(){
		registrationButton.click();
	}
	
	public void assertElementVisible(){
		Assert.assertTrue(registrationButton.isVisible());
	}
	
	public void openUrl(){
		open();
		getDriver().manage().window().maximize();
	}
	
	public void assertPageTitle(){
		assertPageTitle(PAGE_TITLE);
		
	}
	
	public void homePage_Click_On_TooltipButton(){
		tooltipButton.click();
	}

	
}
