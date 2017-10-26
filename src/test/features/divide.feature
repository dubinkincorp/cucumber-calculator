@foo
  Feature: Division operation
    Background: Calculator
      Given two numbers we should divide

      Scenario: Division of two positive numbers
        When we divide two positive numbers 3 and 3
        Then the result of division of two positive numbers should be 1

      Scenario: Division of positive and negative numbers
        When we divide positive and negative numbers 12 and -2
        Then the result of division of positive and negative numbers should be -6

      Scenario: Division of two negative numbers
        When we divide two negative numbers -8 and -4
        Then the result of division of two negative numbers should be 2

      Scenario: Division by zero
        When we try to divide 5 by 0
        Then there is an error