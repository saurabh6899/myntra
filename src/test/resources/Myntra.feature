@HomePage
Feature: This file contains the Scenario with respect to Myntra WebSite

#Scenario: To Verify, If User can able to add Some Random Product in the cart or not

#Given  User searches the product in the searchBox
#And User should be able to see the relative product and the product should be add in the cart
#Then User should be able to perform the Billing Process


Scenario: To Verify, If user searches a random product, then he should be able to see the reviews & ratings  about that perticular product

Given User searches the product in the searchBox of Myntra
When User clicks on the product the product should be displayed with full of details
And User should be able to read the reviews and ratings

@Myntra
Scenario: To Verify, Jeans Under 899 are dislayed or not

Given User Clicks on Jeans Under 899
Then Verify if all jeans prices are under 899

@Myntra2
Scenario: To Verify, Sport Shoes Under 1499 are displayed or not

Given User Clicks on Shoes Under 1499
Then Verify if all shoes price are under 1499

@MyntraSunglasses
Scenario: To verify, All voyage Sunglasses with their respective prices

Given User searches Voyage Sunglasses in SearchBox
Then all Voyage Sunglasses are Available with price

@MyntraCasualShirts
Scenario: TO Verify, All men Casual Shirt with their brand name

Given User Searches casual shirts in Mens Section
Then all casual shirts with their respecective brand name should be displayed

@MyntraMINIKLUB
Scenario: To Verify, kids cloth with brand mini klub and there prices are displyed

Given User clicks on the kids section
When user scroll down and selects brand the brand MINI KLUB
Then all MINI KLUB cloths with their prices should be displayed

@MyntraEthnicWear
Scenario: To Verify, List of All Ethnic wears of men with their brand name should be displayed

Given user clicks on the Ethnic wear section on homepage
Then all Ethnic wear cloths should be displayed with prices 