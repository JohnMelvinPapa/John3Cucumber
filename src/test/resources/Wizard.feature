Feature: Wizard
  Scenario: Fillout Step one
    Given I navigate to Wizard
    When Fillout the first page with: "First Name" and " Last name"
    Then I press Next Button
    And I verify that I an on the correct Step and I see the label: "Enter second step data"
    When I Fillout the second Page with: "streetAddress", "city", "state", "zip"
    Then I press Next Button
    And I verify that I an on the correct Step and I see the label: "Finish last step"
    And I will wait for "10" seconds





