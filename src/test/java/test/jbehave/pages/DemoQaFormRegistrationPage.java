package test.jbehave.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://demoqa.com/")
public class DemoQaFormRegistrationPage extends BasePage {

	private static final String PAGE_TITLE="Registration | Demoqa";

	@FindBy(id="name_3_firstname")
	WebElementFacade firstName;

	@FindBy(id="name_3_lastname")
	WebElementFacade lastName;

	@FindBy(xpath=".//input[@value='married']")
	WebElementFacade marriedRadioButton;

	@FindBy(xpath=".//input[@value='reading']")
	WebElementFacade readingCheckBox;

	@FindBy(id="dropdown_7")
	WebElement countryDropDown;


	@FindBy(id="phone_9")
	WebElementFacade phone;

	@FindBy(id="username")
	WebElementFacade userNameTextBox;

	@FindBy(id="email_1")
	WebElementFacade emailTexBox;

	@FindBy(id="password_2")
	WebElementFacade passwordTextBox; 

	@FindBy(id="confirm_password_password_2")
	WebElementFacade confirmPassword;

	@FindBy(name="pie_submit")
	WebElementFacade submitButton;

	public void assertLocalPageTitle(){
		System.out.println("inside form page -- page");
		assertPageTitle(PAGE_TITLE);
	}

	public void filRegistrationForm(){
		firstName.sendKeys("Sandip");
		lastName.sendKeys("Bhatta");
		marriedRadioButton.click();
		readingCheckBox.click();
		Select countryDropDownSelect=new Select(countryDropDown);
		countryDropDownSelect.selectByValue("India");
		phone.sendKeys("6184130226");
		userNameTextBox.sendKeys("Sandy");
		emailTexBox.sendKeys("test@gmail.com");
		passwordTextBox.sendKeys("Joy123");
		confirmPassword.sendKeys("Joy123");
        

	}

	public void clickOnSubmit(){
		if(submitButton.isCurrentlyEnabled()){
			submitButton.submit();
		}
	}
	
	public void openUrl(){
		open();
		getDriver().manage().window().maximize();
	}

}
