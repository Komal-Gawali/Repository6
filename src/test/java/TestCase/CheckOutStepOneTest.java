package TestCase;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.CartPage;
import Pages.CheckOutStepOne;
import Pages.InventaryPage;
import Pages.LogInPage;

public class CheckOutStepOneTest extends TestBase  {

	LogInPage login;
	InventaryPage inv;
	CartPage cart;
	CheckOutStepOne checkOut;
	
	@BeforeMethod
	public void infoPage() throws Exception
	{
		initialization();
		login = new LogInPage();
		login.verifyLoginpage();
		Thread.sleep(300);
		inv = new InventaryPage();
		inv.verifyCartPageOpen();
		Thread.sleep(300);
		cart = new CartPage();
		cart.verifycheckOutBtnClick();
		Thread.sleep(300);
		checkOut = new CheckOutStepOne();
	}
	
	@Test
	public void  verifyURLTest() {
		   String expURL = "https://www.saucedemo.com/checkout-step-one.html";
		   String actURL = checkOut.verifyURL();
		   Assert.assertEquals(expURL, actURL);
		   Reporter.log("CheckOut url :-" + actURL);
	}
	@Test (groups = "Smoke")
	public void verifycheckoutTitleTest() {
	    	String expTitle = "CHECKOUT: YOUR INFORMATION";
		  String actTitle = checkOut.verifycheckoutTitle();
		  Assert.assertEquals(expTitle, actTitle);
		  Reporter.log(actTitle);
	}
	@Test (groups = "sanity")
	public void verifycancelBtnTest() {
		   boolean actResult = checkOut.verifycancelBtn();
		   Assert.assertEquals(actResult, true);
	}
	
	@Test (groups = "Smoke")
	public void verifycancelBtnClickTest() {
		   String actResult = checkOut.verifycancelBtnClick();
		   Assert.assertEquals(actResult, "https://www.saucedemo.com/cart.html");
		   Reporter.log ("Current Url:- " + actResult);
		 }
	
	@Test
	public void verifyfirstNameDataTest() throws Exception {
		   checkOut.verifyfirstNameData();
//		   Reporter.log(checkOut.verifyfirstNameData());
	}
	
	@Test
	public void verifylastNameDataTest() throws Exception {
		checkOut.verifylastNameData();
	}
	
	@Test
	public void verifyPostalCodeTest() throws Exception {
		checkOut.verifyPostalCode();
	}
	
	@Test
	public void verifyContinueBtnTest() {
		boolean actBtn = checkOut.verifyContinueBtn();
		Assert.assertEquals(actBtn, true);
	}
	
	@Test
	public void insertInfotest() throws Exception {
		   checkOut.insertInfo();
		
	}
	
	
	@Test
	public void verifyCheckoutBtnTest() throws Exception {
		  String exp = "https://www.saucedemo.com/checkout-step-two.html";
		  String url = checkOut.verifyCheckoutBtn();
		  Assert.assertEquals(exp, url);
		  Reporter.log(url);
		  
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@AfterMethod
	public void closebrowser() throws Exception {
		Thread.sleep(3000);
		driver.close();
	}
	
}
