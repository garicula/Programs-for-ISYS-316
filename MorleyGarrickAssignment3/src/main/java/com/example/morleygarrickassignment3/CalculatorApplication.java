// Garrick Morley
// ISYS 316 Section 1
// Instructor: Hira Herrington
// Programming Assignment #3
// Due Date: 03/01/2022   -->   Date Finished: 03/01/2022
// File Name: MorleyGarrickAssignment3

// Run the "CalculatorApplication.java" file to get the program to work

// This program will display a calculator with multiple uses using javax and regular java functions.

// The inputs for this program include: The buttons zero, one, two, three, four, five, six, seven, eight, nine, and "."
// Also includes the function buttons: The buttons clear, add, subtract, multiply, divide, and calculate, shown as "="

// The outputs for this program include: Really just the resulting number, this program is mostly made of inputs since
// it's a calculator and all, so it just outputs the result

// The variables used in this program include: All the buttons for zero through nine and a decimal, along with two
// double variables called "calculate" and "number"

// The objects used in this program include: back (the background), lbl (the label), and result (the result), and all
// of the JButtons that are created (17 of those in total)

// Package name to move data between files
package com.example.morleygarrickassignment3;

// Regular java imports needed for the program
import java.awt.Color;
import java.lang.*;

// Javax imports needed for the program
import javax.swing.border.Border;
import javax.swing.*;
import java.awt.event.*;

// Main calculator class that runs the program
class Calculator_Main extends JFrame implements ActionListener
{
    // Use JPanel to create a new object called "pane" to work as the background for the calculator
    JPanel back = new JPanel();

    // Use JLabel to set the title of the program
    JLabel lbl = new JLabel("Garrick's Calculator");

    // Set the text field to display a string
    JTextField result = new JTextField("");

    // Create the different number buttons using JButton
    JButton button_zero;
    JButton button_one;
    JButton button_two;
    JButton button_three;
    JButton button_four;
    JButton button_five;
    JButton button_six;
    JButton button_seven;
    JButton button_eight;
    JButton button_nine;
    JButton button_decimal;

    // Create the different function buttons using JButton
    JButton button_clear;
    JButton button_calculate;
    JButton button_add;
    JButton button_subtract;
    JButton button_multiply;
    JButton button_divide;

    // Create a border, it can't really be seen, but we need it there (and I just like the color blue)
    Border border = BorderFactory.createLineBorder(Color.blue, 15);

    // Create the five string variables to be used in the math functions below
    String string_one;
    String string_two;
    String string_three;
    String string_four;
    String string_five;

    // Create the double variables to be used in the math functions below
    double calculate;
    double number;

    // Create the main calculation method
    Calculator_Main()
    {
        // Set the size and visibility of the calculator pop up window
        setLayout(null);
        setSize(380,380);
        setVisible(true);

        // Set the bounds and color of the background
        back.setBounds(5, 5, 290, 290);
        back.setBackground(Color.white);
        back.setBorder(border);

        // Set the bounds for the label
        lbl.setBounds(50,0,200,20);
        add(lbl);

        // Set the bounds for the result
        result.setBounds(50, 50, 250, 50);
        add(result);

        // ---------------------------------------------------------
        // Number buttons below

        // Create the button for "0"
        button_zero = new JButton("0");
        button_zero.setBounds(110,250,50,30);
        add(button_zero);
        button_zero.addActionListener(this);

        // Create the button for "1"
        button_one = new JButton("1");
        button_one.setBounds(50,110,50,30);
        add(button_one);
        button_one.addActionListener(this);

        // Create the button for "2"
        button_two = new JButton("2");
        button_two.setBounds(110,110,50,30);
        add(button_two);
        button_two.addActionListener(this);

        // Create the button for "3"
        button_three = new JButton("3");
        button_three.setBounds(170,110,50,30);
        add(button_three);
        button_three.addActionListener(this);

        // Create the button for "4"
        button_four = new JButton("4");
        button_four.setBounds(50,160,50,30);
        add(button_four);
        button_four.addActionListener(this);

        // Create the button for "5"
        button_five = new JButton("5");
        button_five.setBounds(110,160,50,30);
        add(button_five);
        button_five.addActionListener(this);

        // Create the button for "6"
        button_six = new JButton("6");
        button_six.setBounds(170,160,50,30);
        add(button_six);
        button_six.addActionListener(this);

        // Create the button for "7"
        button_seven = new JButton("7");
        button_seven.setBounds(50,210,50,30);
        add(button_seven);
        button_seven.addActionListener(this);

        // Create the button for "8"
        button_eight = new JButton("8");
        button_eight.setBounds(110,210,50,30);
        add(button_eight);
        button_eight.addActionListener(this);

        // Create the button for "9"
        button_nine = new JButton("9");
        button_nine.setBounds(170,210,50,30);
        add(button_nine);
        button_nine.addActionListener(this);

        // Decimal button at the bottom "."
        button_decimal = new JButton(".");
        button_decimal.setBounds(100,290,80,30);
        add(button_decimal);
        button_decimal.addActionListener(this);

        // ---------------------------------------------------------

        // Number buttons above

        // ---------------------------------------------------------

        // Function buttons below

        //-----------------------------------------------------------

        // Create the button for clearing the screen
        button_clear = new JButton("clear");
        button_clear.setBounds(230,110,100,30);
        add(button_clear);
        button_clear.addActionListener(this);

        // Create the button to calculate, the equals sign on a calculator
        button_calculate = new JButton("=");
        button_calculate.setBounds(230,260,100,30);
        add(button_calculate);
        button_calculate.addActionListener(this);

        // Create the button for addition
        button_add = new JButton("+");
        button_add.setBounds(230,160,100,30);
        add(button_add);
        button_add.addActionListener(this);

        // Create the button for subtraction
        button_subtract = new JButton("-");
        button_subtract.setBounds(230,210,100,30);
        add(button_subtract);
        button_subtract.addActionListener(this);

        // Create the button for multiplication
        button_multiply = new JButton("*");
        button_multiply.setBounds(50,250,50,30);
        add(button_multiply);
        button_multiply.addActionListener(this);

        // Create the button for division
        button_divide = new JButton("/");
        button_divide.setBounds(170,250,50,30);
        add(button_divide);
        button_divide.addActionListener(this);

        // Function to close the window
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent close)
            {
                System.out.println("Window Closed");
                close.getWindow().dispose();
            }
        });


    }

    // Now for all the actions
    // If each button is clicked the following ensues
    public void actionPerformed(ActionEvent clicked)
    {
        // Function for if button "zero" is clicked
        if(clicked.getSource() == button_zero)
        {
            string_three = result.getText();
            string_four = "0";
            string_five = string_three + string_four;
            result.setText(string_five);
        }

        // Function for if button "one" is clicked
        if(clicked.getSource() == button_one)
        {
            string_three = result.getText();
            string_four = "1";
            string_five = string_three + string_four;
            result.setText(string_five);
        }

        // Function for if button "two" is clicked
        if(clicked.getSource() == button_two)
        {
            string_three = result.getText();
            string_four = "2";
            string_five = string_three + string_four;
            result.setText(string_five);
        }

        // Function for if button "three" is clicked
        if(clicked.getSource() == button_three)
        {
            string_three = result.getText();
            string_four = "3";
            string_five = string_three + string_four;
            result.setText(string_five);
        }

        // Function for if button "four" is clicked
        if(clicked.getSource() == button_four)
        {
            string_three = result.getText();
            string_four = "4";
            string_five = string_three + string_four;
            result.setText(string_five);
        }

        // Function for if button "five" is clicked
        if(clicked.getSource() == button_five)
        {
            string_three = result.getText();
            string_four = "5";
            string_five = string_three + string_four;
            result.setText(string_five);
        }

        // Function for if button "six" is clicked
        if(clicked.getSource() == button_six)
        {
            string_three = result.getText();
            string_four = "6";
            string_five = string_three + string_four;
            result.setText(string_five);
        }

        // Function for if button "seven" is clicked
        if(clicked.getSource() == button_seven)
        {
            string_three = result.getText();
            string_four = "7";
            string_five = string_three + string_four;
            result.setText(string_five);
        }

        // Function for if button "eight" is clicked
        if(clicked.getSource() == button_eight)
        {
            string_three = result.getText();
            string_four = "8";
            string_five = string_three + string_four;
            result.setText(string_five);
        }

        // Function for if button "nine" is clicked
        if(clicked.getSource() == button_nine)
        {
            string_three = result.getText();
            string_four = "9";
            string_five = string_three + string_four;
            result.setText(string_five);
        }

        // Function to set the displayed item to be a decimal if clicked
        if(clicked.getSource() == button_decimal)
        {
            string_three = result.getText();
            string_four = ".";
            string_five = string_three + string_four;
            result.setText(string_five);
        }

        // Function for if button "+" is clicked
        if(clicked.getSource() == button_add)
        {
            string_one = result.getText();
            result.setText("");
            calculate = 1;
        }

        // Function for if button "-" is clicked
        if(clicked.getSource() == button_subtract)
        {
            string_one = result.getText();
            result.setText("");
            calculate = 2;
        }

        // Function for if button "*" is clicked
        if(clicked.getSource() == button_multiply)
        {
            string_one = result.getText();
            result.setText("");
            calculate = 3;
        }

        // Function for if button "/" is clicked
        if(clicked.getSource() == button_divide)
        {
            string_one = result.getText();
            result.setText("");
            calculate = 4;
        }

        // Function for if button "clear" is clicked
        if(clicked.getSource() == button_clear)
        {
            result.setText("");
        }

        // Create the calculations nested if statements for the four possibilities (add, subtract, multiply, divide)
        if(clicked.getSource() == button_calculate)
        {
            // Gets the text from the variable "string_two"
            string_two = result.getText();

            // Addition calculation activates if the variable "calculate" is set to "1" from above
            if(calculate == 1)
            {
                number = Double.parseDouble(string_one) + Double.parseDouble(string_two);
                result.setText(String.valueOf(number));
            }

            // Subtraction calculation activates if the variable "calculate" is set to "2" from above
            if(calculate == 2)
            {
                number = Double.parseDouble(string_one) - Double.parseDouble(string_two);
                result.setText(String.valueOf(number));
            }

            // Multiplication calculation activates if the variable "calculate" is set to "3" from above
            if(calculate == 3)
            {
                number = Double.parseDouble(string_one) * Double.parseDouble(string_two);
                result.setText(String.valueOf(number));
            }

            // Division calculation activates if the variable "calculate" is set to "4" from above
            if(calculate == 4)
            {
                number = Double.parseDouble(string_one) / Double.parseDouble(string_two);
                result.setText(String.valueOf(number));
            }
        }
    }

    // Actually run the main function written above
    public static void main(String[] args) {
        new Calculator_Main();
    }
}
// Close out the class