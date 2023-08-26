Feature: Sherkhan Application

As a user
In order to explore the features of Sharekhan
I want to visit www.sharekhan.com

@MobileTest
Scenario: Launch Sharekhan website in the browser
Given ShareKhan website is open in the browser
Then the website is launched successfully
When user clicks on main menu 
Then main menu pop is displayed