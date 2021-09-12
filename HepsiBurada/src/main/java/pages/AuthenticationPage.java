package pages;

import helpers.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import static data.TestData.BASEURL;

public class AuthenticationPage extends BaseTest {

    public AuthenticationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "//a[@href='https://www.hepsiburada.com/uyelik/giris?ReturnUrl=https%3A%2F%2Fwww.hepsiburada.com%2F']")
    private WebElement signInLink;

    @FindBy(how = How.ID, using = "txtUserName")
    private WebElement emailBox;

    @FindBy(how = How.ID, using = "txtPassword")
    private WebElement passwordBox;

    @FindBy(how = How.ID, using = "btnLogin")
    private WebElement loginButton;


    @FindBy(how = How.XPATH, using = "//div[@id='myAccount']//child::a[@title='Hesabım']//child::text()[contains(.,'qquestion answerr')]")
    private WebElement accountNameField;

    private String expectedAccountName ="qquestion answerr";


    public void LoginPage() {
        signInLink.click();
    };
    public void SendEmail(String email) {
        emailBox.sendKeys(email);
    };
    public void SendPassword(String password) {
        passwordBox.sendKeys(password);
    };
    public void Loginbutton() {
        loginButton.click();
    };

    public void loginProcessControl() {
        String actualTitle = driver.findElement((By) accountNameField).getText();;

        Assert.assertEquals(expectedAccountName, actualTitle);
    }




}