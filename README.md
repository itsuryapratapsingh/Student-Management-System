# Student-Management-System

This Java program implements a simple Student Management System through a console-based application. It allows users to add students and courses, as well as display lists of students and courses. The program runs in an infinite loop until the user chooses to exit.

**Key Components and Functions:**

**Student Class:**

Represents a student with attributes such as student ID, name, and age.
Provides a constructor to initialize student attributes and getters for accessing them.

**Course Class:**

Represents a course with attributes such as course ID and name.
Provides a constructor to initialize course attributes and getters for accessing them.

**StudentManagementSystem Class:**

Manages lists of students and courses using ArrayLists.
Provides methods to add students and courses to the respective lists.
Includes methods to display the list of students and courses.

**StudentManagementSystemApp Class:**

Contains the main method for executing the program.
Uses a Scanner to take user input and a loop to repeatedly display a menu of options.
Options include adding a student, adding a course, displaying students, displaying courses, and exiting the program.
Utilizes switch-case statements to perform actions based on user input.

**Program Workflow:**

User is presented with a menu to choose from options.
Options include adding a student, adding a course, displaying students, displaying courses, and exiting.
User input is processed, and corresponding actions are performed.
For adding students/courses, user is prompted for relevant details.
Display options show the current list of students or courses.
The program continues to run until the user chooses to exit.
