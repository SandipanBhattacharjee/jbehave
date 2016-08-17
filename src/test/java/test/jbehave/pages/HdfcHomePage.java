package test.jbehave.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.hdfcbank.com")
public class HdfcHomePage extends BasePage{

	private static final String pageTitle="HDFC Bank: Personal Banking Services";
	private static final String loginDropdownOptions=".//ul[@class='loginOption']/li";

	@FindBy(xpath="//div[@id='cee_closeBtn']/img")
	WebElementFacade closePopupButton;


	@FindBy(xpath="//div[contains(@class,'homebanner_wrapper')]"
			+ "/div[contains(@class,'clearfix')]/div[2]/div[@class='loginwrap']/div/div[@class='selectedvalue']")
	WebElementFacade netBankingDropdown;




	public void  hdfcPage_validatePageTitle(){
		assertPageTitle(pageTitle);
	}

	public void hdfcPage_clickOnClosePopUp(){
		int i=0;
		while(!closePopupButton.isCurrentlyEnabled() && i<100){
			getDriver().manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			i++;
		}closePopupButton.click();		
	}

	public void hdfcPage_clickOnHdfcDropdown(){
		netBankingDropdown.click();
	}

	public List<String> hdfcPage_getListOfOptions(){
		List<WebElement> optionWebElementList=getDriver().findElements(By.xpath(loginDropdownOptions));
		List<String> optionTextList=new ArrayList<String>();
		for(int i=0;i<optionWebElementList.size();i++){
			optionTextList.add(optionWebElementList.get(i).getText());
		}
		return optionTextList;
	}

	public void hdfcPage_validateExpectedAndActualAreSame(List<String> expectedOptionsList, List<String> actualOptionsList){
		Assert.assertTrue(expectedOptionsList.size()==actualOptionsList.size());
		for(int i=0;i<expectedOptionsList.size();i++){	
			String expectedOption=expectedOptionsList.get(i);
			String actualOption=actualOptionsList.get(i);		
			Assert.assertTrue((expectedOption.equals(actualOption))||(actualOption.contains(expectedOption)));
		}
	}		

}
