Student Management System

This Java program, named Student Management System, allows users to interactively manage a list of students. Users can add new students, display information about all students, and exit the program. Each student has details such as name, GPA, credit, and date of birth.
Classes
Main

The main class that contains the main method to run the program. It uses an ArrayList to store instances of the Student class. Users can interact with the program by choosing options through the console menu.
Student

Represents a student with attributes such as name (an instance of Name), GPA, credit, and date of birth (an instance of Date). It includes methods to set and validate GPA and credit values, as well as a getAStudent method to input information about a new student.
Name

Represents the name of a person with attributes fName (first name), lName (last name), and mInitial (middle initial). It includes methods to get and set the name, ensuring proper capitalization.
Date

Represents a date with attributes day, month, and year. It includes a getDate method to input and validate the date of birth.
Methods

A utility class containing static methods for getting user choices and displaying student information. It includes getChoice to get menu choices and displayStudents to display information about all students in the ArrayList.
How to Use

Run the program (Main class).
Choose options from the menu:
Option 1: Add a new student.
Option 2: Display information about all students.
Option 3: Quit the program.
Follow the prompts to input student information.
Repeat as needed.
Choose option 3 to exit the program.

Note

GPA values must be between 0 and 5.0.
Credit values must be between 0 and 200.
Date of birth is validated for proper day-month-year combinations.

Feel free to explore and modify the code according to your needs.
