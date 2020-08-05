Feature: User should able to add email
@email
  Scenario Outline: adding email from contacts
    Given User go into given url
    When User enters "<username>" and "<password>"
    Then User click on login button
    And User click on poll button
    Then User click on Add more link
    Then click on Employees and departments tab
    And select fist email
    Then close pop up window
    And verify selected email is there


    Examples:
      | username                       | password |
      | helpdesk53@cybertekschool.com  | UserUser |