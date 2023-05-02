# SpringEmployeeCRUD
Spring Employee CRUD is a basic CRUD (Create, Read, Update, Delete) application that allows you to perform CRUD operations on employees. 
This application is built with Spring Boot, Thymeleaf, and MySQL

## Prerequisites
Before you can use this application, you need to have the following installed on your machine:

- Java 8 or later
- Maven
- MySQL

## Installation
1. Clone the repository using the following command:
  `git clone https://github.com/abdulhamidmazroua/SpringEmployeeCRUD.git`
  
2. Navigate to the project directory:
  `cd SpringEmployeeCRUD`
  
3. Update the database credentials in the `application.properties' file to fit your own database:
    - `spring.datasource.url=jdbc:mysql://localhost:3306/employee_db`
    - `spring.datasource.username=<your_username>`
    - `spring.datasource.password=<your_password>`

4. Go to your MySQL and execute the `employee-sql-script.sql`
  
5. Build the project using Maven:
  `mvn clean install`
 
6. Run the application using the following command:
  `java -jar target/SpringEmployeeCRUD-0.0.1-SNAPSHOT.jar`

7. Open your web browser and navigate to `http://localhost:8080` to access the application.

## Usage

Once you have the application running, you can perform CRUD operations on employees. You can add new employees, view existing employees, update employee information, and delete employees.
