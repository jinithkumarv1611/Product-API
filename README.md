# 🛍️ ProductAPI

A RESTful API built using **Spring Boot** for managing product information. This project demonstrates CRUD (Create, Read, Update, Delete) operations using Spring Boot, Spring Data JPA, Hibernate ORM, Maven, and MySQL.

---

## 📖 Project Description

ProductAPI is a backend application that allows users to manage product details through REST APIs. It follows a layered architecture using Controller, Service, Repository, and Entity classes.

---

## ✨ Features

- ➕ Add a new product
- 📋 View all products
- 🔍 Get product by ID
- ✏️ Update product details
- ❌ Delete a product
- 💾 Store data in MySQL database
- 🔗 RESTful API implementation

---

## 🛠️ Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- Hibernate ORM
- MySQL
- Maven
- IntelliJ IDEA
- Postman

---

## 📂 Project Structure

```
ProductAPI
│── src
│   ├── main
│   │   ├── java
│   │   │   ├── controller
│   │   │   ├── service
│   │   │   ├── repository
│   │   │   ├── entity
│   │   │   └── ProductApiApplication.java
│   │   └── resources
│   │       ├── application.properties
│   │       └── static
│   └── test
│
├── pom.xml
├── mvnw
├── README.md
└── .gitignore
```

---

## ⚙️ Prerequisites

Before running this project, install:

- Java JDK 17 or later
- Apache Maven
- MySQL Server
- IntelliJ IDEA

---

## 🚀 Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/<your-github-username>/ProductAPI.git
```

### 2. Open the Project

Open the project using IntelliJ IDEA.

### 3. Configure MySQL

Update your `application.properties` file.

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/productdb
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### 4. Build the Project

```bash
mvn clean install
```

### 5. Run the Application

Run the Spring Boot application from IntelliJ IDEA or using:

```bash
mvn spring-boot:run
```

---

## 📡 API Endpoints

| HTTP Method | Endpoint | Description |
|-------------|----------|-------------|
| GET | `/products` | Get all products |
| GET | `/products/{id}` | Get product by ID |
| POST | `/products` | Add a new product |
| PUT | `/products/{id}` | Update a product |
| DELETE | `/products/{id}` | Delete a product |

---

## 🧪 API Testing

You can test the REST APIs using:

- Postman
- Thunder Client (VS Code)

---

## 📚 Concepts Used

- REST API Development
- Spring Boot
- Dependency Injection
- Spring Data JPA
- Hibernate ORM
- CRUD Operations
- Maven Build Tool
- MySQL Database

---

## 👩‍💻 Author

**JINITH KUMAR V**

B.E. Computer Science and Engineering

Learning Spring Boot and Backend Development

---

## ⭐ Future Improvements

- User Authentication
- Product Search
- Pagination
- Exception Handling
- API Validation
- Swagger Documentation

---

## 📄 License

This project is developed for learning and educational purposes.