# spring-boot
This is a demo on Spring Boot using mongoDB.

This app covers :
-----------------

1. This project is to understand the CRUD operation using MongoDB.
2. This explain how to use profiling in spring-boot.
3. This explain about ApplicationRunner in spring-boot.
4. How to configure server and mongoDB in application.properties.

This project is having 3 layers -
----------------------------------
1. Controller
2. Service
3. Repository

How to run this app?
--------------------
1. First clone this app in your PC.
2. Go inside app folder
3. Run "mvn clean install"
4. Run "java -jar target/MyFirstApp-0.0.1-SNAPSHOT.jar"
          This will pick the default application.properties file.
          
          
For profiling :
---------------

Production environment
---------------------
Run "java -jar -Dspring.profiles.active=prod target/MyFirstApp-0.0.1-SNAPSHOT.jar"

It will pick the application-prod.properties file.

Development environment
-----------------------
Run "java -jar -Dspring.profiles.active=dev target/MyFirstApp-0.0.1-SNAPSHOT.jar"

It will pick the application-dev.properties file.
