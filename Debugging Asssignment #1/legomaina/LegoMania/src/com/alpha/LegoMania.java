// Garrick Morley
// ISYS 316 Section 1
// Instructor: Hira Herrington
// Debugging Assignment #1
// Due Date: 02/15/2022     // Date Finished: 02/07/2022
// File Name: Lego Mania
// This program will build a lego structure once it has been properly debugged, there are at least 10 errors here

// The inputs for this program include: The random number created, known as "number", the variables listed above, the
// integers "i" and "j" in the for loops, and of all the lines in the "main" function that allow it to work properly

// The outputs for this program include: A java pop up windows that is centered on the screen and contains the randomly
// colored pyramid blocks, similar to the one shown in the assignment page

// The variables used in this program include: "startX" (where to start on the X axis),
// "startY" (where to start on the Y axis), "legoWidth" (the width of each lego block),
// "legoHeight" (the height of each lego block), "baseLength" (the length of the base of each block),
// "colorUsed" (an array containing all of the colors from the original non-debugged program),
// "number" (a randomly generated number to find the color for the next block), "currentX" (the current X axis location)
// , "currentY" (the current Y axis location), and prevColor (the previous color that was used).

/**
 * All errors will be copied into this comment section
 * Error #1:  Remove "serial" from the top here (line 44)
 * Error #2:  Add an ";" to the end of this line (line 121)
 * Error #3:  Restate the variables inside the "paint" class to make them local variables (line 68)
 * Error #4:  Follow the steps below (line 75)
 * Error #5:  Add these two lines to draw the rectangle (line 89)
 * Error #6:  Add the extra lines into the main class to fully flesh it out (line 144)
 * Error #7:  Add this super function line here that names the program line (line 55)
 * Error #8:  Move this section above the new lines I added (line 84)
 * Error #9:  Remove the line with "prevColor" at the start, it doesn't do anything (line 52)
 * Error #10: Add this line into the paint class (line 99)
 */

// Package name to move data between classes
package com.alpha;

// Imports needed for the program
import java.awt.*;
import java.util.Random;
import javax.swing.JFrame;

// Error #1: Remove "serial" from the top here
public class LegoMania extends JFrame {
    public int startX;
    public int startY;
    public int legoWidth;
    public int legoHeight;
    public int baseLength;
    private Random rand;
    // Error #9: Remove this line setting the previous color to yellow, it doesn't do anything

    public LegoMania() {
        super("Lego Tower");    //Error #7:  Add this super function line here that names the program
        rand = new Random();
        startX = 20;
        startY = 300;
        legoWidth = 50;
        legoHeight = 20;
        baseLength = 10;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {
        super.paint(g);

        // Error #3: Restate the variables to make them local variables
        int startX = 50;
        int startY = 300;
        int legoWidth = 50;
        int legoHeight = 20;
        int baseLength = 10;

    // Error #4: Follow the steps below
    // Add the color array that was in the "getColor()" class, it just functions better here in this class
    // Name the array "colorUsed" and include all the colors from the original non-debugged program
    Color[] colorUsed = { Color.red, Color.blue, Color.yellow, Color.green, Color.pink, Color.black, Color.magenta,
            Color.orange, Color.cyan };

        // Generate a random number as a variable called "number"
        Random number = new Random();

        //Error #8: Move this section above the new lines I added
        // These two lines manage the baseLength variable and shorten it as the height increases
        for (int i = 1; i <= baseLength; i++) {
            for (int j = 1; j <= (baseLength - i); j++) {

                // Error #5: Add these two lines to draw the rectangle
                // Draw the rectangle using the local variables: startX, startY, legoWidth, and legoHeight
                g.drawRect(startX, startY, legoWidth, legoHeight);
                g.fillRoundRect(startX, startY, legoWidth, legoHeight, 2, 2);

                // Set the Block color to something random from the array above
                g.setColor(colorUsed[number.nextInt(colorUsed.length)]);
                startX = (startX + legoWidth);
            } // Ends the "J" length variable for this iteration

            // Error #10: Add these two lines into the paint class (startX and startY)

            // Add a block one half of the size of the previous block to the next level for each iteration
            startX = (startX / 2) - ((baseLength - i) * legoWidth) / 2 + ((legoHeight * i + legoWidth) / 2) + i / 2;

            // Moves the blocks up by one Y Coordinate for each iteration while shortening them appropriately
            startY = startY - (legoHeight);

        } // Ends the "I" length variable for this iteration
     } // Ends the "paint" class

        // This would get a random color, but I moved parts of it into the paint class and that works better
        // I'm not sure why, and I tried everything I could think of to utilize this class in the program but it servers
        // Better as a set of instructions for the pyramid
       /** public Color getColor () {

            Random num = new Random();

            Color CurrentColor;

            // Move this array into the paint class
            Color[] colors = new Color[] {Color.red, Color.blue, Color.yellow, Color.green, Color.pink,
                    Color.black, Color.magenta, Color.orange, Color.cyan}; // Error #2: Add a ";" to the end of this

            // Move parts of this function into the paint class as well
            CurrentColor = colors[rand.nextInt(colors.length)];
            while (CurrentColor != prevColor) {
                // loop until the colors are different
                CurrentColor = colors[num.nextInt(colors.length)];
            }
            return CurrentColor;
        }
        */

        // Main function to run the program, requires "public static void main (Strings[] args" to work
        public static void main (String[] args){
            LegoMania app = new LegoMania();    // This line creates a new object called "LegoMania"
            app.setSize(550, 325); // This line sets the size of the window
            app.setTitle("Lego Tower");      // This line sets the title of the Jframe box
            app.setVisible(true);            // This line sets the Jframe box to be visible
            app.setLocationRelativeTo(null); // This line centers the Jframe box on the screen
            app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // This line allows the program to close by clicking X
        } // Ends the main function
    } // Ends the Jframe class

// Error #6: Add the extra lines into the main class to fully flesh it out

