# SQL Automation Framework

## 📌 Overview
This is a Maven-based SQL Automation Framework built using Java, TestNG, and H2 Database.
It validates SQL queries and generates professional HTML reports using Extent Reports.

---

## 🛠 Tech Stack

- Java 17
- Maven
- TestNG
- H2 In-Memory Database
- Extent Reports
- Git

---

## 📂 Project Structure

sql-automation-framework
│
├── pom.xml
├── testng.xml
├── .gitignore
│
├── src
│ ├── main
│ │ ├── java
│ │ │ ├── config
│ │ │ │ └── ConfigReader.java
│ │ │ └── database
│ │ │ ├── DBConnection.java
│ │ │ └── QueryExecutor.java
│ │ └── resources
│ │ └── config.properties
│ │
│ └── test
│ └── java
│ ├── reporting
│ │ ├── ExtentManager.java
│ │ └── TestListener.java
│ └── tests
│ ├── SampleTest.java
│ ├── DatabaseTest.java
│ └── UserQueryTest.java
│
└── target

[//]: # (sql-automation-framework)

[//]: # (│)

[//]: # (├── pom.xml)

[//]: # (├── testng.xml)

[//]: # (├── .gitignore)

[//]: # (│)

[//]: # (├── src/)

[//]: # (│ ├── main/)

[//]: # (│ │ ├── java/)

[//]: # (│ │ │ ├── config/)

[//]: # (│ │ │ └── database/)

[//]: # (│ │ └── resources/)

[//]: # (│ │)

[//]: # (│ └── test/)

[//]: # (│ └── java/)

[//]: # (│ ├── reporting/)

[//]: # (│ └── tests/)

[//]: # (│)

[//]: # (└── target/)


---

## 🚀 How To Run

Clone the repository and run:

mvn clean test


---

## 📊 Test Report

After execution, the Extent HTML report is generated at:

target/extent-report.html


Open it in a browser to view detailed test results.

---

## 🧪 Implemented Test Cases

- Validate user count
- Validate salary sum
- Validate user existence (DataProvider based)
- Lifecycle-managed setup and teardown
- Suite execution via testng.xml

---

## 🧠 Key Concepts Used

- Maven Lifecycle
- Dependency Management
- JDBC Architecture
- Separation of Concerns
- TestNG DataProvider
- TestNG Listeners
- Extent Reporting Integration

---

## 👨‍💻 Author

Kiran Kumar Sharma


