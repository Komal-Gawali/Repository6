package TestCase;

import org.testng.AssertJUnit;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LogInPage;


 public class LogInPageTestCase extends TestBase {
	
	LogInPage login;
	@BeforeMethod (alwaysRun = true)
	public void startup() throws Exception {
		initialization();
		
		 login = new LogInPage();
	}
	
	@Test (enabled = true)
	public void verifySauceLabURLTest() {
		   String expURL = "https://www.saucedemo.com/";
		   String actURL = login.verifySauceLabURL();
		   AssertJUnit.assertEquals(expURL, actURL);
		   Reporter.log("Actual URL:- " + actURL);
		   }
	
	@Test (groups = "Regression")
	public void verifySauceLabTitleTest() {
		     String expTitle = "Swag Labs";
		     String actTitle = login.verifysucelabtitle();
		     AssertJUnit.assertEquals(expTitle, actTitle);
		     Reporter.log("Actual title :-" + actTitle);
	} 
		   
	@Test (groups = "Regression")
	public void verifyLoginBtnTest() {
		  boolean button = login.verifyLoginBtn();
		  AssertJUnit.assertEquals(button, true);
	}
	
	@Test
	public void verifyUsernameTextboxTest() {
		login.verifyUsernameTextbox();
	}
	
	@Test (groups = "Regression")
	public void verifyPasswordTextboxTest() {
		login.verifyPasswordTextbox();
	}
		     
		@Test
		public void verifyloginLogoTest() {
			  boolean logo = login.verifyloginLogo();
			  AssertJUnit.assertEquals(logo, false);
		}
		     
		@Test
		public void verifyUsernameDisplayedTest() throws Exception {
			     boolean actResult = login.verifyUsernameDisplayed();
			     AssertJUnit.assertEquals(actResult, true);
			    
			  Reporter.log("Result1 :- " + actResult);
		}
		
	  @Test
	  public void verifyPasswordDisplayedTest() throws Exception {
		      boolean actResult2 = login.verifyPasswordDisplayed();
              AssertJUnit.assertEquals(actResult2, false);
		  }
		     
		 @Test
		 public void verifyLoginpageTest() throws Exception {
			 String expResult = "https://www.saucedemo.com/inventory.html";
			   String actResult3 = login.verifyLoginpage();
			   AssertJUnit.assertEquals(expResult, actResult3);
			   Reporter.log("Inventory url:- " + actResult3);
			   }
		     
		@Test
		public void verifyproductLableTest() throws Exception {
			 String expResult = "PRODUCTS";
			 String actResult = login.verifyproductLable();
			 AssertJUnit.assertEquals(expResult, actResult);
			 Reporter.log("productLable :- " + actResult);
		}
		     
		@Test
		public void verifyProductLogoTest() throws Exception {
			boolean actResult = login.verifyProductLogo();
			AssertJUnit.assertEquals(actResult, true);
			
		}
		
		@Test
		public void verifysortDropDownTest() throws Exception {
			  boolean actResult = login.verifysortDropDown();
			  AssertJUnit.assertEquals(actResult, true);
		}
		
		@Test
		public void verifyshoppingCartTest() throws Exception {
			   boolean shoppingShow = login.verifyshoppingCart();
			   AssertJUnit.assertEquals(shoppingShow, true);
		}
		     
		     
	@AfterMethod (alwaysRun = true)
	public void closebrowser() throws Exception {
		
		driver.close();
	}
}