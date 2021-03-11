Feature: Test Automation for Forms

  Background:
    Given Navigate to tables

  Scenario: fillout login form
    When I select 10 elements on the page
    When I select 25 elements on the page
    When I select 50 elements on the page
    When I select 100 elements on the page
    Then I search for: "Jennifer Chang"
    And I get Search results: "Jennifer Chang|Regional Director|Singapore|28|2010/11/14|$357,650"
    Then I will make sure that I have only one row in the search results

#optional
    And I look for: "Edinburgh"
    And I'm getting right search results.

#Extra Optional
    Then I sort by Salary and check if sort is working.
    #Assignment on Modals which is sent



