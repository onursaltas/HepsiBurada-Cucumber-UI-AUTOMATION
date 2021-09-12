package stepDefinitions;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.BaseTest;
import pages.AuthenticationPage;
import pages.ProductProcessPage;


import static data.TestData.*;

public class Test_Study_Case_1 extends BaseTest {
    AuthenticationPage authenticationPage;
    ProductProcessPage productProcessPage;


    @Given("^Hepsiburada login sayfasına gidilir.$")
    public void sıgnInPage() throws Throwable {
        authenticationPage = new AuthenticationPage(driver);
        authenticationPage.LoginPage();
    }

    @And("^Eposta Adresi alanına email bilgisi girilir.$")
    public void signInEmail() throws Throwable {
        authenticationPage = new AuthenticationPage(driver);
        authenticationPage.SendEmail(EXISTING_USER);
    }
    @And("^Password alanına password girilir.$")
    public void sıgnInPassword() throws Throwable {
        authenticationPage = new AuthenticationPage(driver);
        authenticationPage.SendPassword(EXISTING_PASS);
    }
    @And("^Giriş yap butonuna tıklanır$")
    public void LoginButton() throws Throwable {
        authenticationPage = new AuthenticationPage(driver);
        authenticationPage.Loginbutton();
    }
    @And("^Login olduğu isminden kontrol edilir.$")
    public void LoginControl() throws Throwable {
        authenticationPage = new AuthenticationPage(driver);
        authenticationPage.loginProcessControl();
    }
    @And("^Iphone urunleri aranır \"<ProductName>\"$")
    public void SearchBox() throws Throwable {
        productProcessPage = new ProductProcessPage(driver);
        productProcessPage.SendProductFromSearchBox("Iphone");
    }
    @And("^Iphone urunlerinin basariyla geldigi gorulur..$")
    public void CheckProductcontrol() throws Throwable {
        productProcessPage = new ProductProcessPage(driver);
        productProcessPage.CheckProductControl();
    }
    @When("^Iphone 11 urunu tiklanir.$")
    public void ChooseProduct() throws Throwable {
        productProcessPage = new ProductProcessPage(driver);
        productProcessPage.SelectProduct();
    }










}
