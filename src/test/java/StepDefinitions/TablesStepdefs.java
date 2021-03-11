package StepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObjects.Tables;

import java.util.List;
import java.util.Map;

public class TablesStepdefs {
    Tables tables = new Tables();

    @Given("Navigate to tables")
    public void navigateToTables() {
        tables.navToTables();
    }

    @When("I check if I'm on the tables page")
    public void iCheckIfIMOnTheTablesPage() {
        tables.checkIfOnTheCorrectPage();
    }

    @After
    public void close() {
       // tables.quit();
    }

    @Then("I check the list of the elements in the Header")
    public void iCheckTheListOfTheElementsInTheHeader() {
        tables.checkHeader();
    }

    @And("I print all the table")
    public void iPrintAllTheTable() {
        tables.printTheTable();

    }
//Select Dropdown
    @When("I select {int} elements on the page")
    public void iSelectElementsOnThePage(int arg)  {
        tables.selectDropdown();
    }

//Select Search Jen
    @Then("I search for: {string}")
    public void iSearchFor(String value) {
        tables.searchJen(value);
    }

    @And("I get Search results: {string}")
    public void iGetSearchResults(String arg0) {
        tables.checkHeader2();
    }
    @Then("I will make sure that I have only one row in the search results")
    public void iWillMakeSureThatIHaveOnlyOneRowInTheSearchResults() {
        tables.printTheTable2();
    }

    @And("I look for: {string}")
    public void iLookFor(String value) {
        tables.searchEdinburgh(value);

    }

    @And("I'm getting right search results.")
    public void iMGettingRightSearchResults() {
        tables.checkNumberOfResult();

    }

    @Then("I sort by Salary and check if sort is working.")
    public void iSortBySalaryAndCheckIfSortIsWorking(DataTable table) {
        List<List<String>> rows = table.asLists(String.class);
        List<Map<String, String>> rows1 = table.asMaps(String.class, String.class);

//        for (Map<String,String> columns : rows) {
//            System.out.println(columns);
//        }

        for (List<String> columns : rows) {
            System.out.println(columns);
            System.out.println(columns.get(0));
            System.out.println(columns.get(1));

        }

    }
    @When("I pick {string} elements in records per page controller")
    public void iPickElementsInRecordsPerPageController(String numberOfElements) {
        tables.pickPaginationOptions(numberOfElements);
    }

    @And("I will see {string} records on the page")
    public void iWillSeeRecordsOnThePage(String number) {
        int numberOfElements = Integer.parseInt(number);
        int totalAmountOfElements = tables.getTheTotalAmountOfElements();
        if (numberOfElements > totalAmountOfElements) numberOfElements = totalAmountOfElements;

        tables.getNumberOfElementsOnTheTable();
        Assert.assertEquals(tables.getNumberOfElementsOnTheTable(), numberOfElements, "Numbers of the elements on the table and in selector don't match");
    }
    @Then("I check if I see the expected result")
    public void iCheckIfISeeTheExpectedResult(DataTable dataTable) {
        Assert.assertEquals(tables.getAllTheRecordsFromTable(), dataTable.asList(), "no match");
    }

    @When("I check if data in webapp is matching the test data in the file")
    public void iSearchForSomething() {
        //tables.printTheTable();
        List<String> testData = tables.readTestData();
        Assert.assertEquals(tables.getTestData(), testData, "Actual data doesn't match the test data");
    }
}


