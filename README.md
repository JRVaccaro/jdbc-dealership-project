# JDBC-Dealership-Project 🚗

## Description of the Project

This is a simple Java console application designed to help a car dealership manage its vehicle inventory. It allows users to:

- Search for vehicles by price range, make/model, year, color, mileage, or type

- View the full inventory

- Add new vehicles to the inventory

- Remove vehicles when they are sold

The application uses a MySQL database to store dealership and vehicle data, loading and updating records through SQL queries

## Interesting Code Snippet
- statement.setDate(3, java.sql.Date.valueOf(leaseContract.getLeaseStart()));
- statement.setDate(4, java.sql.Date.valueOf(leaseContract.getLeaseEnd()));

These lines convert LocalDate objects (used in Java) into java.sql.Date so they can be stored in a SQL database. This was something I had to research and learn on my own during the project.

## User Stories

- As a user, I want to add vehicles to the inventory so they can be sold or leased.
- As a user, I want to remove vehicles from the inventory so that it keeps the inventory UTD.
- As a user, I want to add a vehicle to the inventory so it can be listed for lease.
- As a user, I want to save lease details, so that the lease agreement is stored.
- As a user, I want to add a sales contract so that vehicle sales are properly recorded.

## Setup

- Main menu Options
1. Search vehicles
2. Add a vehicle
3. Add a contract
4. Remove a vehicle
5. Exit

- Selecting search vehicles shows a submenu with these options
1. By price range
2. By make/model
3. By year range
4. By color
5. By mileage range
6. By type
7. Back to Main Menu

### Prerequisites
- IntelliJ IDEA: Ensure you have IntelliJ IDEA installed, which you can download from [here](https://www.jetbrains.com/idea/download/).
- Java SDK: Make sure Java SDK is installed and configured in IntelliJ.

### Running the Application in IntelliJ

Follow these steps to get your application running within IntelliJ IDEA:

1. Open IntelliJ IDEA.
2. Select "Open" and navigate to the directory where you cloned or downloaded the project.
3. After the project opens, wait for IntelliJ to index the files and set up the project.
4. Find the main class with the `public static void main(String[] args)` method.
5. Right-click on the file and select 'Run 'YourMainClassName.main()'' to start the application.

## Technologies Used
- Java 17
- Intellij IDEA
- SQL Workbench

## Demo
- ![jdbc gif - Made with Clipchamp.gif](Demo%20Gif/jdbc%20gif%20-%20Made%20with%20Clipchamp.gif)

## Future Work
- Improve error messages
- Save more data to the database
- Create a nicer menu

## Resources
- https://mkyong.com/jdbc/how-to-insert-date-value-in-preparedstatement/
- https://www.baeldung.com/java-convert-localdate-sql-date
- https://github.com/RayMaroun


## Team Members
- Julianna Vaccaro: Developed this project as part of a Java programming course to apply concepts such as JDBC database access, user input handling, object-oriented design, and menu-driven console applications.

## Thanks

- Thank you to my instructor, Raymond, for providing the class diagram and for your continuous support and guidance throughout the project.
- Thank you to my peers for always being willing to listen and support me when I needed it.
 