package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.*;

public class Modals extends CommonPage{
    String url ="http://authenticgoods.co/wrapbootstrap/themes/neuboard-v1.4.3/Angular_full_version/index.html#/ui/modals-popups";
    String header = "Modals & Popups";

    public Modals() {
        super();
    }
    public void navToModals() {
        navigate();
        getClickableElement(By.cssSelector("a[title='UI Elements']")).click();
        getClickableElement(By.cssSelector("a[title='Modals & Popups']")).click();
        waitForPageLoad();
    }
    public void verifyWebPage() {
        By locator = By.cssSelector("h1");
        Assert.assertEquals(getClickableElement(locator).getText(), header);
    }
    public void clickDefaultModal(){
        By locator = By.xpath("//button[normalize-space()='Launch default modal']");
        getElement(locator).click();

    }
    public void clickSaveChanges(){
        By locator = By.xpath("//button[normalize-space()='Save changes']");
        getElement(locator).click();

    }

    public void hoverOverButton1(){
        Actions actions = new Actions(driver);
        WebElement element = getClickableElement(By.cssSelector("button[tooltip-placement='right']"));
        actions.moveToElement(element).perform();
    }
    public String getToolTipForButton1() {
        By locator = By.xpath("//button[normalize-space()='Tooltip on right']");
        return getClickableElement(locator).getText();
    }


    public void PopoverButton1Click() {
        By locator = By.cssSelector("button[popover-placement='top']");
        getClickableElement(locator).click();
    }



}
