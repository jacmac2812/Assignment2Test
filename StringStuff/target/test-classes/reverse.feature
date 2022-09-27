Feature: reverses text
  Scenario: Text needs to be reversed
    Given i have "hej"
    When I reverse the String
    Then I should get "jeh"