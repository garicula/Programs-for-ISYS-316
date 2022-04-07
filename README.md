# Programs-for-ISYS-316
A collection of the programs I wrote for the class ISYS 316 Advanced Java Programming

I took this class at Ferris State University so there might be some variation between the assignments, probably not though. Also I got a "B" for this class, but hopefully whoever finds these files can build on them and do better than me or just use them to check their work.

This will include assignments #1 through #6, the two debugging assignments, and the optional BOGO sort that we had to do throughout the semester.

I got full points for Assignments #1, #3, #6, and both debugging assignments. I got almost full points on assignments #2 and #5. I did not do well on assignment #4. 

I don't know how well I did on the final project, I'll update this if I can at some point.

Hopefully someone will find this repository useful, I'll include the keywords for each assignment in this file below. If that's how you got here then just go through each branch of this repository to find the answers you're looking for. Each branch contains a .zip file with the functioning program that you need, and the only two that might not get you full credit are the polygon and the bank teller assignments. Good luck!

------------------------------KEYWORDS------------------------------

General Rules for Homework Assignments
• The beginning comment section must have at a minimum the following or
points will be deducted:
o The name of the developer and the date written
o The instructors name
o The course and section number
o A statement as to its purpose
o The inputs and outputs
o A list of exposed interfaces
o A list of all variables, their type, and their purpose
• Comments are required throughout the program. Doing so will help your
instructor to understand your programming logic and grade you more
accurately.
• You must work on your assignments individually. You are not allowed to copy
any code, in whole or part, from the others. However, you are encouraged to
discuss approaches to the homework assignment with your section mates and
the instructor.
• Each assignment has a strict deadline. Due dates are posted on the Schedule.
Remember that ALL assignments must be completed to pass this course.
• When the term YourName is referenced in an assignment, please replace it
with your name.
Create a new Java Project named YourNameAssignment6 and complete the
following requirements:

------------------------------KEYWORDS FOR ASSIGNMENT 1------------------------------

Design a class named Circle that extends the class GeometricObject below:  
 
class GeometricObject { 
  private String color = "blue"; 
  private boolean filled = false; 
 
  /**Default construct*/ 
  protected GeometricObject() { 
  } 
 
  /**Construct a geometric object*/ 
  protected GeometricObject(String color, boolean filled) { 
    this.color = color; 
    this.filled = filled; 
  } 
 
  /**Getter method for color*/ 
  public String getColor() { 
    return color; 
  } 
 
  /**Setter method for color*/ 
  public void setColor(String color) { 
    this.color = color; 
  } 
 
  /**Getter method for filled. Since filled is boolean, 
     so, the get method name is isFilled*/ 
  public boolean isFilled() { 
    return filled; 
  } 
 
  /**Setter method for filled*/ 
  public void setFilled(boolean filled) { 
    this.filled = filled; 
  } 
} 
 
Your Circle class will contain:  
 
•  One double data field named dRadius with the default value of 1.0. 
•  Two integer fields name iCenterX and iCenterY to hold the center point of the 
circle. Their default value is 1, 1. 
•  A no-argument constructor that creates a default circle. 
•  A constructor that creates a circle with the specified center and radius as 
parameters. (In that order.) 
•  The accessor (get) methods for all data fields.  
•  A method named getArea() that returns the area of this circle. 
•  A method named getPerimeter() that returns the perimeter of this circle. 
•  A method named getDiameterLength() that returns the length of the circle’s 
diameter.  
•  An override method for toString() that returns a string description for the circle.  
You will test your Circle class with the following code: 
public class YourNameAssignment1{ 
  public static void main(String[] args) { 
    Circle circle = new Circle(1, 1, 1.5); 
    circle.setColor("green"); 
    circle.setFilled(false); 
 
    System.out.println("The center and radius of the circle is: ", 
circle.getCenterX() + ", " + circle.getCenterY() + " - " + 
circle.getRadius()); 
    System.out.println("The area is " + circle.getArea()); 
    System.out.println("The perimeter is " 
      + circle.getPerimeter()); 
    System.out.println("The length of the diameter is " 
      + circle.getDiameterLength()); 
    System.out.println(circle); 
  } 
} 
 
class GeometricObject { 
  // See GeometricObject class code above 
} 
 
class Circle extends GeometricObject { 
  // Your code here... 
} 
Submission: 
Submit your entire project subdirectory in a zip file asYourNameAssignment1.zip, in 
the Assignment 1 Section on or before the due date. Submit the entire project 
directory in one zip file. Do not submit separate source files. 

------------------------------KEYWORDS FOR ASSIGNMENT 2------------------------------

Assignment: 
Create a new Java Project named YourNameAssignment2 and complete the 
following requirements. Write a program that displays a regular polygon and uses two 
buttons named +1 and -1 to increase or decrease the number of sides of the polygon, 
as shown in the following figure. 
To receive full credit your program will need to meet the following specifications:  
1. Create the UI that looks like the example dialogs. 
2. Your program should correctly display an n-sided polygon. 
3. Your program should handle action events from the buttons. 
4. Your program should redisplay the polygon when the user clicks the buttons. 
5. Your program should allow for the changing of the interior color of the polygon.  
Example Dialogs: 
   
What you will need in for the code: 
Your java code will have three sections: 
1. The YourNameAssignment1 class which will be an extension of the Application 
class 
a. The start method will be located here 
b. The pane’s width and height will be set to 350 x 280 
c. An instance of the polygon class (see item 3 below) is created with a 
default of 5 sides 
d. The polygon instance is set in the center of the BorderPane 
e. The bindings to the polygon class’s methods to increase and decrease 
the number of sides will be located here 
f.  The BorderPane, HBox and Scene will be instantiated here 
g. The state’s title is set 
h. The + and – buttons are created and located in the HBox 
i.  Getter and Setter methods to change the interior color of the polygon. 
2. a main method for the start of program execution 
a. The launch method will be called here 
3. a class that models the polygon which will be an extension of the StackPane 
class 
a. The polygon will be instantiated here 
i. The constructor: 
1. is where the default number of sides will set (5) 
2. the polygon instance will be added to the pane 
3. the fill color will be set 
4. the stroke color will be set 
5. the paint method is initially called 
b. The paint method will be defined here 
i. An ObservableList of type Double will be created 
ii. The width and height of the polygon will be set to 210 x 210 
iii. The radius will be calculated 
iv. Points in the polygon will be added to the list using the following 
formulas for the x and y locations of the point: 
 for (int i = 0; i < numberOfSides; i++) { 
    list.add(centerX + radius * Math.cos(2 * i * Math.PI / numberOfSides));  
    list.add(centerY - radius * Math.sin(2 * i * Math.PI / numberOfSides)); 
} 
c. The methods to increase and decrease the number of sides of the 
polygon are defined here 
Submission: 
Submit this YourNameAssignment1.zip file in the Assignment 2 Section on or before 
the due date. Submit the entire project directory in one zip file. Do not submit 
separate source files.

------------------------------KEYWORDS FOR ASSIGNMENT 3------------------------------

Assignment: Design your own version of a floating-point calculator. It must use a 
graphical interface and have the following features to receive full credit: 
 
1. Numeric buttons 0 – 9 and a decimal point 
2. The ability to multiply, divide, subtract and add (these must work) 
3. An equals button to perform the calculation (unless you make and RPN calc) 
4. A display that outputs the values entered and the result 
 
Extra Credit: 
•  Create an RPN calculator: +10% 
•  Add memory buttons: M+, MC, MR: + 5% 
•  The following functions: 1/x, x2, √, %: +5% 
•  Add ability to display the equation entered: +10% 
 
Submission: 
Submit this YourNameAssignment3.zip file in the Assignment 3 Section on or before 
the due date. Submit the entire project directory in one zip file. Do not submit 
separate source files.

------------------------------KEYWORDS FOR ASSIGNMENT 4------------------------------

Create a new Java Project named YourNameAssignment4 and complete the following 
requirements: Using the Account class you created in ISYS 216 Assignment 6, or the 
Account class that follows, write a Bank Teller program that can create, modify, and 
report on an unlimited number of accounts. Feel free to modify the Account class as 
necessary. The data needed to create the account will be read in from file. (See the 
sample file below.) Remember, you will need to display multiple lines of input/output in 
the dialog box. 
To receive full credit your program will need to meet the following specifications: 
1. Create a dialog box-based Bank Teller program. The dialog will have the 
following UI features: 
a. Numeric keypad 
b. Transaction buttons for Create, Lookup, Deposit and Withdraw 
i. Create – the teller should be able to create an account by entering 
the (Optional - client’s first name, last name) and the opening 
balance. The account number will be automatically generated by 
your software. 
ii. Deposit – the teller should be able to enter any amount from the 
dialog box. 
iii. Withdraw – the teller should be able to enter any amount from the 
dialog box. Your Bank Teller program should check the account 
balance to determine if enough funds exist for the transaction and 
report back to the teller if the transaction succeeded or failed. If 
the transaction succeeded, the withdraw amount should be 
debited from the account balance. 
iv. Lookup – the teller should be able to enter the account number, or 
(Optional - the client’s first and last name), to locate the 
account and display the current balance. 
c. Text display for visually confirming amounts for the transactions in 1.b. 
d. Enter button for confirming the amounts entered and the account number.  
e. Cancel transaction button that works for all operations. 
2. Use a loop structure to read and process the current account data from the input 
file named AccountDataIn.txt. This file will be used to create the initial accounts. 
This file will be read in when the program first starts up. 
3. Process the following operation/transaction commands from the file: 
C – Create an account and set its opening balance. 
4. The input file format will be as follows: Each line in the file will begin with the 
letter “C” for create. This will be followed by an account number. Next will be the 
client’s first and last name. Finally, the account balance. See sample file below. 
5. Use try-catch blocks to trap possible I/O errors. 
6. Use the File, and Scanner classes to perform the file I/O. 
 
The following may be useful for developing your Bank Teller:  
 
• Use the ArrayList class or another data structure to store the references to each 
of the account objects. 
• The String class’s split() method to break up each line read in from the file based 
on a comma, “,”, to separate data. 
• Make sure your submission is fully commented including a header at the top of 
the file. 
• If you do not have one from last semester, you may use the Account class listed 
at the end of this file. 
Sample Dialog: 
Sample Input AccountDataIn.txt file:  
C,234444,Mary,Jones,2500 
C,392011,Steven,Fumer,3654 
C,730234,William,Summer,36982 
C,729101,Sonya,Blade,980 
C,834773,April,Moon,87451 
Remember, your application should be able to handle an unlimited number of accounts. 
Submission: 
Submit your YourNameAssignment4.* files as an attachment in the Assignment 4 
Section. Submit the entire project directory in a zip file. Do not submit individual source 
files.  
Sample Account Class: 
public class Account { 
  private int id; 
  private double balance; 
  private static double annualInterestRate = 0; 
  private final java.util.Date dateCreated; 
 
  public Account() { 
    dateCreated = new java.util.Date(); 
  } 
 
  public Account(int newId, double newBalance) { 
    id = newId; 
    balance = newBalance; 
    dateCreated = new java.util.Date(); 
  } 
 
  public int getId() { 
    return id; 
  } 
 
  public double getBalance() { 
    return balance; 
  } 
 
  public static double getAnnualInterestRate() { 
    return annualInterestRate; 
  } 
 
  public void setId(int newId) { 
    id = newId; 
  } 
 
  public void setBalance(double newBalance) { 
    balance = newBalance; 
  } 
 
  public static void setAnnualInterestRate(double 
newAnnualInterestRate) { 
    annualInterestRate = newAnnualInterestRate; 
  } 
 
  public double getMonthlyInterest() { 
    return balance * (annualInterestRate / 1200); 
  } 
 
  public java.util.Date getDateCreated() { 
    return dateCreated; 
  } 
 
  public void withdraw(double amount) { 
    balance -= amount; 
  } 
 
  public void deposit(double amount) { 
    balance += amount; 
  } 
}

------------------------------KEYWORDS FOR ASSIGNMENT 5------------------------------

Create a new Java Project named YourNameAssignment5 and complete the 
following requirements:  
 
1. Create a class named Student as follows. The class keeps track of the 
student’s grades. 
a. The instance (or member) private variables – szName (String), 
iAssessments (an integer array list). 
b. A single constructor with name as its argument. Also, initialize the 
assessments array list. 
c. The public get and set methods for the name instance variable.  
d. A void addAssessmentGrade method which takes one argument – the 
new homework grade.  
e. A public computeAverage method which takes no arguments and 
returns a double showing the average assessment grade for this 
student.  
f.  Override the toString method to return the string representation of this 
object in the format “The <studentName>’s average grade is <the 
computed average>”. 
 
2. In your YourNameAssignment5 class implement the following functionality 
in its main method. 
a. Declare and initialize an empty Queue of Student objects named 
studentQueue. 
b. Declare and initialize an empty HashMap named studentMap. 
The keys will be the names of the students and the entries in 
the map will be the corresponding student objects. 
c. Use the Scanner class to read the data.txt file. The contents of 
the file are shown below. Create the datain.txt file in your 
project. 
d. Read the contents of the text file one line at a time using a loop. 
The program should work for any number of input lines. In this 
loop, 
1. Invoke the processInputData method for each line read. This 
method returns the corresponding Student object. 
2. Add this Student object to the studentQueue. 
3. Insert this Student object into the studentMap using the 
student’s name as the key. 
e. After the loop is processed, do the following.  
1. Iterate over the studentQueue and display each element to 
the console. 
2. Access the keys of the studentMap and assign them to an 
appropriate variable. Create an iterator over the keys. Iterate 
over each key in this set and display the associated object in 
the map to the console. 
 
External to the main method but in the same class as the main, write a 
private method processInputData with return type Student which 
processes its string input argument and returns the corresponding 
Student object as follows. 
1. Use the String class’s split() or another method to break up 
each line read in from the file based on a comma, “,”, to 
separate data. 
2. Extract the name string. Create a Student object and pass 
name into the Student constructor. 
3. Using a while loop, read the next homework grade and 
convert it to an integer. Use the addAssessmentGrade 
method on the student object to add the homework grade 
for this homework.  
4. Display the string representation of the currentStudent 
object to the console. 
5. The method should return the currentStudent object. 
6. Provide a flowchart for this method.  
 
 
Sample Input datain.txt file:  
Alice,44,79,85,72,77,57 
Bob,79,94,70,71,71,51 
Charlie,95,99,41,55,65,50 
Dave,87,89,88,55,74,63 
Ed,82,51,44,67,73,49 
 
 
 b. Declare and initialize an empty HashMap named studentMap. 
The keys will be the names of the students and the entries in 
the map will be the corresponding student objects. 
c. Use the Scanner class to read the data.txt file. The contents of 
the file are shown below. Create the datain.txt file in your 
project. 
d. Read the contents of the text file one line at a time using a loop. 
The program should work for any number of input lines. In this 
loop, 
1. Invoke the processInputData method for each line read. This 
method returns the corresponding Student object. 
2. Add this Student object to the studentQueue. 
3. Insert this Student object into the studentMap using the 
student’s name as the key. 
e. After the loop is processed, do the following.  
1. Iterate over the studentQueue and display each element to 
the console. 
2. Access the keys of the studentMap and assign them to an 
appropriate variable. Create an iterator over the keys. Iterate 
over each key in this set and display the associated object in 
the map to the console. 
 
External to the main method but in the same class as the main, write a 
private method processInputData with return type Student which 
processes its string input argument and returns the corresponding 
Student object as follows. 
1. Use the String class’s split() or another method to break up 
each line read in from the file based on a comma, “,”, to 
separate data. 
2. Extract the name string. Create a Student object and pass 
name into the Student constructor. 
3. Using a while loop, read the next homework grade and 
convert it to an integer. Use the addAssessmentGrade 
method on the student object to add the homework grade 
for this homework.  
4. Display the string representation of the currentStudent 
object to the console. 
5. The method should return the currentStudent object. 
6. Provide a flowchart for this method.  
 
 
Sample Input datain.txt file:  
Alice,44,79,85,72,77,57 
Bob,79,94,70,71,71,51 
Charlie,95,99,41,55,65,50 
Dave,87,89,88,55,74,63 
Ed,82,51,44,67,73,49 
 
 
 
Sample Output: 
 
 
Submission 
Submit your YourNameAssignment5.zip file as an attachment in the Assignment 5 
Section on or before the due date. Submit the entire project directory in one zip file. 
Do not submit separate source files.

------------------------------KEYWORDS FOR ASSIGNMENT 6------------------------------

Create a new Java Project named YourNameAssignment6 and complete the
following requirements:
Several threads will share a single object and contribute their individual result to the
shared object. The shared object accumulates the partial results.
Create a class named SharedResults as follows. The class keeps track of the shared
result.
a.The instance (or member) private variable – iResult (int).
b.A void addToResult method which takes the given integer argument and
adds it to the shared iResult. This method then prints to the console
the name of the current thread, the value it added, and the cumulative
result. Handle the synchronization issue with this method.
c. The getResult method with no arguments which returns the shared
iResult. Handle the synchronization issue with this method.
2. Create a class named LongTask which extends the Thread class.
a. The instance (or member) private variables – sharedData (of
type SharedResults), iStart (integer) and iEnd (integer).
b. A single constructor which takes the above three arguments and
stores them in the instance values. Also, create a name for this
thread as Thread_<start>_<end>
c. In the run method, add the integer numbers from iStart to iEnd
(both inclusive) using a for loop. Also, sleep for a random time
(up to 10 milliseconds) in each iteration of the loop. After the
loop, invoke the addToResult method of the shared object and
provide this accumulated sum.
3. Use your YourNameAssignment6 class to test the following functionality in
its main method.
a. Create the SharedResults object and assign it to a variable.
b. Create five LongTask objects by passing the above shared
object and the start and end values for each as (1, 100), (101,
200), (201, 300), (301, 400), and (401, 500) respectively.
c. Start each thread as it is created.
d. Wait for all the threads to complete using the join method.
e. Print the iResult from the shared object.

Different runs of the program will produce the output in different sequences, but
the result would be the same. Two runs of the program are shown below.
 Sample Output:
Zip your entire YourNameAssignment6 project folder and submit it as an attachment
in the Assignment 6 Section. Submit the entire project directory in one zip file. Do not
submit separate source files.

------------------------------KEYWORDS FOR DEBUGGING ASSIGNMENT 1------------------------------

Debug the code in the attached project (.zip) file and submit the corrected code in a project (.zip) file by the due date. 

I have introduced 10 errors in the .java file. They can be grammar, syntax or logical errors. The errors may cause he program not to compile or compile and run incorrectly. Two of the errors involve code that has no point and does not alter the program execution. See if you can find all 10 errors. 

A correctly debugged file will create the following output (the ordering of the colors may be different):

------------------------------KEYWORDS FOR DEBUGGING ASSIGNMENT 2------------------------------

Debug the code in the attached project (.zip) file and submit the corrected code in a project (.zip) file by the due date. 

I have introduced 10 errors in the .java file. They can be grammar, syntax or logical errors. The errors may cause he program not to compile or compile and run incorrectly. See if you can find all 10 errors. 

A correctly debugged file will create the following output:

Taking a regular course...
In Course Constructor values set:
  CourseName = CS520, CostPerCredit = $390, NumberOfCredits = 4
Printing...
Course:CS520 @ $1560

Taking an online course...
In Course Constructor values set:
  CourseName = CS520, CostPerCredit = $760, NumberOfCredits = 4
In OnlineCourse Constructor values set:
  CourseName = CS520, CostPerCredit = $760, NumberOfCredits = 4, TechnologyFee = $60
Printing...
OnlineCourse:CS520 @ $3100

------------------------------KEYWORDS FOR OPTIONAL BOGO ASSIGNMENT------------------------------

Write a Bogo Sort before the end of October.  Reward: 25 points extra credit.

Sort the following array:

int [] array = {5, 3, 0, 2, 4, 1, 0, 5, 2, 3, 1, 4};

Test your array with the following method:

private static boolean isSorted(int[] array)  { 

    for (int i = 1; i < array.length; i++){

      if (array[i] < array[i - 1]) {

        return false; 

      }

    }

    return true; 

  }
  
  ------------------------------KEYWORDS FOR FINAL ASSIGNMENT------------------------------

