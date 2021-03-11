Feature: Test Automation for Forms
  Background:
    Given FormMask. I navigate to FormMask
  Scenario: check masks rules
    Then FormMask. I enter the Date: "01202000"
    Then FormMask. I will verify: "01/20/2000"




















