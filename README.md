# SpringBoot Library Example Project.
This is a sample Java / Maven / Spring Boot  application.

# How to Run

This application is packaged as a jar which has Tomcat 8 embedded. No Tomcat or JBoss installation is necessary.

Clone this repository in the eclipse
Make sure you are using JDK 1.8 or above.
You can run the project directly from the eclipse.
Also you can take Build this project as jar.
Using this command to run the project 
java -jar jar-Name.jar.

# About the Service

Change your MySQL credentials  in application.properties file.
Don't need to create table  for the project the spring itself create table for you.

# RestApi Documentation.

1.http://localhost:8080/add/book
 
POST /add/book
Accept: application/json
Content-Type: application/json

{
"bookName" : "Ponniyin Selvan",
"authorName" : "Kalki",
"bookCount" : 2
}

# Response

Book Added Sucessfully

![image](https://user-images.githubusercontent.com/54183307/235404803-c4497719-f184-4cf1-a9d3-73449b1f9654.png)
