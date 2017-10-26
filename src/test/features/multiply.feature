@foo
  Feature: Multiplication operation
    Background: Calculator
      Given two numbers we should multiplicate

      Scenario: Multiplication of two positive numbers
        When we multiplicate two positive numbers 5 and 2
        Then the result of multiplication of two positive numbers should be 10

      Scenario: Multiplication of positive and negative numbers
        When we multiplicate positive and negative numbers 4 and -11
        Then the result of multiplication of positive and negative numbers should be -44

      Scenario: Multiplication of two negative numbers
        When we multiplicate two negative numbers -9 and -4
        Then the result of multiplication of two negative numbers should be 36