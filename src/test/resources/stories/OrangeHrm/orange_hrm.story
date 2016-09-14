Scenario: Search in Directory page

GivenStories: scenarios/LoginOrangeHRM.scenario

Given user is on Directory page
When user enter <searchText> as Name
When user click on Search
Then <searchResult> should display in the search result

Examples:
|userName|passWord|searchText|searchResult|
|admin|admin|Ebo|Ehioze Ebo|
|admin|admin|Rob|Robert Craig|	