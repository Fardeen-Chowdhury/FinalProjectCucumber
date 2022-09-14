@all
Feature: Changing the Backgound Color

@skyBlue 
 Scenario: Sky Blue Background
   	Given Set SkyBlue Background button exists
   	When I click on the button for Sky Blue
   	Then the background color will change to sky blue

@white
 Scenario: White Background
   	Given Set White Background button exists
   	When I click on the button for White
   	Then the background color will change to White