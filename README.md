# SampleAccountTransactionsRepo
This repository is created to store the sample ANZ project created using Java and Spring Boot

Below are the key points to be noted.

1. The Rest API's present in this sample application can be tested using Postman as well as created Junits . The Junit class is calling the Rest Controller class to test required functionality.
   Mocking is not used here as we are using @SpringBootTest and loading context .Hence beans are getting autowired .
2. There are separate package for Test and main classes.
3. DAO layer constructor is used initialize the data for sample accounts and related transactions which can be used to test the required functionalities. 
   But in actual scenario the data needs to be fetched from Database by using some standard JPA/Hibernate. 
4. Loggers are added to log minimum possible information.
5. Enough class , method and attribute level java docs are added to make things easy for the reviewer of the application
