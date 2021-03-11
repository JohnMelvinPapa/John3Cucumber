package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Sliders;

public class SlidersStepDefs {
    Sliders sliders = new Sliders();
    @When("I navigate to Sliders")
    public void iNavigateToSliders() {
        sliders.navigate();
    }

    @Then("I slide to :{string}%")
    public void iSlideTo(String arg0) throws InterruptedException {
        sliders.slide(Integer.parseInt(arg0));
    }

    @Given("I navigate to Sliders Page")
    public void iNavigateToSlidersPage() {
        sliders.navigateToSliders();

    }

    @When("I move slider from {string} to {string}")
    public void iMoveSliderFromTo(String arg0, String arg1) {
        sliders.moveFromTo(arg0,arg1);
    }
}
