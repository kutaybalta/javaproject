# Travel Agency Management System

The Travel Agency Management System is a terminal based Java program that allows users to manage employees, customers, and travel packages for a travel agency. It provides a user-friendly menu-driven interface for performing various operations. This README file provides detailed information on how to run the program, its features, and usage instructions.

## Prerequisites

To run this program, you need to have Java installed on your system. Make sure you have a compatible Java Development Kit (JDK) installed.

## Getting Started

1. Clone the repository to your local machine.
2. Open the command prompt or terminal and navigate to the directory where you saved the Java file.

## Running the Program

1. Compile the Java file by executing the following command:

   ```shell
   javac Main.java
   ```

2. Run the compiled program using the following command:

   ```shell
   java Main
   ```

## Features and Usage

The Travel Agency Management System provides the following features:

### 1. Add Employee

To add a new employee to the system, select option 1 from the menu. The program will prompt you to enter the employee's details, including a 7-digit Citizen ID, name, last name, age, and position.

### 2. List Employees

To display a list of all employees, select option 2 from the menu. The program will show the details of each employee stored in the system.

### 3. Search Employees

To search for a specific employee by their Citizen ID, select option 3 from the menu. Enter the Citizen ID when prompted, and the program will display the details of the employee if found.

### 4. Add Customer

To add a new customer to the system, select option 4 from the menu. You will be asked to enter the customer's details, including a 7-digit Citizen ID, name, last name, age, and whether they have a driver's license.

### 5. List Customers

To view a list of all customers, select option 5 from the menu. The program will show the details of each customer stored in the system.

### 6. Search Customers

To search for a specific customer by their Citizen ID, choose option 6 from the menu. Enter the Citizen ID when prompted, and the program will display the details of the customer if found.

### 7. Add Travel Package

To add a new travel package to the system, select option 7 from the menu. You will be prompted to enter the package ID, destination, date (in the format DD/MM/YYYY), duration in days, and price.

### 8. List All Travel Packages

To view a list of all travel packages, select option 8 from the menu. The program will display the details of each travel package stored in the system.

### 9. Search Travel Package

To search for a specific travel package by its package ID, select option 9 from the menu. Enter the package ID when prompted, and the program will display the details of the travel package if found.

### 10. Change Travel Package Price

To modify the price of a travel package, choose option 10 from the menu. You will be asked to enter the package ID of the travel package you want to modify, as well as the new price.

### 11. Add Travel Package to Customer

To assign a travel package to a customer, select option 11 from the menu. Enter the package ID and the Citizen ID of the customer when prompted. The program will associate the travel package with the customer.

### 12. List User's All Travel Packages

To view all travel packages associated with a specific customer, choose option 12 from the menu. Enter the

 Citizen ID of the customer when prompted, and the program will display the details of all the travel packages assigned to that customer.

### 100. End the program

To terminate the program, select option 100 from the menu. The program will exit gracefully.

## Note

- When entering Citizen IDs, make sure to input a 7-digit number.
- Date inputs should be in the format DD/MM/YYYY.

Please note that this program is a basic implementation and does not include error handling for all possible scenarios. It aims to provide a functional demonstration of a travel agency management system. You can explore the program and perform various operations using the menu provided.
