# 📚 Library Management System

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white)
![NetBeans](https://img.shields.io/badge/NetBeans-1B6AC6?style=for-the-badge&logo=apache-netbeans-ide&logoColor=white)
![XAMPP](https://img.shields.io/badge/XAMPP-FB7A24?style=for-the-badge&logo=xampp&logoColor=white)
![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Active-brightgreen?style=for-the-badge)

A desktop-based Library Management System developed in Java (Swing) with MySQL database integration. Supports admin authentication, book & student records, issue/return tracking, and live statistics.

---

## 🖥️ Screenshots

> _Add screenshots of your app here after uploading_

---

## ✨ Features

- 🔐 **Admin Authentication** — Secure login, signup, and forgot password
- 📖 **Book Management** — Add and track books with ID, publisher, edition, price, and quantity
- 🎓 **Student Management** — Register students with department, semester, and section
- 📋 **Issue Books** — Issue books to students with issue date and due date
- 🔄 **Return Books** — Search and process book returns
- 📦 **Retrieve Books** — Mark physically retrieved books
- 🔍 **Search** — Search issue records by Student ID or Book ID
- 📊 **Statistics** — Live dashboard showing issued, returned, and retrieved books

---

## 🛠️ Tech Stack

| Layer | Technology |
|---|---|
| Language | Java (JDK 8+) |
| UI Framework | Java Swing |
| IDE | NetBeans |
| Database | MySQL (via XAMPP) |
| DB Connection | MySQL Connector/J 8.4.0 |
| Build Tool | Apache Ant |

---

## 🗄️ Database Schema

The app uses a MySQL database named `lms` with 4 tables:

```
admin     → stores admin accounts
book      → stores book records
student   → stores student records
issue     → stores book issue/return/retrieve records
```

---

## ⚙️ Setup & Installation

### Prerequisites
- [Java JDK 8 or higher](https://www.oracle.com/java/technologies/downloads/)
- [NetBeans IDE](https://netbeans.apache.org/)
- [XAMPP](https://www.apachefriends.org/) (for MySQL)
- [MySQL Connector/J 8.4.0](https://repo1.maven.org/maven2/com/mysql/mysql-connector-j/8.4.0/mysql-connector-j-8.4.0.jar)

### 1. Clone the repository
```bash
git clone https://github.com/DevAvi404/Library-Management-System.git
```

### 2. Set up the database
- Start **XAMPP** and make sure **MySQL** is running
- Open **phpMyAdmin** → `http://localhost/phpmyadmin`
- Create a new database named `lms`
- Click the **SQL** tab and run the contents of `database_schema.sql`

### 3. Configure database connection
Open `src/Preojct/ConnectionProvider.java` and update if needed:
```java
private static final String URL      = "jdbc:mysql://localhost:3306/lms";
private static final String USER     = "root";
private static final String PASSWORD = "";  // your MySQL password
```

### 4. Add MySQL Connector JAR
- Download [mysql-connector-j-8.4.0.jar](https://repo1.maven.org/maven2/com/mysql/mysql-connector-j/8.4.0/mysql-connector-j-8.4.0.jar)
- In NetBeans: right-click project → **Properties** → **Libraries** → **Add JAR/Folder**
- Select the downloaded JAR → **OK**

### 5. Run the project
- Open the project in NetBeans
- Press **F6** or click **Run**

---

## 🔑 Default Login

| Username | Password |
|---|---|
| `admin` | `admin123` |

> ⚠️ Change the default password after first login using the **Forgot Password** feature.

---

## 📁 Project Structure

```
Library-Management-System/
├── src/
│   ├── Preojct/
│   │   └── ConnectionProvider.java   # Database connection
│   ├── login.java                    # Login screen
│   ├── signup.java                   # New account registration
│   ├── forgot.java                   # Password reset
│   ├── home.java                     # Main dashboard
│   ├── newBook.java                  # Add new book
│   ├── newStudent.java               # Add new student
│   ├── issueBook.java                # Issue book to student
│   ├── returnBook.java               # Return a book
│   ├── retrieveBook.java             # Retrieve a book
│   ├── search.java                   # Search records
│   ├── statistic.java                # Statistics dashboard
│   └── icons/                        # UI icons
├── database_schema.sql               # Database setup script
├── .gitignore                        # Git ignore rules
└── README.md
```

---

## 🤝 Contributing

Pull requests are welcome! For major changes, please open an issue first to discuss what you would like to change.

---

## 📄 License

This project is open source and available under the [MIT License](LICENSE).

---

## 👤 Author

**Avishek Paul**
- GitHub: [varVoid](https://github.com/DevAvi404)
