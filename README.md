# PalindromeChecker
Palindrome Checker is a Java EE Enterprise application that validates whether a given number is a palindrome and stores the results in a database using Java Persistence API (JPA). The system records employee information, a unique identifier, the palindrome number, and the date the record was created.

# Palindrome Checker

## Overview

Palindrome Checker is a Java Enterprise Edition (Java EE) application that determines whether a given integer is a palindrome. In addition to performing palindrome validation, the application stores employee details and the checked number in a database for future reference.

The project demonstrates the use of Enterprise JavaBeans (EJB), Java Persistence API (JPA), and object-oriented programming principles to build a scalable enterprise application.

---

## Features

- Check whether a number is a palindrome
- Store employee information
- Generate and store records in a relational database
- Automatically record the creation date of each entry
- Perform CRUD (Create, Read, Update, Delete) operations
- Enterprise Java architecture using EJB
- Database persistence using JPA

---

## Technologies Used

- Java EE
- Enterprise JavaBeans (EJB)
- Java Persistence API (JPA)
- NetBeans IDE
- Apache Ant
- GlassFish / Payara Server
- MySQL (or any JPA-supported database)

---

## Project Structure

```
PalindromeChecker/
│
├── src/
│   ├── conf/
│   │   └── persistence.xml
│   │
│   └── java/
│       └── za/
│           └── ac/
│               └── tut/
│                   └── entity/
│                       ├── AbstractFacade.java
│                       ├── Palindrome.java
│                       ├── PalindromeFacade.java
│                       └── PalindromeFacadeLocal.java
│
├── build/
├── dist/
├── nbproject/
└── build.xml
```

---

## Entity Details

### Palindrome

The main entity stores the following information:

- Employee Name
- Unique ID
- Palindrome Number
- Creation Date

It also contains a built-in method that checks whether the supplied number is a palindrome.

---

## How the Palindrome Algorithm Works

The application:

1. Accepts an integer.
2. Reverses the digits.
3. Compares the reversed number with the original number.
4. Returns **true** if both values are equal; otherwise returns **false**.

Example:

| Number | Result |
|---------|--------|
| 121 | Palindrome |
| 1221 | Palindrome |
| 1331 | Palindrome |
| 123 | Not a Palindrome |
| 567 | Not a Palindrome |

---

## Database

The project uses JPA for persistence.

Stored information includes:

- Employee Name
- Unique ID
- Palindrome Number
- Creation Timestamp

---

## Requirements

- Java JDK 8 or later
- NetBeans IDE
- GlassFish or Payara Server
- MySQL or another supported relational database

---

## Installation

1. Clone the repository.

```bash
git clone https://github.com/yourusername/PalindromeChecker.git
```

2. Open the project in NetBeans.

3. Configure the database connection in `persistence.xml`.

4. Build the project.

5. Deploy to GlassFish or Payara.

6. Run the application.

---

## Learning Outcomes

This project demonstrates:

- Java Enterprise development
- Enterprise JavaBeans (EJB)
- Java Persistence API (JPA)
- Entity modelling
- Object-Oriented Programming (OOP)
- Database persistence
- CRUD operations
- Enterprise application architecture

---

## Future Improvements

- Web-based user interface
- REST API integration
- Search and filtering
- Validation for user input
- Reporting and analytics
- User authentication and authorization
- Export records to PDF or Excel

---

## Author

**Kgotso Jonas**

Diploma in Computer Science

Software Developer | Java Developer | Database Enthusiast | Cybersecurity Enthusiast

---

## License

This project is intended for educational purposes and demonstrates enterprise software development using Java EE technologies.
