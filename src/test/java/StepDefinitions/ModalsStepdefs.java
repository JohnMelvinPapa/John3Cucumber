package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObjects.Modals;

public class ModalsStepdefs {
    Modals modals = new Modals();


    @When("I navigate to the Modal Webpage")
    public void iNavigateToTheModalWebpage() {
        modals.navToModals();

    }

    @Then("I check if Im on the right webpage")
    public void iCheckIfImOnTheRightWebpage() {
        modals.verifyWebPage();

    }

    @Then("I will click Launch Default Modal")
    public void iWillClickLaunchDefaultModal() {
        modals.clickDefaultModal();
    }

    @Then("I will click Save Changes")
    public void iWillClickSaveChanges() {
        modals.clickSaveChanges();
    }

    @Given("Modals. I will navigate to Modals")
    public void modalsIWillNavigateToModals() {
        modals.navToModals();
    }

    @Then("Modals. I will click Launch Default Modal")
    public void modalsIWillClickLaunchDefaultModal() {
        modals.clickDefaultModal();
    }

    @Then("Modals. I will click Save Changes")
    public void modalsIWillClickSaveChanges() {
        modals.clickSaveChanges();
    }

    @When("Modals. I hover mouse over the button1")
    public void modalsIHoverMouseOverTheButton() {
        modals.hoverOverButton1();
    }

    @Then("Modals. I see the tooltip: {string}")
    public void modalsISeeTheTooltip(String tooltipmessage) {
        Assert.assertEquals(modals.getToolTipForButton1(), tooltipmessage);
    }

    @When("Modals. I Click mouse over the button1")
    public void modalsIClickMouseOverTheButton() {
        modals.PopoverButton1Click();

    }

    @Then("Modals. I see the Popover: {string}")
    public void modalsISeeThePopover(String PopoverMessage) {
        Assert.assertEquals(modals.getToolTipForButton1(), PopoverMessage);
    }


}
