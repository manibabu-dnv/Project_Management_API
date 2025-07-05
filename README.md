# 📦 Project Management API

A simple Spring Boot REST API to manage products, built for learning and demonstration purposes.

## 🚀 Features

- Create, Read, Update, and Delete (CRUD) operations for products
- RESTful API architecture
- Organized into controller, service, and repository layers
- Maven-based build system

## 🧱 Tech Stack

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- Maven

## 📁 Project Structure

demo/<br>
├── src/<br>
│ ├── main/<br>
│ │ ├── java/<br>
│ │ │ ├── com.example.demo/ # Main app and model<br>
│ │ │ ├── controllayer/ # Controller classes<br>
│ │ │ ├── Service/ # Service layer<br>
│ │ │ └── Repositry/ # Repository interfaces<br>
│ │ └── resources/<br>
│ │ └── application.properties # App configuration<br>
│ └── test/<br>
│ └── java/com.example.demo/ # Test class<br>
├── pom.xml # Maven configuration<be>


## 📡 API Endpoints


| Method | Endpoint        | Description         |
|--------|-----------------|---------------------|
| GET    | `/products`     | Get all products    |
| POST   | `/products`     | Create a new product |
| PUT    | `/products/{id}`| Update a product     |
| DELETE | `/products/{id}`| Delete a product     |


## ⚙️ Getting Started

1. **Clone the repository**
   ```bash
   git clone https://github.com/manibabu-dnv/Project_Management_API.git

2. **Navigate into the project**
   ```bash
   cd ProjectManagementAPI-main/demo

3. **Run the application**
   ```bash
   ./mvnw spring-boot:run

4. **Access the API**
   ```bash
   http://localhost:8080/products

5. **Testing**
   ```bash
   ./mvnw test

