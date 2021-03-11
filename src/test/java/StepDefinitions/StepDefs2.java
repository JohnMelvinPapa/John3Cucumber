package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Forms;


public class StepDefs2  {
    Forms form = new Forms();

    @Given("Navigate to: {string}")
    public void navigateTo() {
        form.navigate();
    }

    @When("I enter a sample email address {string} to the Email Address field")
    public void enterSampleEmail(String value) {
        form.setEmail(value);
    }

    @Then("I will enter a sample password {string} to the Password field")
    public void enterSamplePW(String value) {
        form.setPW(value);

    }

    @And("Click the Sign in button")
    public void clickTheSignInButton() {
        form.clickSignIn();
    }

    //Second Scenario

    @When("I locate the Input Text Field and Enter {string}")
    public void iLocateTheInputTextFieldAndEnter(String value) {
        form.inputText(value);
    }

    @And("I will minimize the form")
    public void iWillMinimizeTheForm() {
        form.minimizeForm();

    }
    //Third scenario

    @When("I will locate the input-lg dropdown and select the {string}")
    public void iWillLocateTheInputLgDropdownAndSelectThe(String value) {
        form.selectText(value);
    }

    @Then("I will close the form")
    public void iWillCloseTheForm() {
        form.closeForm();
    }

    //Fourth Scenario

    @When("I will locate the Radio button and select the third Option")
    public void iWillLocateTheRadioButtonAndSelectTheThirdOption() {
        form.radio3();
    }


    @Then("I will locate the Checkbox Option one")
    public void iWillLocateTheCheckboxOptionOne() {
        form.checkBox1();
    }
    @After
    public void closeTheDriver(){
        form.quit();
    }

}
