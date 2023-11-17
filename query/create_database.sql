CREATE DATABASE IF NOT EXISTS atmsystem;

-- DROP DATABASE atmsystem; 
USE atmsystem;



CREATE TABLE IF NOT EXISTS Customer(
	customerID INT(11) NOT NULL AUTO_INCREMENT,
    firstName VARCHAR(45),
    middleName VARCHAR(45),
    lastName VARCHAR(45),
    phoneNumber VARCHAR(20),
    emailAddress VARCHAR(45),
    billingAddress VARCHAR(100),
    primary key(customerID)
);

CREATE TABLE IF NOT EXISTS AccountTable (
	accountID INT(11) NOT NULL AUTO_INCREMENT,
    customerID INT(11) NOT NULL,
    dateCreated DATE,
    FOREIGN KEY(customerID) REFERENCES Customer(customerID),
    PRIMARY KEY(accountID, customerID)
 );
 
CREATE TABLE IF NOT EXISTS Card (
	cardNumber VARCHAR(16) UNIQUE,
    accountID INT(11),
    isCredit BOOLEAN,
    expirationDate DATE,
    cvvNumber INT(3),
    fourDigitPin INT(4),
    lockStatus BOOL,
    FOREIGN KEY(accountID) REFERENCES AccountTable(accountID),
    PRIMARY KEY(cardNumber)
 );

CREATE TABLE IF NOT EXISTS Saving (
	accountID INT(11) ,
    savingBalance DECIMAL(65,2),
    interestRate DECIMAL(3,2),
    FOREIGN KEY(accountID) REFERENCES AccountTable(accountID),
    PRIMARY KEY(accountID)
 );
 
CREATE TABLE IF NOT EXISTS Checking (
	accountID INT(11),
    checkingBalance DECIMAL(65,2),
    FOREIGN KEY(accountID) REFERENCES AccountTable(accountID),
    PRIMARY KEY(accountID)
 );
 
CREATE TABLE IF NOT EXISTS Credit (
	accountID INT(11),
	creditLimit DECIMAL(65,2),
    creditUsed DECIMAL(65,2),
    withdrawalAmount DECIMAL(65,2),
    FOREIGN KEY(accountID) REFERENCES AccountTable(accountID),
    PRIMARY KEY(accountID)
 );
 
CREATE TABLE IF NOT EXISTS ATM (
	atmID INT(6) NOT NULL AUTO_INCREMENT,
    branch VARCHAR(45),
    oneDollarQuantity INT(10),
    twoDollarQuantity INT(10),
    fiveDollarQuantity INT(10),
    tenDollarQuantity INT(10),
    twentyDollarQuantity INT(10),
    fiftyDollarQuantity INT(10),
    hundredDollarQuantity INT(10),
    PRIMARY KEY(atmID)
 );

CREATE TABLE IF NOT EXISTS TransactionTable (
	transactionID INT(10) NOT NULL AUTO_INCREMENT,
    accountID INT(11),
    atmID INT(6),
    transactionDate DATETIME,
    transactionType VARCHAR(45),
    transactionStatus VARCHAR(45),
    FOREIGN KEY(accountID) REFERENCES AccountTable(accountID),
    FOREIGN KEY(atmID) REFERENCES ATM(atmID),
    PRIMARY KEY(transactionID)
 );
 
 