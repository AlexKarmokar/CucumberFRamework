Feature: Testing facebook loginpage

  Scenario: Facebook login Test

    Given user landed on login page
    When user gives his userName and password
    Then user click on logIn button
    Then user click on home button
    And user can serch for Alex U Karmokar