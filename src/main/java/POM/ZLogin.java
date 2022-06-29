package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class ZLogin {

	@FindBy(xpath="//input[@type='text']") private WebElement userid;
	@FindBy(xpath="//input[@type='password']")private WebElement password;
	@FindBy(xpath ="//button[@class='button-orange wide']")	private WebElement login;	
	@FindBy(xpath ="//a[@href='/forgot']")	private WebElement forgotpw;
	@FindBy(xpath ="//a[@class='text-light']")	private WebElement signup;

	
	
	
	public ZLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public static String getErrorText() {
		String errorText= " Error Text ";
		System.out.println(errorText);
		return errorText;
	}
	
	
	public void enteruserid(String user) {
		userid.sendKeys(user);
	}
	public void pw(String Password) {
		password.sendKeys(Password);
	}
	public void loginclick() {
		login.click();
	}
	public void forgot() {
	  forgotpw.click();
	}
	public void sign() {
		signup.click();
	}
	
}
