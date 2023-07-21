
#Name of Assignmet- Selenium Assignmet
This Assignmet is for practice of Selenium with java
and learning some basic knowledge about the things 
related to Selenium.

#Structure of My Assignmet 

     A.src/main/java
       1.PageObjectData
         a.FlightData
            (This class contains Webdriver and WebElements
            of Flight booking site.)
         b.GreenCartData
            (This class contains Webdriver and WebElements
            of Greenkart website.) 

       2.PagesHelper
          a.TestDataPropFile
             (This class contains code for properties file)
          b.WebDriverPage
             (This class contains code for Starting Webdriver
             and launching driver of brwser and URL)   

       3.Utilities
          a.CommonUtilities
            (This class have driver and wait to load the Webdriver
            completely)

     B.src/main/resources
           a.log4j2.properties
               (This file is for logger) 
               
     C.src/test/java
            a.Runfile
               1.FlightSiteRun
               (This class is for execution of Flight website UI test)
               2.greenkartRun
               (This class is for execution of Greenkart website UI test)
            b.TestComponentBase
               1.BaseClass
               (This class contains the code for extent report,plateform
                and launchApplication method to launch the webdriver and 
                open url. It also contains @BeforeTest, @AfterTest annotations)
     D.srs/test/resources
     E.Maven Dependencies
         (Important Jar files for project)
     F.ExtentReports
       (Extent report in HTML format)
     G.PropertiesFile
      (properties file to pass data)
     H.target
      (while executed Assignmet, A logger file should be generated here)
     I.pom.xml
      (Dependencies for Testng, Selenium, ExtentReports, Log4j2 etc)
     J.testNG.xml
      (To run the Assignmet)


#HoW to run the project
Step 1. Import the project in Eclipse IDE
Step 2. Go to testng.xml file
Step 3. Right click here and go to 'Run as' 
         then select 'TestNG Suite'

#Prerequsites for execution of this project
-> project must be Maven type project
-> TestNG must be installed in Eclipse  
