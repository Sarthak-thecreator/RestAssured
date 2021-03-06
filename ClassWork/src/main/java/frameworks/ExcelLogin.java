package frameworks;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelLogin {

	public static void main(String[] args) throws IOException, InterruptedException,NullPointerException {

		FileInputStream fil = new FileInputStream(new File("E:\\ExcelLogin.xlsx"));

		XSSFWorkbook workbook = new XSSFWorkbook(fil);

		XSSFSheet sheet = workbook.getSheet("data"); // Sheet1 this is sheet name which is at bottom of excell sheet

		int count = sheet.getLastRowNum();

		System.out.println(count);

		for (int i = 1; i <= count; i++) {

			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();

			XSSFRow row = sheet.getRow(i);

			XSSFCell cell = row.getCell(0);

			String un = cell.getStringCellValue();

			XSSFCell cell1 = row.getCell(1);

			String pwd = cell1.getStringCellValue();

			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			driver.get("https://opensource-demo.orangehrmlive.com/");

			driver.findElement(By.id("txtUsername")).sendKeys(un);
			driver.findElement(By.id("txtPassword")).sendKeys(pwd);
			driver.findElement(By.id("btnLogin")).click();
			
			
			
			 String URL  =  driver.getCurrentUrl();
            
            XSSFCell cell2 = sheet.getRow(i).createCell(2);
            
           
          
            System.out.println(URL);
            
            if (URL.contains("validateCredentials")) {
                
                cell2.setCellValue("FAIL");
              
             
            } else {
                
                cell2.setCellValue("PASS");
                
            }
            
            driver.close();
          
		}
		
            FileOutputStream outputStream = new FileOutputStream("E:\\ExcelLogin.xlsx");
            workbook.write(outputStream);
			
          
			
			

		

	}

}
