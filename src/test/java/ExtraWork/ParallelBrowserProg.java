package ExtraWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelBrowserProg {
	
	@Test
	public void browser1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser Start");
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.close();
	}
	
	@Test
	public void browser2() {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		System.out.println("Browser Start");
		driver.get("https://www.flipkart.com/");
		driver.quit();
	}
	@Test
	public void browser3() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser Start");
		driver.manage().window().maximize();
		driver.get("https://bazaar.shopclues.com/?__ar=Y");
		driver.close();
		
	}
	@Test
	public void browser4() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser Start");
		driver.manage().window().maximize();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.close();
	}
	
	
	@Test
	public void browser5() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser Start");
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		driver.close();
		
	}
	
	@Test
	public void browser6()
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	System.out.println("Browser Start");
	driver.manage().window().maximize();
	driver.get("https://www.tripodeal.com/bus/?source=bing_bus&msclkid=5d21514cc5401768e672323ff21e0d5a");
	driver.close();
	}

}
