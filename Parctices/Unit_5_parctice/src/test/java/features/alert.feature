Feature: Alert
  I am a user
  I Want to handel alert
    Scenario: Alert
        Given I go to "JavaScript Alerts" on the main page
        When I generate alert on the JavaScript Alert page
        And I accept the alert
        Then success message is displayed on the page