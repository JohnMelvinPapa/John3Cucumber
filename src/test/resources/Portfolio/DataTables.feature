Feature: Test Automation for Forms
  Background:
    Given Navigate to tables

  Scenario Outline: Check pagination
    When I check if I'm on the tables page
    Then I check the list of the elements in the Header
    When I pick "<Rows>" elements in records per page controller
    #And I will see "<Rows>" records on the page
    Examples:
      |Rows|
      |10  |
      |25  |
      |50  |
      |100 |
  #Scenario: Check search
  Scenario: Check search
    When I search for: "Yuri Berry"
    Then I check if I see the expected result
      |Yuri Berry|Chief Marketing Officer (CMO)|New York|40|2009/06/25|$675,000|

  #Scenario: reach search queries from the file















