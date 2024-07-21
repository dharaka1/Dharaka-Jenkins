
@tag
Feature: Demo Test

  @tag1
  Scenario: Demo Test
    Given User Launch "<Browser>"
    When Navigate to url
    And  user2 Click on 'Signup / Login' button
    And user3 Verify 'New User Signup!' is visible
    And user4 Enter 'Address information' button
    When user5 Verify that 'ENTER ACCOUNT INFORMATION' is visible

  @tag2
  Scenario Outline: Title of your scenario outline
    When  user10  Click 'Create Account button'
    When user11 Verify that 'ACCOUNT CREATED!' is visible
    And user  Click 'Continue' button
    Then  user  Verify that 'Logged in as username' is visible
    
  Examples:
   
   |user     | Pass     |
   |Dharaka  |Sundar@123|
    

  