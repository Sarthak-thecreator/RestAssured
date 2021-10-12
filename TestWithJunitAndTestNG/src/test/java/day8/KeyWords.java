package day8;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import java.io.File;
import org.openqa.selenium.support.ui.Select;
public class KeyWords {
    WebDriver driver;
 
    public KeyWords(WebDriver driver) {
        this.driver = driver;
    }
 
    public void getUrl(String url) {
        driver.get(url);
    }
 
    public void click(String locatorType, String locatorValue) {
        getElement(locatorType, locatorValue).click();
    }
 
    public void type(String locatorType, String locatorValue, String data) {
        getElement(locatorType, locatorValue).sendKeys(data);
    }
 
    public void selectFromDropDown(String locatorType, String locatorValue, String data) {
        Select sc = new Select(getElement(locatorType, locatorValue));
        sc.selectByVisibleText(data);
    }
 
    public WebElement getElement(String locatorType, String locatorValue) {
        WebElement E = null;
        if (locatorType.equals("id"))
            E = driver.findElement(By.id(locatorValue));
        else if (locatorType.equals("name"))
            E = driver.findElement(By.name(locatorValue));
        else if (locatorType.equals("css"))
            E = driver.findElement(By.cssSelector(locatorValue));
        else if (locatorType.equals("link"))
            E = driver.findElement(By.linkText(locatorValue));
        else if (locatorType.equals("xpath"))
            E = driver.findElement(By.xpath(locatorValue));
        else
            System.out.println("Invalid Locator");
        return E;
    }
 
    public void getSnap(String locationWithFileName) {
        TakesScreenshot tc = (TakesScreenshot) driver;
        File src = tc.getScreenshotAs(OutputType.FILE);
        try {
            FileHandler.copy(src, new File(locationWithFileName + ".png"));
        } catch (Exception E) {
            System.out.println("Error with taking ScreenShot");
        }
    }
}
