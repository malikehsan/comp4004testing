@tag
Feature: Choose a project

  @tag1
  Scenario: unattributed project
    Given I navigate to the login page
    When I click to login
      | Fields   | Value |
      | username | student1 |
      | password |   123 |
    Then I click on an unattributed project


  Scenario: attributed project
    Given I navigate back to the login page
    When I click to login
      | Fields   | Value |
      | username | student2 |
      | password |   123 |
    Then I click on an attributed project
