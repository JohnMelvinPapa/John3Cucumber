Feature: I'm demonstrating ow I'm working with WebElements
    Background:
        Given Modals. I will navigate to Modals
    Scenario: Open default Modal
        Then Modals. I will click Launch Default Modal
        Then Modals. I will click Save Changes

    #Scenario: Open and filout modal form
    #Scenario: Open and scroll scrolling modal

    Scenario: Read Popovers
        When Modals. I Click mouse over the button1
        Then Modals. I see the Popover: "Popover on top"

    Scenario: Read tooltips
        When Modals. I hover mouse over the button1
        Then Modals. I see the tooltip: "Tooltip on right"




















