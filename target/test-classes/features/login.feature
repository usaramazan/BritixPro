  @login
  Feature: Login Feature

    Agile Story: As a user, I should be able to login with correct credentials
    to different accounts, and Activity Stream should be displayed.

    @helpdesk
    Scenario: Helpdesk login scenario
      Given User is on the login page
      When User logs in as helpdesk
      Then User should see Activity Stream


    @hr
    Scenario: HR login scenario
      Given User is on the login page
      When User logs in as helpdesk
      Then User should see Activity Stream


    @marketing
    Scenario: Marketing login scenario
      Given User is on the login page
      When User logs in as helpdesk
      Then User should see Activity Stream
