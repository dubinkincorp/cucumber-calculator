@foo
  Feature: Subtraction operation

    Background: Calculator
      Given two numbers we should subtract

      Scenario: Subtraction of two positive numbers
        When we subtract two positive numbers 8 and 4
        Then the result of subtraction of two positive numbers should be 4

      Scenario: Subtraction of positive and negative numbers
        When we subtract positive and negative numbers 7 and -3
        Then the result of subtraction of positive and negative numbers should be 10

      Scenario: Subtraction of two negative numbers
        When we subtract two negative numbers -1 and -4
        Then the result of subtraction of two negative numbers should be 3