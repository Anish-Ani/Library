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

# Reference

![image](https://user-images.githubusercontent.com/54183307/235405656-07d716f9-1f14-44bc-b12d-d97bacca76f5.png)

2.http://localhost:8080/update/book
 
PUT /update/book
Accept: application/json
Content-Type: application/json

{
"bookName" : "Ponniyin Selvan",
"authorName" : "Kalki",
"bookCount" : 2
}

# Response

Book Updated Sucessfully

# Reference

![image](https://user-images.githubusercontent.com/54183307/235405773-aeb6a4f6-9430-44c6-936c-d92fbc51081e.png)

3.[http://localhost:8080/delete/book](http://localhost:8080/delete/book?id=2)
 
DELETE /delete/book


# Response

Book Deleted Sucessfully

# Reference

![image](https://user-images.githubusercontent.com/54183307/235405891-34fa0366-a1a5-4e69-8045-e10155e9b643.png)

1.http://localhost:8080/get/book
 
GET /get/book
Accept: application/json
Content-Type: application/json


# Response

[{},{}...]

# Reference

![image](https://user-images.githubusercontent.com/54183307/235405988-3db6d0b1-0519-4afc-a37a-f064ef33d3d1.png)


