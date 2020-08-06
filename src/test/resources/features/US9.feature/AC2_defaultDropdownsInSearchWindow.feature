@AC2defaultDropdowns
Feature:   As a user, I should be able to use Filter and search functionality on Active Stream.


  Scenario Outline:
    Given User enter "<username>" and "<password>", and login
    When User on the search window page
    Then User should select add field line
    Then User should select default "<checkboxes>"

    Examples:
      | username                       | password | checkboxes |
      | helpdesk53@cybertekschool.com  | UserUser | Date       |
      | helpdesk54@cybertekschool.com  | UserUser | Type       |
      | hr53@cybertekschool.com        | UserUser | Author     |
      | hr54@cybertekschool.com        | UserUser | To         |
      | marketing53@cybertekschool.com | UserUser | Favorites  |
      | marketing54@cybertekschool.com | UserUser | Tag        |




