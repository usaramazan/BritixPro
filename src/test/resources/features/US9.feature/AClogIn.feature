@login
Feature: User should be able to login successfully with right credentials
		Background: Backstory is that user is on the login page
		    Given User is on the login page
		     Scenario Outline:
			 Given User enter "<username>" and "<password>", click login button
			 Then Verify the page title has Portal
			 Then User should logout
				 Examples:
					 | username                       | password |
					 | helpdesk53@cybertekschool.com  | UserUser |
					 | helpdesk54@cybertekschool.com  | UserUser |
					 | hr53@cybertekschool.com        | UserUser |
					 | hr54@cybertekschool.com        | UserUser |
					 | marketing53@cybertekschool.com | UserUser |
					 | marketing54@cybertekschool.com | UserUser |
		    
		    