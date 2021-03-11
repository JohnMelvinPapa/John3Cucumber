package pageObjects;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import pageObjects.pageComponents.Navigation.Navigation;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Tables extends CommonPage {
    String header = "Data Tables";
    String[] headerContents = {"Name", "Position", "Office", "Age", "Start date", "Salary"};
    String header2 = "Showing 1 to 9 of 9 entries (filtered from 57 total entries)";
    Navigation navigation = new Navigation();

    public Tables() {
        super();
    }

    public void navToTables() {
        navigate();
        navigation.pressOnDataTables();
    }


    public void checkIfOnTheCorrectPage() {
        By locator = By.cssSelector("h1");
        Assert.assertEquals(getClickableElement(locator).getText(), header);
    }

    public void checkHeader() {
        By locator = By.cssSelector("[role = 'row'] > th");
        /**
         * we build the first list base on the values we read from teh webpage
         */
        List<String> actualData = new ArrayList<>();
        for (int i = 0; i < getElements(locator).size(); i++) {
            actualData.add(getElements(locator).get(i).getText());
        }
        /**
         * this is our reference data set. agains which we are going to assert if whatever
         * we got form teh webpage is what we were expecting.
         */
        /**
         * Cast array to List
         */
        List testData = Arrays.asList(headerContents);
        /**
         * And this is were the test happens
         */
        Assert.assertEquals(actualData, testData);

    }

    public void printTheTable() {
        /**
         * This method will set the amount of the elements on teh table to the given number
         */
        pickPaginationOptions("100");
        By tableLocator = By.cssSelector("[id='example'] >tbody >tr");
        waitForPageLoad();
        List<WebElement> rows = getElements(tableLocator);
        List<String> tableContent = new ArrayList<>();
        for (WebElement element : rows) {
            tableContent.add(element.getText());
        }

        System.out.println(tableContent);
        try {
            FileUtils.writeLines(new File("src/test/resources/output.txt"), tableContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void pickPaginationOptions(String numberOfElements) {
        By locator = By.cssSelector("[name='example_length']");
        Select selector = new Select(getElement(locator));
        selector.selectByValue(numberOfElements);
        waitForPageLoad();
    }

    public int getNumberOfElementsOnTheTable() {
        By tableLocator = By.cssSelector("[id='example'] >tbody >tr");
        return getElements(tableLocator).size();
    }

    public int getTheTotalAmountOfElements() {
        By locator = By.cssSelector("[class='dataTables_info']");
        String text = getClickableElement(locator).getText();
        return Integer.parseInt(text.substring(19, 21));
    }

    public void selectDropdown() {
        WebElement selector =  getClickableElement(By.cssSelector("[name='example_length']"));
        Select oSel = new Select(selector);

        if(oSel.isMultiple()){

            oSel.selectByValue("10");
            oSel.selectByValue("25");
            oSel.selectByValue("50");
            oSel.selectByValue("100");

        }


    }
    public void searchJen(String value) {
        driver.findElement(By.xpath("//input[@type='search']")).clear();
        By locator = By.xpath("//input[@type='search']");
        getElement(locator).sendKeys(value);
    }
    public void checkHeader2() {
        By locator = By.cssSelector("[role = 'row'] > th");
        /**
         * we build the first list base on the values we read from teh webpage
         */
        List<String> actualData = new ArrayList<String>();
        for (int i = 0; i < getElements(locator).size(); i++) {
            actualData.add(getElements(locator).get(i).getText());
            System.out.println(getElements(locator).get(i).getText());
        }
        /**
         * this is our reference data set. agains which we are going to assert if whatever
         * we got form teh webpage is what we were expecting.
         */
        /**
         * Cast array to List
         */
        List testData = Arrays.asList(headerContents);
        /**
         * And this is were the test happens
         */
        Assert.assertEquals(actualData, testData);

    }

    public void printTheTable2() {
        By tableLocator = By.cssSelector("[id='example'] >tbody >tr");
        int rows = getElements(tableLocator).size();
        Map<Integer, String> tableContent = new LinkedHashMap<>();

        for (int i=1; i<=rows; i++){
            for (WebElement element: getElements(tableLocator)){
                tableContent.put(i, element.getText());
            }
        }
        System.out.println(tableContent);
    }

    public void searchEdinburgh(String value) {
        driver.findElement(By.xpath("//input[@type='search']")).clear();
        By locator = By.xpath("//input[@type='search']");
        getElement(locator).sendKeys(value);
    }

    public void checkNumberOfResult() {
        By locator = By.cssSelector("h1");
        Assert.assertEquals(getClickableElement(locator).getText(), header2);
    }

    public void clickSalary(){
       By locator = By.xpath("//th[@aria-label='Salary: activate to sort column ascending']");
    }

    public List<String> getAllTheRecordsFromTable() {
        By Locator = By.cssSelector("[id='example'] >tbody >tr >td");
        List<WebElement> cells = getElements(Locator);
        List<String> textFromCells = new ArrayList<>();
        for (WebElement element : cells){
            textFromCells.add(element.getText());
        }
        return textFromCells;
    }

    public List<String> getTestData() {
/**
 * Will pick pagination page
 */

        pickPaginationOptions("100");
        By tableLocator = By.cssSelector("[id='example'] >tbody >tr");
        waitForPageLoad();
        List<WebElement> rows = getElements(tableLocator);
        List<String> tableContent = new ArrayList<>();
        for (WebElement element : rows) {
            tableContent.add(element.getText());
        }
        return tableContent;
    }

    public List<String> readTestData() {
        /**
         * Will read and test data from a specific txt file
         */
        List<String> lines = new ArrayList<>();
        Charset cs= StandardCharsets.UTF_8;
        try {
            lines = FileUtils.readLines(new File("src/test/resources/output.txt"), cs);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }



}




