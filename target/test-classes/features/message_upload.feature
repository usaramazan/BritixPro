Feature: As a user, I should be able to send messages by clicking on Message tab under Active Stream.

  Background:User is on given url
    Given User go into given url

    @ac1
  Scenario Outline:User should be able to click on upload files icon to upload files and pictures
  from local disks

    Given User enters "<username>" and "<password>"
    And   User click on login button
    Then  User click on message button
    When  User click on upload file icon
    Then  User click on Upload files and images
    Then  Select document from computer
#    And   Click Select document button    ??????
    Then   Verify uploaded item there
    Examples:
      | username                       | password |
      | helpdesk53@cybertekschool.com  | UserUser |
      | helpdesk54@cybertekschool.com  | UserUser |
      | hr53@cybertekschool.com        | UserUser |
      | hr54@cybertekschool.com        | UserUser |
      | marketing53@cybertekschool.com | UserUser |
      | marketing54@cybertekschool.com | UserUser |

  Scenario Outline:User should be able to click on upload files icon to upload files and pictures
  from download from external drive

    Given User enters "<username>" and "<password>"
    And   User click on login button
    Then  User click on message button
    When  User click on upload file icon
    Then  User click on download from external drive
    Then  Select document from external drive
    And   Click Select document button
    Then  Verify uploaded item there
    Examples:
      | username                       | password |
      | helpdesk53@cybertekschool.com  | UserUser |
      | helpdesk54@cybertekschool.com  | UserUser |
      | hr53@cybertekschool.com        | UserUser |
      | hr54@cybertekschool.com        | UserUser |
      | marketing53@cybertekschool.com | UserUser |
      | marketing54@cybertekschool.com | UserUser |

  Scenario Outline:User should be able to click on upload files icon to upload files and pictures from
  select documents from bixtrix24

    Given User enters "<username>" and "<password>"
    And   User click on login button
    Then  User click on message button
    When  User click on upload file icon
    Then  User click on Select document from Bixtrix
    Then  Select document from bixtrix
    And   Click Select document button
    Then  Verify uploaded item there
    Examples:
      | username                       | password |
      | helpdesk53@cybertekschool.com  | UserUser |
      | helpdesk54@cybertekschool.com  | UserUser |
      | hr53@cybertekschool.com        | UserUser |
      | hr54@cybertekschool.com        | UserUser |
      | marketing53@cybertekschool.com | UserUser |
      | marketing54@cybertekschool.com | UserUser |

  Scenario Outline:User should be able to click on upload files icon to upload files and pictures from
  create files to upload.

    Given User enters "<username>" and "<password>"
    And   User click on login button
    Then  User click on message button
    When  User click on upload file icon
    Then  User click on Create using desktop applications
#    Then  Select document from locally ??????
#    And   Click Select document button
#    Then  Verify uploaded item there //
    Examples:
      | username                       | password |
      | helpdesk53@cybertekschool.com  | UserUser |
      | helpdesk54@cybertekschool.com  | UserUser |
      | hr53@cybertekschool.com        | UserUser |
      | hr54@cybertekschool.com        | UserUser |
      | marketing53@cybertekschool.com | UserUser |
      | marketing54@cybertekschool.com | UserUser |