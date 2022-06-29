package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZFgt {
	
	@FindBy(xpath = "//label[text()='I remember my user ID']")private WebElement remuserid;//dataMembers
	@FindBy(xpath = "//label[text()='I forgot my user ID']")private WebElement fgtuserid;
	@FindBy(xpath = "(//input[@type='text'])[1]")private WebElement userid;
	@FindBy(xpath = "//input[@placeholder='PAN']")private WebElement pan;
	@FindBy(xpath = "//label[text()='E-mail']")private WebElement rcvemail;
	@FindBy(xpath = "//label[text()='SMS']")private WebElement rcvsms;
	@FindBy(xpath = "//input[@placeholder='E-mail (as on account)']")private WebElement email;
	@FindBy(xpath = "//input[@placeholder='Captcha']")private WebElement captcha;
	@FindBy(xpath = "//span[@class='icon icon-reload']")private WebElement relcap;
	@FindBy(xpath = "//button[@type='submit']")private WebElement reset;
	@FindBy(xpath = "//a[@class='text-xsmall text-light reset-account-button']")private WebElement back;

	public ZFgt(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	

	public void remuserid() {
		remuserid.click();
	}

	public void fgtuserid() {
		fgtuserid.click();
	}

	public void enteruserid(String name) {
		userid.sendKeys(name);
	}

	public void enterpan(String pannum) {
		pan.sendKeys(pannum);
	}
	
	public void mail() {
		rcvemail.click();
	}

	public void sms() {
		rcvsms.click();
	}

	public void enteremail(String mailid) {
		email.sendKeys(mailid);
	}
	
	public void entercaptcha(String rcaptcha) {
		captcha.sendKeys(rcaptcha);
	}
	
	public void refcap() {
		relcap.click();
	}

	public void clickreset() {
		reset.click();
	}

	public void backtolgn() {
		back.click();
	}

	
	
	
	
}

