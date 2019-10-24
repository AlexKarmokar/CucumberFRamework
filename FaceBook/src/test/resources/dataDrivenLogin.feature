Feature: Testing facebook login page

  Scenario Outline: facebook login test

    Given user landed on login page
    When user gives his "<username>" and "<pass>"
    Then user click on login button
    Then user click on home button
    And user search for Alex U Karmokar



    Examples:
      |    userName               |     Password             |
      | alex_karmo2010@yahoo.com  |    jesuslovesme          |
      |alex_karmo2010@yahoo.com   |    jesuslovesme          |


