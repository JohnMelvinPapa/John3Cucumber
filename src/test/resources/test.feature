Feature: Test Automation for Forms

  Background:
     Given Navigate to: "http://authenticgoods.co/wrapbootstrap/themes/neuboard-v1.4.3/Angular_full_version/#/forms/components"

  Scenario: Automate the Horizontal Form
    When I enter a sample email address "john@gmail.com" to the Email Address field
    Then I will enter a sample password "fsdafds" to the Password field
    And Click the Sign in button

 Scenario: Automate one field in the Form Element
    When I locate the Input Text Field and Enter "Hello"
    And I will minimize the form

  Scenario: Automate the Selects Form
    When I will locate the input-lg dropdown and select the ".input-lg"
    Then I will close the form

  Scenario: Automate the Custom Checkboxes and Radios
    When I will locate the Radio button and select the third Option
    Then I will locate the Checkbox Option one











