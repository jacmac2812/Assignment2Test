Feature: reverses text
  Scenario: Text needs to be capitalized
    Given I possess "hej"
    When I captilize this String
    Then I should retrieve "HEJ"