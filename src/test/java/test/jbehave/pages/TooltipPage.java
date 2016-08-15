package test.jbehave.pages;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;


public class TooltipPage extends BasePage {
	private final String EXPECTED_TITLE="Tooltip | Demoqa";
	
	
	@FindBy(id="age")
	WebElementFacade yourAgeHoverText;
	
	@FindBy(xpath=".//*[@id='tabs-1']/div/p[1]")
	WebElementFacade thisIsAnyOtherArea;
	
	public void toolTipPage_assertTitle(){
		assertPageTitle(EXPECTED_TITLE);
	}

	public void validateCorrectesnessOfTooltip(String expectedTooltipText) {
			Assert.assertTrue(expectedTooltipText.equals(getTooltipText()));
	}
	
	
	private String getTooltipText(){
		String tooltipText="";
		Actions action=new Actions(getDriver());
		action.clickAndHold(yourAgeHoverText).perform();
		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		action.click(thisIsAnyOtherArea).perform();
		tooltipText=yourAgeHoverText.getAttribute("Title");
		return tooltipText;		
	}

}
