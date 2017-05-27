@tag
Feature: Proof that my registration application works

  @tag1
  Scenario: Registeration1
    Given I navigate to the login page
    When I click on the registration page
    Then I fill up the required information
      | Fields    | Value     |
      | name      | student2  |
      | username  | student2  |
      | email     | 123@s.com |
      | password  |       123 |
      | password2 |       123 |
    Then I click on the register button
