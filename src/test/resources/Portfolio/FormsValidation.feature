Feature: Test Automation for Forms

  Background:
    Given Forms.Validation.Navigate to validation page

  Scenario Outline: check validation notifications
    And Forms.Validation.Fill out name field: "<Name>"
    And Forms.Validation.Fill out Username field: "<Username>"
    And Forms.Validation.Fill out email field: "<Email>"
   # And Form.Validation.Press on Submit button
    And Forms.Validation.Read a notification message "<NotificationForName>", "<NotificationForUsername>", "<NotificationForEmail>"
    Examples:
      | Name | Username | Email | NotificationForName   | NotificationForUsername | NotificationForEmail |
      | fg   | gh       | al    | You name is required. | Username is too short.  | Enter a valid email. |


















