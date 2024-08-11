
@SimpleForm
Feature: Simple Form Functionality
  

  @SmokeTest
  Scenario: To Validate the Simple Form Functionality
    Given Open the Browser, enter the Simple Form url
    When user enters firstname lastname email phnnumber message
    And  click on submit button
    Then Thank You for reaching out to us, sakshi rajawat should be displayed

  
  #@tag2
  #Scenario Outline: To Validate the Simple Form Functionality
   # GivenOpen the Browser, enter the Simple Form url
   # When user enters "<firstname>" "<lastname>" "<email>" "<phnnumber>" message
    #And  click on submit button
    #Then Thank You for reaching out to us, sakshi rajawat should be displayed

    #Examples: 
     # | firstname  | lastname | email                      | phnnumber  |
      #| Sakshi     | Rajawat  | rajawatsakshi400@gmail.com | 6377602937 |
      #| Malvika    | Sesodia  | malvika@gmail.com          | 9867543256 |
      #| Sonalika   | Chauhan  | sonalika09@gmail.com       | 9008997654 |
      
