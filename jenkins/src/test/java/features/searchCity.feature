Feature: Search City
  I am a user
  I want to search
  To see the weather of the city


  Scenario: Search for New York
      Given The main page is opened
      And   I click on search field
      When  I input "New York" in the search field
      Then  the search results list is displayed
      When  I click on the first search result
      Then  the city weather page header contains city name "New York"
      Then  I print "hello world"
      Then  I print 5

