package pages;

import helpers.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductProcessPage extends BaseTest{

    public ProductProcessPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    private WebDriverWait wait;



    private String ExpectedTshirtPrice = "$16.51";
    private String ExpectedTotalPrice = "$49.01";

    @FindBy(how = How.XPATH, using = "//div[@class='SearchBoxOld-root']//child::input")
    private WebElement searchBox;

    @FindBy(how = How.XPATH, using = "//div[@class='category-suggestion-title']//child::h1")
    private WebElement CheckProductControl1;

    @FindBy(how = How.XPATH, using = "//div[@class='category-suggestion-title']//child::span[1]")
    private WebElement CheckProductControl2;

    @FindBy(how = How.XPATH, using = "//div[@class='category-suggestion-title']//child::span[2]")
    private WebElement CheckProductControl3;

    @FindBy(how = How.XPATH, using = "//div[@class='category-suggestion-title']//child::span[3]")
    private WebElement CheckProductControl4;

    @FindBy(how = How.XPATH, using = "//img[@src='https://productimages.hepsiburada.net/s/49/280-413/10986386849842.jpg']")
    private WebElement selectProduct;

    @FindBy(how = How.XPATH, using = "//td[@id='total_price_container']")
    private WebElement compareTotalValue;


    public void SendProductFromSearchBox(String productName) {
        searchBox.sendKeys(productName);
    };

    public void CheckProductControl() {
        String checkProductControl1 = driver.findElement((By) CheckProductControl1).getText();
        String checkProductControl2 = driver.findElement((By) CheckProductControl2).getText();
        String checkProductControl3 = driver.findElement((By) CheckProductControl3).getText();
        String checkProductControl4 = driver.findElement((By) CheckProductControl4).getText();
        String actualProduct = checkProductControl1 + checkProductControl2 + checkProductControl3 + checkProductControl4 ;
        String expectedProductName ="ıphone ile ilgili +10.000 ürün bulduk.";
        Assert.assertEquals(expectedProductName, actualProduct);
    }
    public void SelectProduct() {
        selectProduct.click();
    };




}
