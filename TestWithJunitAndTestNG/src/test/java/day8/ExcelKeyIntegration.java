package day8;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class ExcelKeyIntegration {
	WebDriver driver;
	@Test(dataProvider = "dp")
	public void f(String excelkey,String locator, String locatorV, String data) {
		KeyWords key = new KeyWords(driver);
		if(excelkey.equals("getURL"))
			key.getUrl(data);
		else if(excelkey.equals("selectFromDropDown"))
			key.selectFromDropDown(locator, locatorV, data);
		else if(excelkey.equals("click"))
			key.click(locator, locatorV);
		else if(excelkey.equals("getSnap"))
			key.getSnap(data);
		else
			System.out.println("Invalid key");
			
	}
	@BeforeTest
	public void beforeMethod() {

		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@AfterTest
	public void afterMethod() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

	// Internal ExcelSheet used for Data Driven Testing
	@DataProvider
	public Object[][] dp() throws Exception{
		int row = 6;
		int col = 4;
		Object data[][] = new Object[row][col];
		XSSFWorkbook wb = new XSSFWorkbook(new FileInputStream("E:\\Book1.xlsx"));
		XSSFSheet sh = wb.getSheet("Sheet1");// Sheet
		// Copying data from excel sheet and keeping inside a 2-d array
		for (int i = 0; i < row; i++) {
			data[i][0] = sh.getRow(i + 1).getCell(0).toString();
			data[i][1] = sh.getRow(i + 1).getCell(1).toString();
			data[i][2] = sh.getRow(i + 1).getCell(2).toString();
			data[i][3] = sh.getRow(i + 1).getCell(3).toString();

		}
		return data;
	}
}
