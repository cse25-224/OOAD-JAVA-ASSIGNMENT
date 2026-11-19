CREATE TABLE Customer (
    CustomerID INTEGER PRIMARY KEY,
    FirstName VARCHAR(50),
    LastName VARCHAR(50),
    Phone VARCHAR(20),
    Address VARCHAR(100)
);

CREATE TABLE Account (
    AccountID INTEGER PRIMARY KEY,
    CustomerID INTEGER,
    AccountType VARCHAR(20),
    Balance DOUBLE,
    FOREIGN KEY (CustomerID)
    REFERENCES Customer(CustomerID)
);

CREATE TABLE TransactionTable (
    TransactionID INTEGER PRIMARY KEY,
    AccountID INTEGER,
    TransactionType VARCHAR(20),
    Amount DOUBLE,
    TransactionDate DATE,
    FOREIGN KEY (AccountID)
    REFERENCES Account(AccountID)
);