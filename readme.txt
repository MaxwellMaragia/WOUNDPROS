Stack used
----------
Selenium, cucumber and java
Page Object Model

Files
-----
Files are in the project directory and programmed to identify path regardless of machine being used to execute, no additional configuration required

Chrome driver
-------------
Please check your chrome version and download the corresponding driver if chrome has been updated from "https://chromedriver.chromium.org/downloads" then place in in the directory "PROJECT FOLDER/browsers"
!!IT WILL NOT EXECUTE IF CHROME DRIVER VERSION AND CHROME BROWSER VERSION ARE NOT THE SAME

Reports
-------
After execution an extent report will be generated and can be viewed in browser, also screenshots indicating pass or fail will be in report folder which is present under "PROJECT FOLDER/test-output"

Jenkins
-------
Powershell script for execution in jenkins is found in root project directory and is named "Jenkinsfile"

Scheduled execution on local machine
....................................
Install maven using this link https://maven.apache.org/install.html
You can schedule execution without using and IDE and set it to run at desired time under system configuration, the bat file is in root directory and is named "run.bat", please modify with correct file path

Covered modules/End to end flow
--------------------------------

1. Registration of facility, update of facility details
2. Registration of consultant, update of consultant details
3. Registration of patient and linking with newly created facility, update of patient details
4. Creating appointment for the patient
5. Full flow of all assessments for the patient


Tags used in execution
----------------------
1. @sanity - Used to execute full end to end flow from data creation to assessments
2. @registration - Used to execute only registration of facility, patient, consultant and updating their data
3. @Assessment - Used for performing all assessments on the patient without registration/utilizes existing data
4. @WoundAssessment - Used for performing all wound assessment only
5. @PatientAssessmentPodiatry
6. @PatientAssessmentDME
7. @PatientAssessmentBiologic
8. @BiologicsOrdering
9. @BiologicsApplication
10.@PatientAssessmentWoundDebridement

How to execute specific part
----------------------------
Registration - Copy the tag "@registration" and add in test runner (src\test\java\runner.TestRunner.java) under tags, same applies to other modules

How to execute full flow/smoke test
-----------------------------------
Comment out tags under Cucumber options in runner file (src\test\java\runner.TestRunner.java). Currently in line 17





