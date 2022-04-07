// Garrick Morley
// ISYS 316 Section 1
// Instructor: Hira Herrington
// Programming Assignment #5
// Due Date: 03/29/2022
// Date Finished: 03/19/2022
// File Name: MorleyGarrickAssignment5 (Calculate Average Grades and Their Corresponding Students' names).

// NOTE: I used the sample inputs in the text file to maintain the results as they should appear on your computer.

// This "Student_Class" class file will be used by the "Main" java file to compute average grades and students' names.

// The inputs for this class file include: The homework grades, which are given to this class using the Main class.

// The outputs for this class file include: The return value with the student name and their average grade.

// The variables for this class file include: name_of_student, average, homeworkGrade, total, average, sum, and x.

// The objects for this class file include: "homework_grades" (as an ArrayList value), and "list" (as another ArrayList
// value).


// Package name to move data between files
package com.example.morleygarrickassignment5;

// Import the ArrayList function for this class
import java.util.ArrayList;

// Create the class with the students' names and their averages
public class Student_Class {
    String name_of_student;
    double average;

    // New FINAL object created here using the ArrayList function
    private final ArrayList<Integer> homework_grades = new ArrayList<>();

    // Public class to assign names to the different students
    public Student_Class(String NameStudent)
    {
        this.name_of_student = NameStudent;
    }

    // Function to set the name of the student
    public void setName(String named)
    {
        name_of_student = named;
    }

    // Function to get the name of the student from before
    public String getName()
    {
        return name_of_student;
    }

    // Function to add the students' homework grades to the ArrayList
    public void addHomeworkGrade(int homeworkGrade)
    {
        homework_grades.add(homeworkGrade);
    }

    // Function to compute the average grade for each student based off the homework grades given
    public double computeAverage()
    {
        // New object "list" created here using the ArrayList function
        ArrayList<Integer> list = new ArrayList<>(homework_grades);

        // Math function that returns the average grade of the student in question
        double total;
        int average = 0;
        long sum = 0;
        int x = list.size();
        for (int i = 0; i < x; i++)
            sum += list.get(i);

        // This part of the function returns the average value, which is calculated here since we can't use a double
        // variable above (I tried, it didn't work)
        return ((double)sum) / x;
    }

    // Prints and returns the result of the calculations for the average grade and the student name
    @Override
    public String toString(){
        return name_of_student + "'s average grade is: " + computeAverage();
    }
}