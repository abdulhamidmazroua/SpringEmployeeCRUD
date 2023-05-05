# SpringEmployeeCRUD
Spring Employee CRUD is a basic CRUD (Create, Read, Update, Delete) application that allows you to perform CRUD operations on employees. 
This application is built with Spring Boot, Thymeleaf, and MySQL

## Prerequisites
Before you can use this application, you need to have the following installed on your machine:

- Java 20 (actually you can use java 9 or later but you'd have to update the maven pom.xml file)
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

## Authentication and Authorization
The application now supports authentication and authorization for three different users:

  - **John (username: john, password: test)**: Can only view the list of employees.
  - **Mary (username: mary, password: test123)**: Can view, add, and update employee records.
  - **Susan (username: susan, password: test1234)**: Can view, add, update, and delete employee records.
When you start the application, you will be prompted to enter your username and password. Once you have entered your credentials, you will only be able to perform the actions that your role allows.

## Usage
Once you have logged in, you can perform the following CRUD operations on employees:

  - **View employees**: If you are John, you will only be able to view the list of employees.
  - **Add employee**: If you are Mary or Susan, you can add a new employee by clicking on the "Add Employee" button and filling in the employee details in the form.
  - **Update employee**: If you are Mary or Susan, you can update an existing employee's details by clicking on the "Update" button next to their name and updating the employee details in the form.
  - **Delete employee**: If you are Susan, you can delete an existing employee by clicking on the "Delete" button.

Please note that if you try to perform an action that your role does not allow, you will be redirected to an error page. Also note that **display content by roles functionality is applied**, so if you are not authorized to do some action you want see the button for doing so (Except the AddEmployee button to let the user see the access denied page).

Thank you for using SpringEmployeeCRUD!




