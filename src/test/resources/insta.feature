
@InstaSignup
Feature: Signup Functionality
  

  @SmokeTest
  Scenario: To Validate the Signup Functionality
    Given Open the Browser,enter the Insta Signup url
    When user enters the email fullname username password
    And click on signup button
    Then Signup successfully message should be displayed
    

  #@tag2
  #Scenario Outline: Title of your scenario outline
   # Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step

    #Examples: 
     # | name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
