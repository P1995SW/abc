package TEST;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.apache.poi.EncryptedDocumentException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.TestNGException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Report;

import POJO.mainbsr;
import POM.ZFgt;
import POM.ZHome;
import POM.ZLogin;
import POM.ZSignUp;
import POM.zpin;
import UTILITY.Reports;
import UTILITY.param2;
import UTILITY.ss;


@Listeners(TestListeners.class)

public class FTest {
    WebDriver driver;	
    ExtentReports reports;
    ExtentTest test;
    
    
    @BeforeTest
    public void extentReport() {
    	reports = Reports.createReport();
    }
  
	@BeforeMethod
	public void testa() throws EncryptedDocumentException, IOException{	
	driver= mainbsr.openbsr(null);
	ZLogin lgnpg = new ZLogin(driver);
	
	String text= lgnpg.getErrorText();

    String expectedText = "UserId should be minimum 6 ";
	
	Assert.assertEquals( text, expectedText);
//	SoftAssert sa= new SoftAssert();
//	sa.assertEquals(text, expectedText);
	String username = param2.getData(0, 2);
	String pw= param2.getData(1, 2);
	lgnpg.enteruserid(username);
	lgnpg.pw(pw);
	lgnpg.loginclick();
	zpin pn = new zpin(driver);
	String pin= param2.getData(2, 1);
	pn.enterPin(pin, driver);
	pn.clkcont();

	} 
	
	
	@Test(priority=-1)
	public void lgwtcred_lgt_lo_sl_buy() throws EncryptedDocumentException, IOException, InterruptedException {
	    test = reports.createTest("lgwtcred_lgt_lo_sl_buy");
		ZHome homepg= new ZHome(driver);
		homepg.searchstock("IDEA", driver);
        homepg.matchstock();
        
       
        homepg.buy1();
        homepg.longterm(driver);
        homepg.limitorder(driver);
        homepg.stoploss(driver);
        homepg.quantity("20");
        homepg.clrtriggerp();
        homepg.entertriggerp("1000");
        String b = "Buyy";
        String tb=  homepg.buy1click();
        Assert.assertEquals( tb, b);
        homepg.submitbuy();
//      ss.ss(driver, ".jpeg");
	}
	@Test(priority=-1)
	public void lgwtcred_lgt_mo_slm_buy() throws EncryptedDocumentException, IOException, InterruptedException {
		test = reports.createTest("lgwtcred_lgt_mo_slm_buy");
		ZHome homepg= new ZHome(driver);
		homepg.searchstock("TATASTEEL", driver);
        homepg.matchstock();
        homepg.buy1();  
        homepg.longterm(driver);
        homepg.marketorder(driver);
        homepg.slmkt(driver);
        homepg.quantity("20");
        homepg.clrtriggerp();
        homepg.entertriggerp("1000");
        homepg.submitbuy();
        ss.ss(driver, "ss2.jpeg");
	}
	@Test(priority=-1)
	public void lgwtcred_itr_mo_slm_buy() throws EncryptedDocumentException, IOException, InterruptedException {
	
		ZHome homepg= new ZHome(driver);
		homepg.searchstock("TATASTEEL", driver);
        homepg.matchstock();
        homepg.buy1();
        homepg.intraday(driver);
        homepg.marketorder(driver);
        homepg.slmkt(driver);
        homepg.quantity("20");
        homepg.clrtriggerp();
        homepg.entertriggerp("1000");
        homepg.submitbuy();
        ss.ss(driver, "ss3.jpeg");

	}
	@Test(priority=-1)
	public void lgwtcred_itr_lo_sl_buy() throws EncryptedDocumentException, IOException, InterruptedException {
	
		ZHome homepg= new ZHome(driver);
		homepg.searchstock("TATASTEEL", driver);
        homepg.matchstock();
        homepg.buy1();
        homepg.intraday(driver);
        homepg.limitorder(driver);
        homepg.stoploss(driver);
        homepg.quantity("20");
        homepg.clrtriggerp();
        homepg.entertriggerp("1000");
        homepg.submitbuy();
        ss.ss(driver, "ss4.jpeg");
	}
	@Test(priority=-1)
	public void lgwtcred_itr_lo_sl_sell() throws EncryptedDocumentException, IOException, InterruptedException {
	
		ZHome homepg= new ZHome(driver);
		homepg.searchstock("TATASTEEL", driver);
        homepg.matchstock();
        homepg.sell();
        homepg.intraday(driver);
        homepg.limitorder(driver);
        homepg.stoploss(driver);
        homepg.quantity("20");
        homepg.clrtriggerp();
        homepg.entertriggerp("1100");
        homepg.submitbuy();
	}
	@Test(priority=-1)
	public void lgwtcred_itr_mo_slm_sell() throws EncryptedDocumentException, IOException, InterruptedException {
	
		ZHome homepg= new ZHome(driver);
		homepg.searchstock("TATASTEEL", driver);
        homepg.matchstock();
        homepg.sell();
        homepg.intraday(driver);
        homepg.marketorder(driver);
        homepg.slmkt(driver);
        homepg.quantity("20");
        homepg.clrtriggerp();
        homepg.entertriggerp("1100");
        homepg.submitbuy();
	}
	@Test(priority=-1)
	public void lgwtcred_lgt_lo_sl_sell() throws EncryptedDocumentException, IOException, InterruptedException {
	
		ZHome homepg= new ZHome(driver);
		homepg.searchstock("TATASTEEL", driver);
        homepg.matchstock();
        homepg.sell(); 
        homepg.longterm(driver);
        homepg.limitorder(driver);
        homepg.stoploss(driver);
        homepg.quantity("20");
        homepg.clrtriggerp();
        homepg.entertriggerp("1000");
        homepg.submitbuy();
	}
	@Test(priority=-1)
	public void lgwtcred_lgt_mo_sl_sell() throws EncryptedDocumentException, IOException, InterruptedException {
	
		ZHome homepg= new ZHome(driver);
		homepg.searchstock("TATASTEEL", driver);
        homepg.matchstock();
        homepg.sell(); 
        homepg.longterm(driver);
        homepg.marketorder(driver);
        homepg.slmkt(driver);
        homepg.quantity("20");
        homepg.clrtriggerp();
        homepg.entertriggerp("1000");
        homepg.submitbuy();
	}
	@Test(priority=1)
	public void lgwtcred_lgt_lo_sl_TK() throws EncryptedDocumentException, IOException, InterruptedException {
	
		ZHome homepg= new ZHome(driver);
		homepg.searchstock("TATASTEEL", driver);
        homepg.matchstock();
        homepg.buy1();
        homepg.switch_buy_sell();
        homepg.longterm(driver);
        homepg.limitorder(driver);
        homepg.stoploss(driver);
        homepg.quantity("20");
        homepg.clrtriggerp();
      
        homepg.entertriggerp("1000");
        homepg.submitbuy();
	}
	@Test(priority=1)
	public void lgwtcred_lgt_lo_sl_cncl() throws EncryptedDocumentException, IOException, InterruptedException {
	
		ZHome homepg= new ZHome(driver);
		homepg.searchstock("TATASTEEL", driver);
        homepg.matchstock();
        homepg.buy1();
        homepg.switch_buy_sell();
        homepg.longterm(driver);
        homepg.limitorder(driver);
        homepg.stoploss(driver);
        homepg.quantity("20");
        homepg.clrtriggerp();
      
        homepg.entertriggerp("1000");
        homepg.submitcancle();
	}
	@Test(priority=1)
	public void lgwtcred_lgt_chart() throws EncryptedDocumentException, IOException, InterruptedException {
	
		ZHome homepg= new ZHome(driver);
		homepg.searchstock("TATASTEEL", driver);
        homepg.matchstock();
        homepg.clickchart();
      FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
    	wait.withTimeout(Duration.ofMillis(5000));
    	wait.pollingEvery(Duration.ofMillis(500));
    	wait.ignoring(Exception.class);    	
    	wait.until(ExpectedConditions.visibilityOf((WebElement) By.xpath("(//span[@class='icon-beK_KS0k-'])[2]")));
        
        homepg.clickcompare();
        

	}
	@Test
	public void frgt_usrid() {
		ZLogin fgt = new ZLogin(driver);
		fgt.forgot();
		ZFgt frgt=new ZFgt(driver);
		frgt.remuserid();
		frgt.enteruserid("velocity");
		frgt.enterpan("AFGTR4215M");
		frgt.mail();
		frgt.enteremail("velocity@vmail.com");
		frgt.refcap();
		frgt.clickreset();
	}
	@Test
	public void frgt_wo_usrid() {
		ZLogin fgt = new ZLogin(driver);
		fgt.forgot();
		ZFgt frgt=new ZFgt(driver);
		frgt.fgtuserid();
		frgt.enterpan("AFGTR4215M");
		frgt.mail();
		frgt.enteremail("abcd@xyz.com");
		frgt.refcap();
		frgt.clickreset();
		
	}
	@Test
	public void signup_withmob() {
		ZLogin sign = new ZLogin(driver);
		sign.sign();	
		ZSignUp sgnup =new ZSignUp(driver);
		sgnup.entermob("9078785595", driver);
	}
	@Test
	public void signup_createnri_acc() {
		ZLogin sign = new ZLogin(driver);
		sign.sign();	
		ZSignUp sgnup =new ZSignUp(driver);
		sgnup.accnir(driver);
	}
	
	@Test(priority=2)
	public void orders() throws EncryptedDocumentException, IOException {
		ZLogin lgnpg = new ZLogin(driver);
		String username = param2.getData(0, 2);
		String pw= param2.getData(1, 2);
		lgnpg.enteruserid(username);
		lgnpg.pw(pw);
		lgnpg.loginclick();
		zpin pn = new zpin(driver);
		String pin= param2.getData(2, 1);
		pn.enterPin(pin, driver);
		pn.clkcont();
		ZHome homepg= new ZHome(driver);
		homepg.clickonorders();	
	}
	@Test(priority=2)
	public void dashboard() throws EncryptedDocumentException, IOException {
		ZLogin lgnpg = new ZLogin(driver);
		String username = param2.getData(0, 2);
		String pw= param2.getData(1, 2);
		lgnpg.enteruserid(username);
		lgnpg.pw(pw);
		lgnpg.loginclick();
		zpin pn = new zpin(driver);
		String pin= param2.getData(2, 1);
		pn.enterPin(pin, driver);
		pn.clkcont();
		ZHome homepg= new ZHome(driver);
		homepg.clickondashboard();	
	}
	@Test(priority=2)
	public void positions() throws EncryptedDocumentException, IOException {
		ZLogin lgnpg = new ZLogin(driver);
		String username = param2.getData(0, 2);
		String pw= param2.getData(1, 2);
		lgnpg.enteruserid(username);
		lgnpg.pw(pw);
		lgnpg.loginclick();
		zpin pn = new zpin(driver);
		String pin= param2.getData(2, 1);
		pn.enterPin(pin, driver);
		pn.clkcont();
		ZHome homepg= new ZHome(driver);
		homepg.clickonPositions();
	}
	@Test(priority=2)
	public void holdings() throws EncryptedDocumentException, IOException {
		ZLogin lgnpg = new ZLogin(driver);
		String username = param2.getData(0, 2);
		String pw= param2.getData(1, 2);
		lgnpg.enteruserid(username);
		lgnpg.pw(pw);
		lgnpg.loginclick();
		zpin pn = new zpin(driver);
		String pin= param2.getData(2, 1);
		pn.enterPin(pin, driver);
		pn.clkcont();
		ZHome homepg= new ZHome(driver);
		homepg.clickonHoldings();
	}
	@Test(priority=2)
	public void funds() throws EncryptedDocumentException, IOException {
		ZLogin lgnpg = new ZLogin(driver);
		String username = param2.getData(0, 2);
		String pw= param2.getData(1, 2);
		lgnpg.enteruserid(username);
		lgnpg.pw(pw);
		lgnpg.loginclick();
		zpin pn = new zpin(driver);
		String pin= param2.getData(2, 1);
		pn.enterPin(pin, driver);
		pn.clkcont();
		ZHome homepg= new ZHome(driver);
		homepg.clickonfunds();
	}
	
	@AfterMethod
	public void createresult(ITestResult result) {
		if(result.getStatus()==ITestResult.FAILURE) {
			test.log(Status.FAIL, result.getName());
		}
		else if(result.getStatus()==ITestResult.SUCCESS){
			test.log(Status.PASS, result.getName());
		}
		else {
			test.log(Status.SKIP, result.getName());
		}
	}
	@AfterTest
	public void flushResult() {
		reports.flush();
	}

	
	
	
	
}
