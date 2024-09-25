Feature: Current Location Label
  I am a user
  I want to use the current location options
  To see the weather of the current location

  Scenario: Verify Current Location Label
      Given The main page is opened
      When  I click on search field
      Then  the Use your current location label is displayed
      And   I click on current location button
      Then  the city weather page header contains city name "Wari"
