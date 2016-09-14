package test.jbehave;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

import net.serenitybdd.jbehave.SerenityStories;

public class AcceptanceTestSuite extends SerenityStories {
	
	
	String path=System.getProperty("user.dir")+"//src//test//resources//chromedriver.exe";
//	// String path=System.getProperty("user.dir")+"//src//test//resources//geckodriver.exe";
//	 
	//String stories="**/homeflow.story";
	
	String stories="homeflow.story";
	String testSuitePath=System.getProperty("user.dir")+"//src//test//resources//stories//testSuites//"+System.getProperty("test.suite.path");
	
	public AcceptanceTestSuite(){
		setFirefoxPath();
		findStoriesCalled(parseTestSuiteFile_ReturnStoryNames());
	}
	

	
	public void setFirefoxPath(){
		System.setProperty("webdriver.chrome.driver",path);
	}
	
	private String parseTestSuiteFile_ReturnStoryNames(){ 	
	List<String> lines=new ArrayList<String>();
	String storyNames="";
		try{
		lines=FileUtils.readLines(new File(testSuitePath));
		int sizeOfStory=lines.size();
		if(sizeOfStory==1){
			storyNames=lines.get(0);
		}if(sizeOfStory>1){
			for(int i=0;i<sizeOfStory;i++){
				if(i==sizeOfStory){
					storyNames=storyNames+lines.get(i);
				}
				storyNames=storyNames+lines.get(i)+";";
			}
		}
		
		}catch(IOException exception){
			System.out.println("File not found");
		}
		return storyNames;
	}
	
}
