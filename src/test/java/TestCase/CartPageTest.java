package TestCase;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.CartPage;
import Pages.InventaryPage;
import Pages.LogInPage;

public class CartPageTest extends TestBase {

	LogInPage login;
	InventaryPage intv ;
	CartPage cartP;
	
	@BeforeMethod
	public void openCartPage() throws Exception 
	{
		initialization();
		login = new LogInPage();
		login.verifyLoginpage();
		Thread.sleep(300);
		intv = new InventaryPage();
		intv.verifyCartPageOpen();
		Thread.sleep(300);
		cartP = new CartPage();
	 }
	
	@Test
	public void verifyCartPageTitletest() {
		     cartP.verifyCartPageTitle();
		     Reporter.log("Title :- " + cartP.verifyCartPageTitle());
	}
	
	@Test
	public void verifyqltlableTest() {
		       String expLable = "QTY";
		       String actLable = cartP.verifyqltlable();
		     Assert.assertEquals(expLable, actLable);
		     Reporter.log("Lable :- " + actLable);
	}
	
	@Test
	public void verifydescripLableTest() {
		
	         String expDescr = "DESCRIPTION";	
		     String actDescr = cartP.verifydescripLable();
		     Assert.assertEquals(expDescr, actDescr);
		     Reporter.log(actDescr);
	}
	
	@Test
	public void verifycontinueBtnTest() {
		     boolean actResult = cartP.verifycontinueBtn();
		     Assert.assertEquals(actResult, true);
	}
	
	@Test
	public void verifycheckOuttBtnTest() {
		   boolean actResult = cartP.verifycheckOutBtn();
		   Assert.assertEquals(actResult, true);
	}
	
	@Test
	public void verifybackpackRemovetets() {
		  boolean actResult = cartP.verifybackpackRemove();
		  Assert.assertEquals(actResult, true);
	}
	
	@Test
	public void verifybackpackremoveBtnTest() throws Exception {
		    String result = cartP.verifybackpackremoveBtn();
		  Assert.assertEquals(result, "3");
		  Reporter.log("Actual result:- " + result);
	}
	
	@Test
	public void verifycontinueBtnClickTest() {
		String expURL = "https://www.saucedemo.com/inventory.html";
		String stepURL = cartP.verifycontinueBtnClick();
		Assert.assertEquals(expURL, stepURL);
		Reporter.log("CheckOut One Step:- " + stepURL);
	}
	@Test
	public void verifycheckOutBtnClickTest() {
		    String expURL = "https://www.saucedemo.com/checkout-step-one.html";
		    String actResult = cartP.verifycheckOutBtnClick();
		    Assert.assertEquals(expURL, actResult);
		    Reporter.log("URL:- "+ actResult);
	}
	
	@Test
	public void verifyfirstNameFocusedTest() {
		cartP.verifyfirstNameFocused();
	}
	
	@Test
	public void verifylastNameFocusedTest() {
		cartP.verifylastNameFocused();
	}
	
	@Test
	public void verifypostalCodeFocusedTest() {
		cartP.verifypostalCodeFocused();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		  
		Thread.sleep(3000);
		driver.close();
	}
	
}
