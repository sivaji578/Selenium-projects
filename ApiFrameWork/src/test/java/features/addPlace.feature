Feature: Validating place api
Scenario: Verify if place is adding on the addplaceap
Given Add place api
When User calls <Add Place> with post api
Then Api calls succes with succes code 200
And Status response is okay
   |Add Place|
   |Chennai  |
   |Nellore  |