Narrative: This story will check if we are able to get into the demoQa site and fill up form. 


Scenario: Launch demoQa site and verify registration button is working fine. 

Given I launch demoQa site
When registration button is visible
Then Click registration button and confirm we are on correct page

Scenario: Launch demoQa site click on registration and fill up the form.
Given I click on the registration button
When  I fill up the form
Then I am able to click on the submit button.
