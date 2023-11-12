CREATE database ATMSYSTEM;
USE ATMSYSTEM;

 --DROP database atmsystem;


 create table Customer (
	customerID INT(11) not null auto_increment,
    firstName VARCHAR(45),
    middleName VARCHAR(45),
    lastName VARCHAR(45),
    phoneNumber VARCHAR(10),
    emailAddress VARCHAR(45),
    billingAddress VARCHAR(100),
    primary key(customerID)
 );

 create table AccountTable (
	accountID INT(11) not null auto_increment,
    customerID INT(11) not null,
    dateCreated DATE,
    foreign key(customerID) references Customer(customerID),
    primary key(accountID, customerID)
 );

 create table Saving (
	accountID INT(11),
    savingBalance DECIMAL(65,2),
    interestRate DECIMAL(3,2),
    foreign key(accountID) references AccountTable(accountID),
    primary key(accountID)
 );

 create table Checking (
	accountID INT(11),
    checkingBalance DECIMAL(65,2),
    foreign key(accountID) references AccountTable(accountID),
    primary key(accountID)
 );

 create table Credit (
	accountID INT(11),
	creditLimit DECIMAL(65,2),
    creditUsed DECIMAL(65,2),
    withdrawalAmount DECIMAL(65,2),
    foreign key(accountID) references AccountTable(accountID),
    primary key(accountID)
 );

 create table Card (
	cardNumber INT(16),
    accountID INT(11),
    expirationDate DATE,
    cvvNumber INT(3),
    fourDigitPin INT(4),
    lockStatus BOOL,
    foreign key(accountID) references AccountTable(accountID),
    primary key(cardNumber)
 );

 create table ATMMachine (
	atmID INT(6) not null auto_increment,
    branch VARCHAR(45),
    oneDollarQuantity INT(10),
    twoDollarQuantity INT(10),
    fiveDollarQuantity INT(10),
    tenDollarQuantity INT(10),
    twentyDollarQuantity INT(10),
    fiftyDollarQuantity INT(10),
    hundredDollarQuantity INT(10),
    primary key(atmID)
 );

 create table TransactionTable (
	transactionID INT(10) not null auto_increment,
    accountID INT(11),
    atmID INT(6),
    transactionDate DATETIME,
    transactionType VARCHAR(45),
    transactionStatus VARCHAR(45),
    foreign key(accountID) references AccountTable(accountID),
    foreign key(atmID) references ATMMachine(atmID),
    primary key(transactionID)
 );
