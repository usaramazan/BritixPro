
Feature: As a User I should be able to use Filter and search functionality on Active Stream.

  Scenario: User on the Active Stream page
    Given User is on the Active Stream page
    Then User should click on search button
    Then User should see below words displayed
      | Work        |
      | Favorites   |
      | My Activity |
      | Workflows   |

		#command + option L
