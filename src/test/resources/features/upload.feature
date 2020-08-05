@smoke_test
Feature: As a user, I should be able to create a
  poll by clicking on Poll tab under Active Stream

  Background:User is on given url
    Given User go into given url

  Scenario Outline:User should be able to upload file from bixtrix

    Given User enters "<username>" and "<password>"
    Then User click on login button
    Given User click on poll button
    When User click on upload file icon
    Then User click on Select document from Bixtrix
    Then Select document from bixtrix
    And Click Select document button
    And Verify uploaded item there
    Examples:
      | username                       | password |
      | helpdesk53@cybertekschool.com  | UserUser |
#      | helpdesk54@cybertekschool.com  | UserUser |
#      | hr53@cybertekschool.com        | UserUser |
#      | hr54@cybertekschool.com        | UserUser |
#      | marketing53@cybertekschool.com | UserUser |
#      | marketing54@cybertekschool.com | UserUser |


  Scenario: User should be able to upload files and images under poll

    Given User enters "<username>" and "<password>"
    Then User click on login button
    Given User click on poll button
    When User click on upload file icon
    Then User click on Upload files and images
    And Select AgileMeetings file
    Then click open




