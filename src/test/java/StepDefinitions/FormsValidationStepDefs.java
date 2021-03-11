package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.FormsValidation;

public class FormsValidationStepDefs {
    FormsValidation validation = new FormsValidation();
    @Given("Forms.Validation.Navigate to validation page")
    public void formsValidationNavigateToValidationPage() {
        validation.navigateToValidationPage();
    }
    @And("Forms.Validation.Fill out name field: {string}")
    public void formsValidationFillOutNameField( String arg0 ) {
        validation.fillOutNameField( arg0 );
    }
    @And("Forms.Validation.Fill out Username field: {string}")
    public void formsValidationFillOutUsernameField( String arg0 ) {
        validation.fillOutUsernameField(arg0);
    }
    @And("Forms.Validation.Fill out email field: {string}")
    public void formsValidationFillOutEmailField( String arg0 ) {
        validation.fillOutEmailField(arg0);
    }
    @And("Forms.Validation.Read a notification message {string}, {string}, {string}")
    public void formsValidationReadANotificationMessage( String arg0, String arg1, String arg2 ) {
        validation.readNotificationMessage(arg0, arg1, arg2);
    }
    @And("Form.Validation.Press on Submit button")
    public void formValidationPressOnSubmitButton() {
        validation.pressOnSubmitButton();
    }


}