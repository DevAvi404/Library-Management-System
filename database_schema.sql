-- Library Management System - Database Setup
-- Run this in MySQL before launching the application

CREATE DATABASE IF NOT EXISTS lms;
USE lms;

-- Admin table (replaces hardcoded admin/admin login)
CREATE TABLE IF NOT EXISTS admin (
    id       VARCHAR(20)  PRIMARY KEY,
    name     VARCHAR(100) NOT NULL,
    username VARCHAR(50)  UNIQUE NOT NULL,
    email    VARCHAR(100) UNIQUE NOT NULL,
    password VARCHAR(100) NOT NULL
);

-- Insert a default admin account (change password after first login)
INSERT IGNORE INTO admin VALUES ('A001', 'Administrator', 'admin', 'admin@library.com', 'admin123');

-- Book table
CREATE TABLE IF NOT EXISTS book (
    bookID    VARCHAR(20)  PRIMARY KEY,
    name      VARCHAR(200) NOT NULL,
    publisher VARCHAR(100),
    edition   VARCHAR(50),
    price     VARCHAR(20),
    quantity  VARCHAR(10)
);

-- Student table
CREATE TABLE IF NOT EXISTS student (
    studentID   VARCHAR(20)  PRIMARY KEY,
    studentName VARCHAR(100) NOT NULL,
    department  VARCHAR(50),
    semester    VARCHAR(10),
    section     VARCHAR(5),
    email       VARCHAR(100)
);

-- Issue table
CREATE TABLE IF NOT EXISTS issue (
    bookID      VARCHAR(20),
    studentID   VARCHAR(20),
    issueDate   VARCHAR(20),
    dueDate     VARCHAR(20),
    returnBook  VARCHAR(5) DEFAULT 'No',
    retrieve    VARCHAR(5) DEFAULT 'No',
    PRIMARY KEY (bookID, studentID, issueDate),
    FOREIGN KEY (bookID)    REFERENCES book(bookID),
    FOREIGN KEY (studentID) REFERENCES student(studentID)
);
