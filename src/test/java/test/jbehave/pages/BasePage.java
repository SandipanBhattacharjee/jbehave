package test.jbehave.pages;

import org.junit.Assert;

import net.serenitybdd.core.pages.PageObject;

public class BasePage extends PageObject{
	
	public void assertPageTitle(String pageTitle){
		Assert.assertTrue(pageTitle.equals(getDriver().getTitle()));
	}

}
