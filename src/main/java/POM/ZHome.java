package POM;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class ZHome {
	
	//related to search field
	@FindBy(xpath="//input[@icon='search']") private WebElement search;
	@FindBy(xpath="//label[@class='su-switch-control']") private WebElement toggle;
	@FindBy(xpath="(//button[@class='button-blue buy'])[1]") private WebElement buy;
	@FindBy(xpath="//button[@class='button-orange sell']") private WebElement sell;//span[@class='icon icon-trending-up']
	@FindBy(xpath="//span[@class='icon icon-trending-up']") private WebElement chart;
	@FindBy(xpath="//span[@class='icon icon-trash']") private WebElement delete;
	@FindBy(xpath="//span[@class='icon icon-ellipsis']") private WebElement more;//div[text()='Compare']
	
	//related to options
	@FindBy(xpath="//span[text()='Orders']") private WebElement orders;
	@FindBy(xpath="//span[text()='Dashboard']") private WebElement dashboard;//span[text()='Holdings']
	@FindBy(xpath="//span[text()='Holdings']") private WebElement holdings;
	@FindBy(xpath="//span[text()='Funds']") private WebElement funds;
	@FindBy(xpath="//span[text()='Apps']") private WebElement apps;
	@FindBy(xpath="//span[text()='Positions']") private WebElement Positions;
	
	
	//related to buy/sell field
    @FindBy(xpath="//label[text()='Intraday ']") private WebElement intraday;
    @FindBy(xpath="//label[text()='Longterm ']") private WebElement longterm;
    @FindBy(xpath="//label[text()='Market']") private WebElement mo;
    @FindBy(xpath="//label[text()='Limit']") private WebElement lo;
    @FindBy(xpath="//label[text()='SL']") private WebElement sl;
    @FindBy(xpath="//label[text()='SL-M']") private WebElement slm;
    @FindBy(xpath="(//span[@class='icon-beK_KS0k-'])[2]")private WebElement compare;
    
    @FindBy(xpath="//img[@alt='Kite logo']") private WebElement kitelogo;
    
    @FindBy(xpath="//input[@label='Qty.']") private WebElement Qty;
    @FindBy(xpath="//input[@label='Price']") private WebElement Price;//input[@label='Trigger price']
    @FindBy(xpath="//input[@label='Trigger price']") private WebElement TrgPrice;//span[@data-balloon='Toggle Buy / Sell']
    
    @FindBy(xpath="(//span[@class='tradingsymbol'])[1]") private WebElement searchedStock;
  //button[@type='submit']
    @FindBy(xpath="//button[@type='submit']") private WebElement subbuy;
    @FindBy(xpath="//button[@class='button-outline cancel']") private WebElement subcancle;

    public ZHome(WebDriver driver) {
    	PageFactory.initElements(driver, this);
    }
    public void searchstock(String stocks, WebDriver driver) {
//    FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
//	wait.withTimeout(Duration.ofMillis(5000));
//	wait.pollingEvery(Duration.ofMillis(500));
//	wait.ignoring(Exception.class);    	
//	wait.until(ExpectedConditions.visibilityOf(search));
  
    	search.sendKeys(stocks);
    	
    }
    public void matchstock() {
    	searchedStock.click();
    }
    public void clickchart() {
    	chart.click();
    }
    public void switch_buy_sell() {
    	toggle.click();
    }
    public String buy1click() {
		
	String buyclick =	subbuy.getText();
		return buyclick;
		
	}
    public void buy1() {
    	buy.click();
    }
    public void sell() {
    	sell.click();
    }
    public void clickcompare() {

    	compare.click();
    }
    public void intraday(WebDriver driver) {
//    	FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
//		wait.withTimeout(Duration.ofMillis(10000));
//		wait.pollingEvery(Duration.ofMillis(500));
//		wait.ignoring(Exception.class);
//		wait.until(ExpectedConditions.visibilityOf(longterm));
    	intraday.click();
    } 
    public void longterm(WebDriver driver) {
    	longterm.click();
    }
    public void marketorder(WebDriver driver) {
    	mo.click();
    }
    public void limitorder(WebDriver driver) {
    	lo.click();
    }
    public void stoploss(WebDriver driver) {
    	sl.click();
    }
    public void slmkt(WebDriver driver) {
    	slm.click();
    }
    public void quantity(String q) {
    	Qty.sendKeys(q);
    }
    public void clrtriggerp() {
    	TrgPrice.clear();
    	TrgPrice.clear();
    	TrgPrice.clear();
    }
    public void entertriggerp(String Tp) {
    	TrgPrice.sendKeys(Tp);
    }
    public void submitcancle() {
    	subcancle.click();
    }
   
    public void submitbuy() {
    	subbuy.click();
    }
    public void clickonorders() {
    	orders.click();
    }
    public void clickondashboard() {
    	dashboard.click();
    }
    public void clickonHoldings() {
    	holdings.click();
    }
    public void clickonfunds() {
      funds.click();
    }
    public void clickonPositions() {
    	Positions.click();
    }
    public void clickonApp() {
    	apps.click();
    }
    
    
    
    
}

