# CodeAlpha_Student_Grade_Tracker
Student Grade Tracer
Overview
The StudentGradeTracer Java program allows users to enter and track student grades. The program computes and displays the average, highest, and lowest grades from the entered data. It utilizes an ArrayList to manage the list of grades dynamically.

Key Components
StudentGradeTracer Class:

Fields:
grades: An ArrayList<Double> to store the grades.
Methods:
addMarks(double marks): Adds a grade to the grades list.
calculateAverage(): Computes the average grade from the list. If the list is empty, it returns 0.
calculateHighestGrade(): Finds and returns the highest grade in the list. If the list is empty, it returns 0.
calculateLowestGrade(): Finds and returns the lowest grade in the list. If the list is empty, it returns Double.MAX_VALUE (effectively indicating no valid lowest grade if the list is empty).
main Method:

Displays a welcome message.
Uses a Scanner to read grades from the user.
Allows the user to input grades until -1 is entered, which signals the end of input.
Calls methods to compute and display the average, highest, and lowest grades.
Closes the Scanner after processing is complete.
Usage
Input Grades:

The user is prompted to enter grades one by one.
Enter -1 to finish input.
Output Summary:

After finishing input, the program prints the average, highest, and lowest grades.
 
