package stepDefinitions;


import helpers.BaseTest;
import io.cucumber.plugin.event.Node;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class Hooks extends BaseTest {
    public static WebDriver driver;

    @Before()
    public void setUp(Node.Scenario scenario) throws Exception {
        System.out.println("Start Browser");
        driver = BaseTest.getDriver();
    }

    @After()
    public void tearDown(Node.Scenario scenario) throws Exception {
        System.out.println("Closing browser");
        BaseTest.closeBrowser();
    }
}
