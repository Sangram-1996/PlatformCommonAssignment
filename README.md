# REST API for Student Management System
- Developed this REST API for a Student Management System Application. This API performs all the fundamental CRUD operations of any Student Management System with user validation at every step.
## Tech Stack
- Java
- Spring Framework
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Postman
- Swagger
## Modules
- SignUp, Login, Logout Module
- Admin Module
- Student Module
- Course Module
### Admin Features:
* Admin can add students, courses to main database
* Admin can assign courses to students
* Admin can get the students by student name or by course name.
### Student Features:
* Update details such as (email, mobile number , parents name,address)
* Can search for courses he/she assigned
* Can leave a course
## Installation & Run
- Before running the API server, you should update the database config inside the application.properties file.
- Update the port number, username and password as per your local database config.
    server.port=8886

    spring.datasource.url=jdbc:mysql://localhost:3306/student
    spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
    spring.datasource.username=root
    spring.datasource.password=root

API Root Endpoint
https://localhost:8886/

Swagger Api
http://localhost:8886/swagger-ui/



# ER DIAGRAM OF Student Management System

![ER Diagram of Student Management System](https://user-images.githubusercontent.com/101380040/202918247-25c9292e-9721-4d3c-aff2-97c7bf9bedbb.png)

