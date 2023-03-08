package Utility;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Base.TestBase;

public class UtilityOfSelectClass extends TestBase{

//	public static void useSelectClass(WebElement element, String str) {
//		Select s = new Select(element);
//		s.selectByVisibleText(str);
//	}
	public	static	void	selectClass(WebElement ele, String str)
	{
	   Actions act = new Actions(driver);
	    act.moveToElement(ele).build().perform();
	    act.sendKeys(Keys.ARROW_DOWN).click(ele).build().perform();
	    act.sendKeys(Keys.ENTER).build().perform();
	}
	
	
}
