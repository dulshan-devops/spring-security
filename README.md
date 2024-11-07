# Employee Management System - Spring Boot Security with JWT

This project is a basic **Employee Management System** API built with **Spring Boot**. It demonstrates secure authentication and authorization using **Spring Security** and **JWT (JSON Web Tokens)**, with additional OAuth2 integration for Google and GitHub logins.

## Features
- **User Authentication** with JWT for secure, stateless sessions
- **Role-Based Authorization** to manage user access levels
- **Bcrypt Password Encoding** for encrypted password storage
- **OAuth2 Login** using Google and GitHub
- **Spring Security Configuration** for customizable security policies

## Tech Stack
- **Java**
- **Spring Boot**
- **Spring Security** (JWT and OAuth2)
- **MySQL Database**

## Endpoints
### Authentication Endpoints
- `POST /login` - Login and receive a JWT token
- `POST /register` - Register a new user

### Employee Endpoints (Protected)
- `GET /leave-types` - List all employees
- `POST /leave-types` - Add a new employee
- `GET /leave-types/{id}` - Get employee by ID
- `PUT /leave-types/{id}` - Update employee by ID
- `DELETE /leave-types/{id}` - Delete employee by ID
