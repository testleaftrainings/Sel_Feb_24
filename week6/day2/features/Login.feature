Feature: Login Functionality of Leaptaps Application

//common steps in the scenario  you can to steps to background
#Background:
#Given Launch the browser and Load the Url

#tags
@sanity @regression
Scenario: Login with Positive credentials
When Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
And Click on LoginButton
Then Hompage should be displayed


@smoke @sanity
Scenario: Login with Negative credentials
When Enter the username as 'Demosales'
And Enter the password as 'crmsfa'
And Click on LoginButton
But Hompage should not be displayed