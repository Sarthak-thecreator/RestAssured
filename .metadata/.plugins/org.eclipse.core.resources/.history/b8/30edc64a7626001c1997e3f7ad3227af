package day8;
import org.testng.annotations.Test;

import day7.DashBoardPage;
import day7.LoginPage;

import org.testng.annotations.BeforeTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class DBExample {
	WebDriver driver;

  @Test
  public void dbConnect() throws ClassNotFoundException, SQLException{
	  Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","LTI","Newuser123");
	  System.out.println("Database:");
	  String str1="select * from TSL962";
	  Statement st1=con.createStatement();
	  ResultSet rs= st1.executeQuery(str1);
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  System.out.println("username  Password");
	  
	  while(rs.next()) {
			String user=rs.getString(1);
			String pwd=rs.getString(2);
			System.out.println(user+" "+pwd);
			new LoginPage(driver).doLogin(user, pwd);
			if(driver.getCurrentUrl().contains("dashboard")) {
				new DashBoardPage(driver).doLogout();
				System.out.println("Login Done");
			}else
			{
				System.out.println("Login Fialed");
			}
		}
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() throws Exception{
	  Thread.sleep(2000);
	  driver.quit();
  }
}