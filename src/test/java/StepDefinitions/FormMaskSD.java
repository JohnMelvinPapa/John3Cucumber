package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pageObjects.FormMask;

public class FormMaskSD {
    FormMask mask = new FormMask();

    @Then("FormMask. I enter the Date: {string}")
    public void formmaskIEnterTheDate(String date) {
        mask.setDate(date);
    }

    @Then("FormMask. I will verify: {string}")
    public void formmaskIWillVerify(String date) {
        Assert.assertEquals(mask.getDate(),date);
    }
}
