// Garrick Morley
// ISYS 316 Section 1
// Instructor: Hira Herrington
// Programming Assignment #5
// Due Date: 03/29/2022
// Date Finished: 03/19/2022
// Project Name: MorleyGarrickAssignment5 (Calculate Average Grades and Their Corresponding Students' names)

// NOTE: I used the sample inputs in the text file to maintain the results as they should appear on your computer.

// This program will use the command line to input students' names and grades from a .txt file and output info on them,
// specifically all of their grades and their average grade.

// The inputs for this project include: The text file called "datain.txt", which contains all the info required to name
// and find the average grade of each student.

// The outputs for this project include: The location of all the files, the initial average grades along with the
// students' names and six grades, and then two iterations over the students' average grades (first the student list
// then the student map). It then returns with the exit code 0.

// The variables for this project include: counter, counter2, (both Iterator type variables), setKey, keyValue, value,
// (all of which are used to set and print key values of the students), line (a String value that we will split later),
// name_of_student (also a String value), and the following integer values: first_grade, second_grade, third_grade,
// fourth_grade, fifth_grade, sixth_grade (all of these hold the 6 grades that the students have received).

// The objects for this project include: "input" (used for Scanner), "data" (used for file input), "QueueOfStudents"
// (used to create a linked list using the "Queue<StudentClass>" function), "file" (used for my own personal function
// that checks all the files in the directory and then prints them), "info" (which is used to collect information
// using the Scanner function), and "currentStudent" (which will hold the value of the name of the current student).

// Package name to move data between files
package com.example.morleygarrickassignment5;

// Regular java imports needed for this program (namely the file functions)
import java.util.*;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

// Main class to run the whole project
public class Main {
    public static void main(String[] args){

        // Function to list all files in the main directory (so I can find the datain.txt file in this case)
        if (1 > 0)
        {
            File file = new File(".");
            for(String fileNames : file.list()) System.out.println(fileNames);
        }

        // Formatting to make the command line look nicer (goes between my .file function and the rest of the output)
        System.out.println("\n");
        System.out.println("All Files Listed Above");
        System.out.println("\n");
        System.out.println("All Program Info Listed Below");
        System.out.println("\n");
        // End formatting between my personalized function and the rest of the output

        // Queue "Student" class up to be used by the "HashMap" function
        Queue<Student_Class> QueueOfStudents;
        QueueOfStudents = new LinkedList<>();
        HashMap<String, Student_Class> studentMap= new HashMap<>();

        // Implement a try / catch function
        try {
            System.out.print("Processing the input file : \n"); // Add a newline there to make it look nicer
            Scanner input = new Scanner(System.in);

            // Create a new File object called "data" to input the info from the datain.txt file
            File data = new File("datain.txt");

            // Use the scanner function the input the actual data
            input = new Scanner(data);
            while (input.hasNextLine()) {
                String line = input.nextLine();
                Student_Class st1=processInputData(line);
                QueueOfStudents.add(st1);
                studentMap.put(st1.name_of_student,st1);
                System.out.println(line);}
            input.close();

          // Catch any errors with the inputting of the file, such as the file not being found
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();}

        // Create a new Iterator variable called "counter" to keep track of the printed lines
        Iterator counter;
        counter = QueueOfStudents.iterator();
        System.out.println ( "\nIterating over the student list: ");

        // While loop to print the next line as long as "counter" says that there is another line to print
        while (counter.hasNext())
        {
            System.out.println (counter.next());
        }

        // Use the "Set" function to set the key which will later be given a value
        Set setKey = studentMap.keySet();
        Iterator counter2 = setKey.iterator();
        String keyValue;
        Student_Class value;

        // Print out the text here after adding a new line first
        System.out.println("\nIterating over Students map...");

        // While loop using the previous iteration variable "counter2" to map out the students and print the value
        while(counter2.hasNext())
        {
            keyValue = (String)counter2.next();
            value = (Student_Class)studentMap.get(keyValue);
            System.out.println( value);
        }
    }

    // Calls the "Student" class to start assigning names and grades to each student based off of the datain.txt file
    private static Student_Class processInputData(String name) {

        // Use the Scanner class to create a new object called info
        Scanner info = new Scanner(name);
        String line = info.nextLine();

        // Use the String[] split function to split each item on each comma, ","
        String[] details = line.split(",");

        // Enters the student name as array value [0]
        String studentName = details[0];

        // Enters the first grade from this student as array value [1]]
        int first_grade = Integer.parseInt(details[1]);

        // Enters the second grade from this student as array value [2]
        int second_grade = Integer.parseInt(details[2]);

        // Enters the third grade from this student as array value [3]
        int third_grade = Integer.parseInt(details[3]);

        // Enters the fourth grade from this student as array value [4]
        int fourth_grade = Integer.parseInt(details[4]);

        // Enters the fifth grade from this student as array value [5]
        int fifth_grade = Integer.parseInt(details[5]);

        // Enters the sixth grade from this student as array value [6]
        int sixth_grade = Integer.parseInt(details[6]);

        // Creates a new object using the "Student" class called "CurrentStudent"
        Student_Class CurrentStudent = new Student_Class(studentName);

        // Sets the current student's name
        CurrentStudent.setName(studentName);

        // These six lines set the homework grade of the current student "StudentNow" for all six homework grades

        // Add the first homework grade to the current student
        CurrentStudent.addHomeworkGrade(first_grade);
        // Add the second homework grade to the current student
        CurrentStudent.addHomeworkGrade(second_grade);
        // Add the third homework grade to the current student
        CurrentStudent.addHomeworkGrade(third_grade);
        // Add the fourth homework grade to the current student
        CurrentStudent.addHomeworkGrade(fourth_grade);
        // Add the fifth homework grade to the current student
        CurrentStudent.addHomeworkGrade(fifth_grade);
        // Add the sixth homework grade to the current student
        CurrentStudent.addHomeworkGrade(sixth_grade);

        // Prints the results for the student selected as "StudentNow"
        System.out.println(CurrentStudent);

        // Returns the variable "CurrentStudent"
        return CurrentStudent;
    }
}