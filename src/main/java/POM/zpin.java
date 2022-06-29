package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class zpin {
	
	
	@FindBy(xpath="//input[@id='pin']")private WebElement pin;//input[@label='PIN']
	@FindBy(xpath = "//button[@class='button-orange wide']")private WebElement contunue;
	@FindBy(xpath = "//input[text()='Forgot 2FA?']")private WebElement forgot;
	@FindBy(xpath = "//a[text()=\"Don't have an account? Signup now!\"]")private WebElement signup;
	
	public zpin(WebDriver driver) {
		PageFactory.initElements( driver, this );
	}
	public void enterPin(String pinNumber, WebDriver driver) {
//		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
//		wait.withTimeout(Duration.ofMillis(10000));
//		wait.pollingEvery(Duration.ofMillis(500));
//		wait.ignoring(Exception.class);
//		wait.until(ExpectedConditions.visibilityOf(pin));	
		pin.sendKeys(pinNumber);
	}
	public void clkcont() {
		contunue.click();
	}
	public void clkforget() {
		forgot.click();
	}
	public void clkSignup() {
		signup.click();
	}

}
