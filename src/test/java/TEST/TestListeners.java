package TEST;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;


import UTILITY.ss;

public class TestListeners extends BaseTest implements ITestListener{

	
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName()+"Test has started");
	}
	
	public void onTestFailure(WebDriver driver, ITestResult result) {
		try {
			ss.ss(driver, result.getName());
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public void onTestSuccess(WebDriver driver,ITestResult result) {
		System.out.println(result.getName()+" Test Succsess");
		try {
			ss.ss(driver, result.getName());
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
	}
	
	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName()+" Test Skipped");
	}
	
	
}
