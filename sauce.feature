#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Add to cart functionality
 

  @tag1
  Scenario: User should be able to add the product to cart
    Given Open the browser
    And Access the application
    When Login to application
    And Add product to cart
    And Open the cart
    And Remove the product
    Then Check out 
    And Enter the details and continue
    And Click on finish
    And Back to home page

 
