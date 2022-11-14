@FirstTest
  Feature: Basic Syntax

    Scenario: This is scenario 1
      Given user is on TS homepage
      When user clicks on About Us button
      Then user is taken to About Us page
      And close the browser