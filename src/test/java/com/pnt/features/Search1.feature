Feature: Search for items

  Scenario: user being able to search for java books
    Given user opens the browser and navigates to amazon.com and set up the POM
    When user can see search bar
    Then User types Java books in search bar
    And User clicks on search button
