/*

Here are the 10 fixes to the debugging assignment #2

NOTE: Line numbers are from the original "OnlineCourseWithErrors.zip" file, not the fixed version

1) In OnlineCourseTest.java line 27, change "("CS520", 760, 4, 60);" to "(courseName:"CS520",costPerCredit:760,
numberOfCredits:4,technologyFee:60);".

2) In OnlineCourse.java line 11, create constructor matching super.

3) In OnlineCourse.java line 17, add the keyword "this" before the ".technologyFee".

4) In Course.java line 4, move the variable "numberOfCredits" up a line after a comma to save space when declaring it.

5) In Course.java line 7, remove the part "this." before the word "courseName".

6) In Course.java line 11, change the printf content to this: "In Course Constructor values set: CourseName = %s,
   CostPerCredit = $%d, NumberOfCredits = %d\n",this.courseName,this.costPerCredit,this.numberOfCredits

7) In OnlineCourseTest.java line 27, add 'int' as a 4th parameter to constructor "OnlineCourse"

8) In OnlineCourseTest.java line 27, change the "costPerCredit" to 760

9) In OnlineCourse.java line 9, change the printf statement to: "In OnlineCourse Constructor value set: TechnologyFee =
   $%d\n",this.technologyFee

10) In OnlineCourse.java line 4, alter the function "OnlineCourse" to work without being void

 */
