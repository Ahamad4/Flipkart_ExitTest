----------------------------------->>>Flipkart<<--------------------------------------

In this Flipkart e- commerce webiste I haved Automate the different functionlaities via Automation testing. I have test this website with the help of some tools and frameworks.like i have checked login functionlaity Add to cart functionlaity etc.
also i have used some different methods to write our test cases.

•	Selenium
•	Java
•	TestNG
•	Maven 
*     Selenium Webdriver


-----#Requirements#-----
* In order to utilise this project you need to create a Maven project in Eclipse IDE

* Maven 3

* Chrome and Chromedriver (UI tests use Chrome by default, can be changed in config)

* Java 1.8
 
* In this maven project you have to setup the project after that create some maven dependencies in POM.xl file
  through maven repository.After that installed those dependencies in our project and use it.

* Also i have used the selenium jars in this project inorder to run these test cases so first you have download these jars in after that copy these jars in our project liberaries which is present inside in build path.

* For generating extent report you have to the dependency inorder to make a report so go to google and download extent report dependency and copy these dependencyin POM.xml


--------# Headless Mode #---------

 There are Option to run in Headless Mode by writing headless in config properties file


-----# To run the Flipkart Automation Suite from command line in project folder#-----

- mvn clean test

-----# TestNG file description #-----

- TestNG.xml - defines the all test related

-----# Concept Included #-------
 
- Parallel test runs
- Dependency injection
- Page Object pattern
- Common web page interaction methods
- Externalised test configuration
- Commonly used test utility classes
- Simple security tests


-----# Reports & Screenshots #-------
 
 - Screenshots gets placed under \FailedScreenshot folder with testname.

 - Extent Report gets generated after the run under Reports\ExtentReport.html


•  I have also used to Integrate the test suit   with Jenkins and GitHub for CI/CD part.For integration through jenkings you need to install the jenkins 
   and performed some operations.

------#My project and its Report is present in this link.#--------

Extent Report --> C:\Users\ahamadhusain\eclipse-workspace\ExitTest\reports\ExtentReports.html










