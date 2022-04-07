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

// Create the class called "OnlineCourse" by extending the "Course" class
public class OnlineCourse extends Course
{
    // Create the class variable called "technologyFee"
    private int technologyFee;
    public OnlineCourse(String courseName,int costPerCredit,int numberOfCredits,int technologyFee) //parametrized constructor
    {
        super(courseName,costPerCredit,numberOfCredits); //calling super class constructor
        this.technologyFee = technologyFee;
        System.out.printf("In OnlineCourse Constructor value set: \n TechnologyFee = $%d\n",this.technologyFee);
    }

    // Create a method to compute and return the tuition fee
    public int computeTuition()
    {
        return super.computeTuition()+technologyFee;
    }

    //Create a method to return a String representation of the object
    public String toString()
    {
        return "OnlineCourse: " + this.getCourseName() + " @ $" + this.computeTuition();
    }

    // Getter and Setter methods for the program
    public int getTechnologyFee()
    {
        return this.technologyFee;
    }
    public void setTechnologyFee(int technologyFee)
    {
        this.technologyFee=technologyFee;
    }
}