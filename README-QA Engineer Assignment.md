# Project Title
QA Engineer Assignment

To validate broken images and upload file.

## Description

    The Automation framework intended to validate if there are broken images present in "http://the-internet.herokuapp.com/broken_images" our website.
For that I use getAttribute method to find the natural width of images, if natural width is 0 then it is considered that the image is broken.
    Also, The framework is used to upload the file.  

### Dependencies

* OS version - Windows 10
* Eclipse IDE version - 4.23.0
* Maven version - 3.9.0
* TestNG version - 7.6.0
* Git - 3.8.0
* Knowledge of Selenium with Java.


### Executing program

* First I have created Maven Project- Maven provide standard folder structure, such as:
  > src/main/java - BaseClass- Configure Browser and launch Application
  > src/test/java - POM Classes- MainPage, fileUploadPage, brokenImagePage, TestClass
  > POM.xml - Adding depedencies for Selenium, TestNG, Junit, Appache-POI
  > In POM classes declared global Elements as private using @FindBy, Initialized constructor as public using Page-Factory class, Utilized method as public.
  > In our project Created folders such as Browser for store the chromedriver.exe file and In ExcelData, there is adding demo.xlsx file for uploading any file.
  > In test class, we extends the BaseClass and add navigation steps to test the application.

* Note : Change the path of chromedriver.exe file from BaseClass as per your system path and  also change the path of demo.xlsx file.


## Authors

barveprasad  
https://github.com/barveprasad/Project.git


