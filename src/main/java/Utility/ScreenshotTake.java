package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import Base.TestBase;

public class ScreenshotTake extends TestBase {
	
public static void takeScreenshot1() throws Exception {
	  
	        File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        File dest = new File("C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\MavenProject1\\Screenshot\\p1.jpeg");
	      FileHandler.copy(source, dest);

    }

     public static void takeScreenshot() throws Exception {

      File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      File dest = new File("C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\MavenProject1\\Screenshot\\p2.jpeg");
      FileHandler.copy(source, dest);	
     }
     
     public static void captureScreenshot(String name) throws Exception {
    	   File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	   File dest = new File("C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\MavenProject1\\Screenshot\\"+name+".jpeg");
    	   FileHandler.copy(source, dest);
    	   
     }

}
