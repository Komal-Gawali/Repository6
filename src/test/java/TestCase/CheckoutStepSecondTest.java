package TestCase;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.CartPage;
import Pages.CheckOutStepOne;
import Pages.CkeckOutSecondStep;
import Pages.InventaryPage;
import Pages.LogInPage;

public class CheckoutStepSecondTest extends TestBase {
	
	LogInPage login;
	InventaryPage inv;
	CartPage cart;
	CheckOutStepOne check;
	CkeckOutSecondStep second;
	
	@BeforeMethod
	public void secondcheckOut() throws Exception
	{
		initialization();
		Thread.sleep(300);
		login = new LogInPage();
		login.verifyLoginpage();
		Thread.sleep(300);
		inv = new InventaryPage();
		inv.verifyCartPageOpen();
		Thread.sleep(300);
		cart = new CartPage();
		cart.verifycheckOutBtnClick();
		Thread.sleep(300);
		check = new CheckOutStepOne();
		check.insertInfo();;
		Thread.sleep(300);
		second = new CkeckOutSecondStep();
	}
	
	@Test
	public void verifytitleSeconCheckOutTest() {
		     String expURL = "CHECKOUT: OVERVIEW";
		     String actURL = second.verifytitleSeconCheckOut();
		     Assert.assertEquals(expURL, actURL);
		     Reporter.log("CheckOut Title:- " + actURL);
		   }
	
	@Test
	public void verifyorderDetailsTest() {
		  second.verifyorderDetails();
		  Reporter.log(second.verifyorderDetails());
	}
	
	@Test
	public void verifyfinishBtnTest() {
		second.verifyfinishBtn();
	}
	
	@Test
	public void verifyorderCompleteTest()
	{
		 String expResult = "CHECKOUT: COMPLETE!";
		 String result = second.verifyorderComplete();
		 Assert.assertEquals(expResult, result);
		 Reporter.log("RESULT :- " + result);
	}
	
	@Test
	public void verifyOrderDoneTest() {
		   String expected = "THANK YOU FOR YOUR ORDER";
		   String statement = second.verifyOrderDone();
		   Assert.assertEquals(expected, statement);
		   Reporter.log("Status is " + statement);
	}
	
	@Test
	public void verifyaboutOrderTest() {
		 String expected = "Your order has been dispatched, and will arrive just as " +  "fast as the pony can get there!";
		 String actualAbout = second.verifyaboutOrder();
		 Assert.assertEquals(expected, actualAbout);
		 Reporter.log("Actual about info order:- " + actualAbout);
	}
	
	@Test(priority = 1, invocationCount = 2, groups = "Smoke")
	public void verifyponyExpTest() {
		 boolean result = second.verifyponyExp();
		 Assert.assertEquals(result, true);
	}
	
	@Test
	public void verifybackBtnTest() throws Exception {
         String exp = "https://www.saucedemo.com/inventory.html";
		String url = second.verifybackBtn();
		Assert.assertEquals(url, exp);
		Reporter.log(url);
	}
	
	
	@AfterMethod
	public void closeBrowser() throws Exception {
		Thread.sleep(3000);
		driver.close();
	}
	
}
