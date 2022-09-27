Feature: lowercase text
  Scenario: Text needs to be lowercase
    Given i get the string "HELLO"
    When I lowercase the String
    Then at last I should get "hello"