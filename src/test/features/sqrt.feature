@foo
  Feature: Sqrt operation
    Background: Calculator
      Given we should find square root of a given number

      Scenario: Square root of a positive number
        When we find square root of a positive number 9
        Then the result should be 3

      Scenario: Square root of a negative number
        When we find square root of a negatibe number -9
        Then there is an imaginary number


