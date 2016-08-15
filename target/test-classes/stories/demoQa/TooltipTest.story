Scenario: As an user I should be able click on the tooltip button under widget
and check for the tooltip text.

Given i am able to get into demoQa site
When I click on the tooltip button
Then I should be able to verify the tooltip text is<text>

Examples:
|                     text                         |
|We ask for your age only for statistical purposes.|
|This should fail the test, just to see what happens|