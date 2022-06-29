package POM;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZSignUp {

	@FindBy(xpath = "//input[@type='text']")private WebElement mobileno;
	@FindBy(xpath = "//button[@type='submit']")private WebElement contunue;
	@FindBy(xpath = "//a[@href='/open-account/nri']")private WebElement nriacc;
	
	
	 
	public ZSignUp(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	
	
	public void entermob(String mobnum, WebDriver driver) {
		Set<String>addresses= driver.getWindowHandles();
		Iterator<String> i =addresses.iterator();
		System.out.println(i.next());
		while(i.hasNext()) {
		String signuppg = i.next();
		driver.switchTo().window(signuppg);
		mobileno.sendKeys(mobnum);
		contunue.click();
	}
	}
	

	public void accnir( WebDriver driver) {
		Set<String>addresses= driver.getWindowHandles();
		Iterator<String> i =addresses.iterator();
		System.out.println(i.next());
		while(i.hasNext()) {
		String newnri = i.next();
		driver.switchTo().window(newnri);
	
	nriacc.click();
		}
	}
}
