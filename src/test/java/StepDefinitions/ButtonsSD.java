package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Buttons;

public class ButtonsSD {
    Buttons buttons = new Buttons();

    @Given("Buttons. I navigate to Buttons")
    public void buttonsINavigateToButtons() {
        buttons.navToButtons();
    }

    @When("Buttons. I Press on the blue DropUp")
    public void buttonsIPressOnTheBlueDropUp() {
        buttons.clickBlueDropUp();
    }

    @Then("Buttons. I will click action")
    public void buttonsIWillClickAction() {
        buttons.clickAction();
    }


    @When("Buttons. I Press on the dark blue DropDown")
    public void buttonsIPressOnTheDarkBlueDropDown() {
        buttons.clickDarkDropUp();
    }

    @Then("Buttons. I will click Another action")
    public void buttonsIWillClickAnotherAction() {
        buttons.clickAnotherAction();
    }
}
