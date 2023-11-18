## Employee Manager
Employee Manager is a web application for managing employee records. The project is divided into two parts: the backend, built with Spring Boot and using MySQL as the database, and the frontend, built with Angular.

### Employee Manager Backend

The backend of the Employee Manager project is built with Spring Boot and uses MySQL as the database.
The backend handles the logic for managing employee data, providing RESTful APIs for CRUD operations.

#### Setup

1. Clone the backend repository:
```git clone https://github.com/HadilEltaif/EmployeeManagerBackEnd.git ```

2. Configure the MySQL database:<br>
. Open src/main/resources/application.properties.<br>
. Update the following properties with your MySQL database information: <br>
 ```
    spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
    spring.datasource.username=your_username
    spring.datasource.password=your_password
 ```

3. Build and run the Spring Boot application:
```
./mvnw spring-boot:run
```
The backend server will start on http://localhost:8081.

#### Usage
The backend provides RESTful APIs for managing employees. <br> 
- Use the provided features to manage employees: <br> 
    -Get All Employees: View a list of all employees. <br> 
    -Add Employee: Add a new employee to the system. <br> 
    -Edit Employee Profile: Update the details of an existing employee. <br> 
    -Delete Employee: Remove an employee from the system. <br> 
    -Search Employee: Search for an employee based on specified criteria. <br>

- It is meant to be consumed by the frontend application. <br>
##### Technologies Used
**Backend**: Spring Boot, MySQL.<br> 
**Fronend** Angular.<br> 



