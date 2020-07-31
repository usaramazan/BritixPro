
 @bitrix
  Feature: Creating and sending workflows from "More" tab under Activity Stream

    Agile Story: As a user, I should be able to create and send workflows by selecting different
    workflows from "More" tab under Activity Stream.

  Background: Authorized user is on the bitrix home page
     Given User is logged in into CRM page
     Then User click to Activity Stream module
     Then  User selects "Workflow" from "WORKFLOW" dropdown


    Scenario: 1. User should be able to request a Leave Approval by:
      Given User should be able to request a Leave Approval
      When User selects "Leave Approval" from "Workflow" dropdown
      Then User is assigning approvers and processors
      Then User selecting start date
      And User selecting ending date from date picker
      Then User select "Absence type" from dropdown
      And User entering reason for leave information.
      Then User clicks on send button leave approval


    Scenario: 2. User should be able to request a Business Trip by:
      Given User should be able to request a Business Trip
      When User selects "Business Trip" from "Workflow" dropdown
      Then User  assigning approvers, processors and entering user instructions
      Then User entering trip Title
      And User entering Destination
      Then User selecting start date
      And User selecting ending date from date picker
      And User entering Purpose
      And User enters Planned Expenses
      And User select "Currency" from information dropdown
      Then User clicks Add File and attach documents
      Then User clicks on send button to send business trip


    Scenario: 3. User should be able to send a General Request
    Given User should be able to send a General Requests
    When User selects "General Requests" from "Workflow" dropdown
    Then User enters title by writing on "Title" description
    And User enters " Description" on description part
    And User select priority level by clicking on "Priority level" dropdown
    And User send Request To field by selecting from "Select" dropdown
    Then User clicks on send button to send request




   Scenario: 4. User should be able to send a Purchase Request by:
     Given User should be able to send a Purchase Request
     When User selects "Purchase Request" from "Workflow" dropdown
     Then User assigning approvers and processors
     Then User entering Request Title
     Then User enters Amount
     And User select Currency by clicking on "Currency" dropdown
     And User attach documents by clicking on "Add File"
     Then User clicks on send button to send purchase request



    Scenario: 5. User should be able to send an Expense Report by:
      Given User should be able to send an Expense Report
      When User selects "Expense Report" from "Workflow" dropdown
      Then User assigning approvers and accountants
      Then User entering Report Title
      Then User write description
      Then User enter amount
      Then User select Currency from "Currency" dropdown
      And User attach files by clicking on "Add File" dropdown
      Then User clicks on send button to send expense report




   Scenario: 6. User should be able to create new workflows.




   Scenario: 7. User should be able to access Workflows Directory page.

