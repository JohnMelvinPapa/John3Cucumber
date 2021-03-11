package pageObjects;

import org.openqa.selenium.By;
import org.testng.Assert;

public class Forms extends CommonPage {

    public Forms(){
    super();
}

    public void setEmail(String value) {
        By locator = By.id("inputEmail2");
        getElement(locator).sendKeys(value);
    }

    public void setPW(String value) {
        By locator = By.id("inputPassword2");
        getElement(locator).sendKeys(value);
    }
    public void clickSignIn() {
        By locator = By.cssSelector("div[class='col-sm-offset-2 col-sm-10'] button[type='submit']");
        getElement(locator).click();
   }

    public void verifyWebPage() {
        By locator = By.cssSelector("h1");
        Assert.assertEquals(getElement(locator).getText(),"Form Components");
    }

    //Second Scenario
    public void inputText(String value){
        By locator = By.xpath("//textarea[@class='form-control']");
        getElement(locator).sendKeys(value);
    }

    public void minimizeForm(){
        By locator = By.cssSelector("div[class='col-md-12'] i[class='fa fa-chevron-down']");
        getElement(locator).click();

    }

    public void selectText(String value){
        By locator = By.xpath("//select[@class='form-control input-lg']");
        getElement(locator).click();
    }

    public void closeForm(){
        By locator = By.cssSelector("div[class='col-md-12'] i[class='fa fa-times']");
        getElement(locator).click();

    }

    public void radio3(){
        By locator = By.xpath("//div[@class='iradio_flat-grey hover checked active']//ins[@class='iCheck-helper']");
        getElement(locator).click();
    }

    public void checkBox1() {
        By locator = By.xpath("[class='iradio_flat-grey']");
        getElement(locator).click();
    }
}