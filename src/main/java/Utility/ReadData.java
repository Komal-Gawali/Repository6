package Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData {
	
	public static String readPropertyFile(String value) throws Exception {
		
		Properties p = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\MavenProject1\\testData\\config.properties");
	     p.load(file);
	      return p.getProperty(value);
	  }
      
	public static String readPropertyFile2(int row, int cell) throws  Exception {
		FileInputStream file = new FileInputStream("C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\MavenProject1\\testData\\Book2.xlsx");
		Sheet excel = WorkbookFactory.create(file).getSheet("Sheet1");
		String value = excel.getRow(row).getCell(cell).getStringCellValue();
		return value;
		
	}



}
