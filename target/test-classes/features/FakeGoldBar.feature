@regression
Feature: Balance Scale Program

  Background:
    Given User is on Fetch Rewards Game page

  Scenario: As a user, I want to be able to find the correct fake gold bar
    When user inserts the following numbers in the left bowl
      | left0 | left1 | left2 | left3 |
      | 0     | 1     | 2     | 3     |
    And user inserts the following numbers in the right bowl
      | right0 | right1 | right2 | right3 |
      | 4      | 5      | 6      | 7      |
    And user clicks on "Weigh" button
    And user verifies the weighing list
    And user clicks on "Reset" button
    Then user inserts 2 numbers in the left bowl
    And user inserts 2 numbers in the right bowl
    And user clicks on "Weigh" button
    And user verifies the weighing list second time
    And user clicks on "Reset" button
    Then user inserts 1 number in the left bowl
    And user inserts 1 number in the right bowl
    And user clicks on "Weigh" button
    And user verifies the weighing list third time
    Then user clicks on fake gold bar and verifies pop-up message "Yay! You find it!"
    And user gets list of Weighings and outputs it


    Scenario: As a user, I want to be able to get error message when choosing wrong fake gold bar
      When user clicks on random fake gold bar and verifies error pop-up message "Oops! Try Again!"
      And user gets list of Weighings and outputs it