// HELPING CLASS FILE, MAIN ONE IS "OnlineCourseTest.java"
// -------------------------------------------------------

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

// Create the class called "Course"
public class Course
{
    // Initialize the class variables
    private String courseName;
    private int costPerCredit;
    private int numberOfCredits;

    // Initialize the class called "Course" using a parametrized constructor
    public Course(String courseName,int costPerCredit,int numberOfCredits)
    {
        this.courseName = courseName;
        this.costPerCredit = costPerCredit;
        this.numberOfCredits = numberOfCredits;
        System.out.printf("In Course Constructor values set: \n CourseName = %s, CostPerCredit = $%d, NumberOfCredits = " +
                "%d\n",this.courseName,this.costPerCredit,this.numberOfCredits);
    }

    // Create a method to compute and return the tuition fee
    public int computeTuition()
    {
        return this.costPerCredit * this.numberOfCredits;
    }

    // Create a method to return a String representation of the object
    public String toString()
    {
        return "Course: "+this.courseName+" @$"+this.computeTuition();
    }

    // Getter methods for the class variables relating to the course name
    public String getCourseName()
    {
        return this.courseName;
    }
    public void setCourseName(String courseName)
    {
        this.courseName = courseName;
    }

    // Getter and setter methods for the class variables relating to the online class cost per credit
    public int getCostPerCredit()
    {
        return this.costPerCredit;
    }
    public void setCostPerCredit(int costPerCredit)
    {
        this.costPerCredit = costPerCredit;
    }

    // Getter and setter methods for the class variables relating to the regular class cost per credit
    public int getNumberOfCredits()
    {
        return this.costPerCredit;
    }
    public void setNumberOfCredits(int numberOfCredits)
    {
        this.numberOfCredits = numberOfCredits;
    }
}