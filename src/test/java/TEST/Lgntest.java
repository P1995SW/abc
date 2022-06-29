package TEST;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.mainbsr;
import POM.ZHome;
import POM.ZLogin;
import POM.zpin;
import UTILITY.param2;
import UTILITY.ss;

public class Lgntest {
	
	public Lgntest() {
		PageFactory.initElements( driver, this);
	}
	 static WebDriver driver;	
		@BeforeMethod
		public void testa() throws EncryptedDocumentException, IOException{	
		driver= mainbsr.openbsr(null);
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
		}

		@Test(priority=-8)
		public void lgwtcred_lgt_lo_sl_buy() throws EncryptedDocumentException, IOException, InterruptedException {
		
			ZHome homepg= new ZHome(driver);
			homepg.searchstock("TATASTEEL", driver);
	        homepg.matchstock();
	        homepg.buy1();
	        homepg.longterm(driver);
	        homepg.limitorder(driver);
	        homepg.stoploss(driver);
	        homepg.quantity("20");
	        homepg.clrtriggerp();
	        homepg.entertriggerp("1000");
	        homepg.submitbuy();
		}
		@Test(priority=-7)
		public void lgwtcred_lgt_mo_slm_buy() throws EncryptedDocumentException, IOException, InterruptedException {
	
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
		}
}
