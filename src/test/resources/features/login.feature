@login_all
Feature: User should be able to login with right credentials
  Scenario: go url
    Given User goes into given url
  Scenario Outline:
    Given User enters "<username>" and "<password>"
    Then User click on login button
    Then Verify page title has Portal
    Then user click arrow
    Then User logout

    Examples:
      | username                       | password |
      | helpdesk53@cybertekschool.com  | UserUser |
      | helpdesk54@cybertekschool.com  | UserUser |
      | hr53@cybertekschool.com        | UserUser |
      | hr54@cybertekschool.com        | UserUser |
      | marketing53@cybertekschool.com | UserUser |
      | marketing54@cybertekschool.com | UserUser |


