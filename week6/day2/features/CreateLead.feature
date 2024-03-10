Feature: CreateLead functionality of Leaftaps Application

Scenario Outline: CreateLead with Multilple data
#Given Launch the browser and Load the Url
When Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
And Click on LoginButton
Then Hompage should be displayed
When Click on CRMSFA link
And Click on Leads link
And Click on CreateLead link
And Enter CompanyName as <companyname>
And Enter FirstName as <firstname>
And Enter LastName as <lastname>
And Click on Sumbit Button
Then ViewLeads Page Should be Displayed 

Examples:
|companyname|firstname|lastname|
|TestLeaf|Dilip|98|
|Qeagle|Aravind|R|


Scenario Outline: CreateLead with Multilple data
#Given Launch the browser and Load the Url
When Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
And Click on LoginButton
Then Hompage should be displayed
When Click on CRMSFA link
And Click on Leads link
And Click on CreateLead link
And Enter CompanyName as <companyname>
And Enter FirstName as <firstname>
And Enter LastName as <lastname>
And Click on Sumbit Button
Then ViewLeads Page Should be Displayed 

Examples:
|companyname|firstname|lastname|
|TestLeaf|Dilip|98|
|Qeagle|Aravind|R|