
@tag
Feature: login feature

  @tag1
  Scenario:To validate simple form and all textboxes present
    Given user opens chrome browser and enters simpleform url
    And verify Title of that page
    When user should able to enter text in username field
    And user should able to enter text in password field
    And user should able to click login button
    Then after eneter invalid creditionals user should get invalid message

 