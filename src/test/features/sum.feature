@foo
Feature: Addition operation

  Background: Calculator
    Given two numbers we should sum

  Scenario: Sum of two positive numbers
    When try to sum positive numbers 5 and 3
    Then the sum of two positive numbers should be 8

  Scenario: Sum of positive and negative numbers
    When try to sum positive and negative numbers 4 and -51
    Then the sum of positive and negative numbers should be -47

  Scenario: Sum of negative numbers
    When try to sum negative numbers -9 and -85
    Then the sum of two negative numbers should be -94

