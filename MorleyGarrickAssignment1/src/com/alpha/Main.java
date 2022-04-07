// Garrick Morley
// ISYS 316 Section 1
// Instructor: Hira Herrington
// Assignment #1
// Due Date: 01/25/2022
// File Name: Triangle Class: This program build a circle using I/O

// Important side note, do not mess with MorleyGarrickAssignment1.java at all or the whole thing breaks

// The variables used in this program are "iCenterX" to hold the value of 1, "iCenterY", which also holds a value of 1
// and "dRadius which holds a value of 1.0
// Each of these are inputs to the circle and are used to form the outputs
// The outputs are area = 3.14, perimeter = 6.28, and length of diameter = 2.0

// The exposed interfaces are all the methods in this main.java that overlap with MorleyGarrickAssignment1.java, such
// as getColor, setColor, isFilled, setFilled,

// Package name to move data between classes
package com.alpha;

// Import statements, just needed this one
import java.lang.*;


public class Main {

    // You can use any name for the last part, I chose "allArguments"
    public static void main(String[] allArguments) {
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



    // Main String [] allArguments ending
    }

// Entire file ending
}


