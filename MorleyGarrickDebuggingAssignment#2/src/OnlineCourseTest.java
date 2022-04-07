// MAIN FILE THAT RUNS THE PROGRAM
// -------------------------------

// Garrick Morley
// ISYS 316 Section 1
// Instructor: Hira Herrington
// Debugging Assignment #2
// Due Date: 03/31/2022
// Date Finished: 04/02/2022 (This was the one I missed while I was in the hospital, thanks again for the extra time)

// Project Name: MorleyGarrickDebuggingAssignment#2 (The second of the two debugging projects)

// This program will calculate the total tuition cost for the semester based on the number of credits for both regular
// and online courses and then print the results one the "OnlineCourseTest.java" file is run as an application

// NOTE: The file "Fixes.java" contains a list of the ten fixes I've made to the program using comments
// NOTE: All the files used to work this program are located here in the "src" folder

// Create the class called "OnlineCourseTest" and use this to run the program
public class OnlineCourseTest
{
    // Main class to run the program
    public static void main(String args[])
    {
        Course currentCourse;
        // Testing class "Course" from "Course.java"
        System.out.println("Taking a regular course...");
        // Create an object called "currentCourse" from the "Course.java" class with the following arguments
        currentCourse = new Course("CS520",390,4);
        // Print the results for the regular course first
        System.out.println("Printing...");
        System.out.println(currentCourse);


        // Testing class "OnlineCourse" from "OnlineCourse.java"
        System.out.println("\nTaking an online course...");
        // Create an object called "currentCourse" from the "OnlineCourse.java" class with the following arguments
        currentCourse = new OnlineCourse("CS520",760,4,60);
        // Print the results for the online course second
        System.out.println("Printing...");
        System.out.println(currentCourse);
    }
}