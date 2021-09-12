package helpers;

import Locators.Locator;
import data.TestData;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseTest implements TestData  {
    public static WebDriver driver = null;
    public static int timeout = 30;
    public static int wait = 10;



    public static void CreateWebDriver() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/webdrivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(BASEURL);
        String actualTitle = driver.getTitle();
        String expectedTitle = "HepsiBurada'ya Hoşgeldiniz";
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    public static WebDriver getDriver() {
        CreateWebDriver();
        return driver;
    }

    public static void closeBrowser() {
        driver.quit();
    }
}