# Student Management System (Java JDBC)

## 📌 Description

This is a console-based Student Management System built using Java and JDBC.
It performs full CRUD operations (Create, Read, Update, Delete) on a MySQL database.

## 🛠 Technologies Used

- Java
- JDBC
- MySQL
- OOP Concepts

## ✨ Features

- Add new student
- View all students
- Update student details
- Delete student
- Secure database access using PreparedStatement

## 🗄 Database Table

```sql
CREATE TABLE St_info (
    St_Id INT PRIMARY KEY,
    St_Name VARCHAR(50),
    marks INT,
    city VARCHAR(50)
);
```

## ▶ How to Run

1. Create MySQL database `Student_Management_System`
2. Create table `St_info`
3. Set environment variable `DB_PASS`
4. Run `App.java`
