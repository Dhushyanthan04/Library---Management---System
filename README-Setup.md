# Library Management System – Setup & Structure

## 📁 Project Structure

Library-Management-System/  
├── pom.xml  
├── src/  
│   └── main/  
│       ├── java/com/library/  
│       │   ├── controller/  
│       │   ├── model/  
│       │   ├── repository/  
│       │   └── service/  
│       └── resources/  
│           └── application.properties  
└── README.md  

---

## ⚡ How to Run

1. Clone the repository:
    2. Open in IntelliJ / Eclipse  
3. Set MySQL username & password in  
   application.properties  
4. Run LibraryApplication.java  
5. Test APIs using Postman  

---

## 📡 API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | /books | Get all books |
| POST | /books | Add a book |
| GET | /users | Get all users |
| POST | /users | Add a user |
| POST | /borrow?userId=&bookId= | Borrow a book |

---

## 🎯 Why this project?

This project shows:

- Spring Boot backend skills  
- MySQL + JPA usage  
- REST API design  
- Postman testing  
- Clean layered architecture  

This project demonstrates core backend development skills using Spring Boot, 
REST APIs, and MySQL, 
suitable for entry-level Java backend developer roles.
