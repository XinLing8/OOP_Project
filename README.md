# OOP_Project

# 🏢 APU Hostel Management Fees Payment System (AHMFPS)

**Module:** Introduction to Object Oriented Programming (IOOP)  
**Target Platform:** Java (JDK 11+)  

---

## 📘 Project Overview

The **APU Hostel Management Fees Payment System (AHMFPS)** is a desktop application designed to streamline fee collection, account management, and user registration for university hostel operations. 

Built strictly following Object-Oriented Programming (OOP) principles in Java, the system features a role-based architecture for Managers, Office Staff, and Residents. In compliance with project constraints, the system operates without external database management systems (such as MySQL or Oracle), relying entirely on structured flat-file storage (character files) for persistent data handling.

---

## 👥 Group Members

This assignment was completed collaboratively by:
* **Sim Tian** (TP077056)
* **Yap Xin Ling** (TP077224)

---

## 🔑 Key Features & Role-Based Access Control

The system implements strict authentication and authorization protocols to deliver tailored functionalities based on user roles:

### 👨‍💼 Hostel Management Manager
* **User Management:** Oversee system registrations, assign user roles, and enforce access control.
* **Fee Configuration:** Define, adjust, and fix baseline hostel management fee rates.

### 📑 Office Staff
* **Payment Processing:** Assist residents in processing fee payments.
* **Receipt Generation:** Automatically issue official payment receipts upon transaction completion.
* **Registration Assistance:** Register new hostel residents into the system.

### 🏠 Hostel Residents
* **Account Management:** Update individual personal details and account settings.
* **Payment History:** View personal historical transaction records and fee statuses.

---

## 🛠️ Technical Architecture & OOP Concepts

The application demonstrates core and advanced Java Object-Oriented Programming concepts:

* **Encapsulation:** Enforcing data security across model classes (e.g., `User`, `Resident`, `Payment`, `Fee`) using private attributes with standardized getters and setters.
* **Inheritance:** Utilizing a base `User` class extended by specialized role classes (`Manager`, `Staff`, `Resident`) to eliminate code redundancy.
* **Polymorphism (Overriding & Overloading):** Implementing specialized payment handling, receipt rendering, and validation methods tailored to specific context execution.
* **Interfaces & Abstract Classes:** Defining strict operational contracts for authentication, file parsing, and display rendering.
* **Flat-File Data Persistence:** Utilizing Java File I/O (`BufferedReader`/`BufferedWriter`, `Scanner`, `FileWriter`) to read, write, and manipulate character-based `.txt` data files.
* **Exception Handling & Input Validation:** Comprehensive `try-catch` blocks and input sanitization to catch logical errors, invalid data entries, and runtime file handling issues.

---

## 🗂️ Project Documentation Outline

The complete documentation submitted alongside the source code includes:

1. **Cover Page & Table of Contents**
2. **System Assumptions & Boundaries**
3. **Flowcharts:** Program flow, authentication logic, and payment processing steps.
4. **Sample Execution & UI Outputs:** Screen captures illustrating output windows for each user role.
5. **Object-Oriented Code Analysis:** Detailed discussions on class definitions, inheritance hierarchies, and Java features utilized.
6. **Additional Features:** Enhanced input validation algorithms and security routines.
7. **References:** Formatted according to APA standards.

---

## 📄 Academic Disclaimer

This project is an academic submission for the Diploma in ICT program at Asia Pacific University of Technology & Innovation (APU). All rights reserved.
