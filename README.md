Technologies Covered in This Project
====================================
#Selenium
(https://www.selenium.dev/) is a free (open-source) automated testing framework used to validate web applications across different browsers and platforms

# Cucumber
[Cucumber](https://cucumber.io/) is a tool for running automated tests written in plain language. Because they're written in plain language, they can be read by anyone on your team. Because they can be read by anyone, you can use them to help improve communication, collaboration and trust on your team.

# maven-cucumber-reporting
[maven-cucumber-reporting](https://github.com/damianszczepanik/cucumber-reporting)  is a Java report publisher primarily created to publish cucumber reports on the Jenkins build server. It publishes pretty html reports with charts showing the results of cucumber runs.

# Extent-Reports 
(https://www.extentreports.com/) is an open-source reporting library.

Building and Running the Project
=============================

## Prerequisites
There are a few things needed before you run the tests. Make sure you have the latest versions of the following installed:
- [Java Development Kit](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
- [Maven](https://maven.apache.org/)

#### Note
- Scenarios (in Gerkhin) are in src\test\resources\FeatureFiles

## Setup
1. Clone the repo
2. Install dependencies with `mvn install`

##Run
- Run all test with `testng.xml`

- You can view the default cucumber report in target/hepsiburada/cucumber.html/index.html file

- You can view the ExtenReport html and screenshots in target/Extent_Reports directory

