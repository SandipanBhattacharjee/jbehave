package test.jbehave.pages.orangeHrm;

import org.junit.Assert;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://enterprise-demo.orangehrmlive.com/")
public class OrangeHrmLoginPage extends PageObject{
 
	@FindBy(xpath=".//div[@id='logInPanelHeading']")
    private WebElementFacade loginPanel;
	
	@FindBy(id="txtUsername")
    private WebElementFacade userNameTextField;
	
	@FindBy(id="txtPassword")
    private WebElementFacade passWordTextField;
	
	@FindBy(id="btnLogin")
    private WebElementFacade loginButtton;
	
	
	public void loginPage_FillInUserName(String userName){
		userNameTextField.sendKeys(userName);
	}
	
	public void loginPage_FillInPassword(String passWord){
		passWordTextField.sendKeys(passWord);
	}
	
	public void loginPage_ClickOnLoginButton(){
		loginButtton.click();
	}
  
	 public void loginPage_ValidateWeAreOnLoginPage(String expectedString){
		 Assert.assertTrue(expectedString.equalsIgnoreCase(loginPanel.getText()));
	 }
}
