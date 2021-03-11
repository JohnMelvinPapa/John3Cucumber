package pageObjects;

import org.openqa.selenium.By;

public class Buttons extends CommonPage{

    public Buttons() {
        super();
    }

    public void navToButtons() {
        navigate();
        getClickableElement(By.cssSelector("a[title='UI Elements']")).click();
        getClickableElement(By.cssSelector("a[title='Buttons']")).click();
        waitForPageLoad();
    }

    public void clickBlueDropUp() {
        By locator = By.xpath("//body//section[@id='main-wrapper']//div[@class='row']//div[@class='row']//div[3]//div[2]//button[2]");
        getClickableElement(locator).click();
    }
    public void clickAction() {
        By locator = By.xpath("//div[@class='btn-group dropup open']//ul[@role='menu']//li//a[@href='#'][normalize-space()='Action']");
        getClickableElement(locator).click();
    }

    public void clickDarkDropUp() {
        By locator = By.xpath("//button[@class='btn btn-primary dropdown-toggle'][normalize-space()='Action']");
        getClickableElement(locator).click();
    }

    public void clickAnotherAction() {
        By locator = By.xpath("//div[@class='btn-group open']//ul[@role='menu']//li//a[@href='#'][normalize-space()='Another action']");
        getClickableElement(locator).click();

    }
}
