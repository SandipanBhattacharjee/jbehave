package test.jbehave;

import net.serenitybdd.jbehave.SerenityStories;

public class AcceptanceTestSuite extends SerenityStories {
	
	
	String path=System.getProperty("user.dir")+"//src//test//resources//chromedriver.exe";
//	// String path=System.getProperty("user.dir")+"//src//test//resources//geckodriver.exe";
//	 
	String stories="**/TooltipTest.story";
	
	public AcceptanceTestSuite(){
		setFirefoxPath();
		findStoriesCalled(stories);
	}
	

	
	public void setFirefoxPath(){
		System.setProperty("webdriver.chrome.driver",path);
	}
	
	
}
