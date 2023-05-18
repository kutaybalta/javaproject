Travel Management System

This Java program implements a basic travel management system. It allows users to perform various operations related to employees, customers, and travel packages. The program provides a menu-based interface for users to interact with.
Features

The program offers the following features:

    Add Employee: Allows the user to add an employee to the system by providing the necessary details such as Citizen ID, name, last name, age, and position.
    List Employees: Lists all the employees currently stored in the system.
    Search Employees: Searches for an employee based on their Citizen ID.
    Add Customer: Enables the user to add a customer to the system by entering their Citizen ID, name, last name, age, and whether they have a driver's license.
    List Customers: Lists all the customers currently stored in the system.
    Search Customers: Searches for a customer based on their Citizen ID.
    Add Travel Package: Allows the user to add a travel package to the system by specifying the package ID, destination, date, duration, and price.
    List All Travel Packages: Lists all the travel packages currently stored in the system.
    Search Travel Package: Searches for a travel package based on its package ID.
    Change Travel Package Price: Modifies the price of a specific travel package.

Usage

    The program starts by displaying a menu of available operations.
    Enter the number corresponding to the operation you want to perform.
    Follow the prompts and provide the required information based on the chosen operation.
    Repeat steps 2 and 3 as desired until you enter "100" to end the program.

Note: The program performs input validation to ensure the correctness of the provided data. If invalid data is entered, appropriate error messages will be displayed, and the user will be prompted to enter valid data.
Getting Started

To run this program on your local machine, follow these steps:

    Make sure you have Java installed on your system.
    Copy the code into a file named Main.java.
    Open a command prompt or terminal window and navigate to the directory where you saved the file.
    Compile the code by executing the command: javac Main.java
    Run the program with the command: java Main

Dependencies

This program uses the following Java classes and libraries:

    java.util.ArrayList: Used to store collections of objects.
    java.util.InputMismatchException: Used to handle input mismatch exceptions.
    java.util.Scanner: Used to read user input from the console.

Limitations

    The program does not provide persistence, meaning that all data will be lost once the program is terminated.
    The program does not include advanced search functionality, such as searching by name or filtering based on specific criteria.
    Error handling is limited to input validation and basic exception handling. More advanced error handling could be implemented for production use.
