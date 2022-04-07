// Garrick Morley
// ISYS 316 Section 1
// Instructor: Hira Herrington
// Programming Assignment #4
// Due Date: 03/17/2022
// Date Finished: 03/18/2022 (I was given the extension until Saturday the 19th at noon)
// File Name: RunBankTeller

// This program will create a dialog box for a bank teller that uses a loop structure and other I/O functions that
// reads data from a file called AccountDataIn.txt and also uses the sample account class that's given

// *Not a completed project, don't reference in future*

// Package name to move data between files
package com.example.morleygarrickassignment4;

// Javax imports needed for the program
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.swing.border.Border;
import javax.swing.*;
import java.awt.event.*;

// Regular Java imports needed for the program
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.awt.Color;
import java.lang.*;

// Create a numeric keypad to be used by the bank teller

// Use the calculator from the previous program I made to function as the numeric keypad
class Numeric_Keypad extends JFrame implements ActionListener
{
    // Use JPanel to create a new object called "pane" to work as the background for the numeric keypad
    JPanel back = new JPanel();

    // Use JLabel to set the title of the program
    JLabel lbl = new JLabel("Garrick's Bank Teller Program");

    // Set the text field to display a string
    JTextField result = new JTextField("");

    // Set the text field to display the accounts that have been read in
    JTextField accs = new JTextField("");

    // Create variables for the accounts
    String account_one;
    String account_two;
    String account_three;
    String account_four;
    String account_five;

    // Use the ArrayList function to create arrays to hold the values of each account
    ArrayList acc1 = new ArrayList(Arrays.asList(account_one));
    ArrayList acc2 = new ArrayList(Arrays.asList(account_two));
    ArrayList acc3 = new ArrayList(Arrays.asList(account_three));
    ArrayList acc4 = new ArrayList(Arrays.asList(account_four));
    ArrayList acc5 = new ArrayList(Arrays.asList(account_five));

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

    // Create the different transaction buttons using JButton
    JButton button_create;
    JButton button_lookup;
    JButton button_deposit;
    JButton button_withdraw;

    // File checking button
    JButton button_check;

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
    Numeric_Keypad()
    {
        // Set the size and visibility of the numeric keypad pop up window
        setLayout(null);
        setSize(700,400);
        setVisible(true);

        // Set the bounds and color of the background
        back.setBounds(50, 50, 700, 400);
        back.setBackground(Color.white);
        back.setBorder(border);

        // Set the bounds for the label
        lbl.setBounds(50,0,200,20);
        add(lbl);

        // Set the bounds for the result
        result.setBounds(50, 50, 250, 50);
        add(result);

        // Set the bounds for the account display
        accs.setBounds(400, 10, 250, 90);
        add(accs);

        // ---------------------------------------------------------
        // Number buttons below
        // ---------------------------------------------------------

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

        // ----------------------------------------------------------

        // Function buttons above

        // ----------------------------------------------------------

        // Transaction buttons below

        // ----------------------------------------------------------

        // For some reason you have to run the mouse over their location for these four buttons to appear

        // Create the button for "Create"
        button_create = new JButton("Create");
        button_create.setBounds(400,110,100,30);
        add(button_create);
        button_create.addActionListener(this);

        // Create the button for "Lookup"
        button_lookup = new JButton("Lookup");
        button_lookup.setBounds(400,160,100,30);
        add(button_lookup);
        button_lookup.addActionListener(this);

        // Create the button for "Deposit"
        button_deposit = new JButton("Deposit");
        button_deposit.setBounds(400,210,100,30);
        add(button_deposit);
        button_deposit.addActionListener(this);

        // Create the button for "Withdraw"
        button_withdraw = new JButton("Withdraw");
        button_withdraw.setBounds(400,260,100,30);
        add(button_withdraw);
        button_withdraw.addActionListener(this);

        // Create the button to check the directory
        button_check = new JButton("Check Files");
        button_check.setBounds(400,310,100,30);
        add(button_check);
        button_check.addActionListener(this);

        // ----------------------------------------------------------

        // Transaction buttons above

        //-----------------------------------------------------------

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
    public void actionPerformed(ActionEvent clicked) {

        // ----------------------------------------------------------

        // If numeric buttons are clicked (below)

        //-----------------------------------------------------------

        // Function for if button "zero" is clicked
        if (clicked.getSource() == button_zero) {
            string_three = result.getText();
            string_four = "0";
            string_five = string_three + string_four;
            result.setText(string_five);
        }

        // Function for if button "one" is clicked
        if (clicked.getSource() == button_one) {
            string_three = result.getText();
            string_four = "1";
            string_five = string_three + string_four;
            result.setText(string_five);
        }

        // Function for if button "two" is clicked
        if (clicked.getSource() == button_two) {
            string_three = result.getText();
            string_four = "2";
            string_five = string_three + string_four;
            result.setText(string_five);
        }

        // Function for if button "three" is clicked
        if (clicked.getSource() == button_three) {
            string_three = result.getText();
            string_four = "3";
            string_five = string_three + string_four;
            result.setText(string_five);
        }

        // Function for if button "four" is clicked
        if (clicked.getSource() == button_four) {
            string_three = result.getText();
            string_four = "4";
            string_five = string_three + string_four;
            result.setText(string_five);
        }

        // Function for if button "five" is clicked
        if (clicked.getSource() == button_five) {
            string_three = result.getText();
            string_four = "5";
            string_five = string_three + string_four;
            result.setText(string_five);
        }

        // Function for if button "six" is clicked
        if (clicked.getSource() == button_six) {
            string_three = result.getText();
            string_four = "6";
            string_five = string_three + string_four;
            result.setText(string_five);
        }

        // Function for if button "seven" is clicked
        if (clicked.getSource() == button_seven) {
            string_three = result.getText();
            string_four = "7";
            string_five = string_three + string_four;
            result.setText(string_five);
        }

        // Function for if button "eight" is clicked
        if (clicked.getSource() == button_eight) {
            string_three = result.getText();
            string_four = "8";
            string_five = string_three + string_four;
            result.setText(string_five);
        }

        // Function for if button "nine" is clicked
        if (clicked.getSource() == button_nine) {
            string_three = result.getText();
            string_four = "9";
            string_five = string_three + string_four;
            result.setText(string_five);
        }

        // Function for if "." is clicked
        if (clicked.getSource() == button_decimal) {
            string_three = result.getText();
            string_four = ".";
            string_five = string_three + string_four;
            result.setText(string_five);
        }

        // ----------------------------------------------------------

        // If numeric buttons are clicked (above)

        // ----------------------------------------------------------

        // If function buttons are clicked (below)

        // ----------------------------------------------------------

        // Function for if button "+" is clicked
        if (clicked.getSource() == button_add) {
            string_one = result.getText();
            result.setText("");
            calculate = 1;
        }

        // Function for if button "-" is clicked
        if (clicked.getSource() == button_subtract) {
            string_one = result.getText();
            result.setText("");
            calculate = 2;
        }

        // Function for if button "*" is clicked
        if (clicked.getSource() == button_multiply) {
            string_one = result.getText();
            result.setText("");
            calculate = 3;
        }

        // Function for if button "/" is clicked
        if (clicked.getSource() == button_divide) {
            string_one = result.getText();
            result.setText("");
            calculate = 4;
        }

        // Function for if button "clear" is clicked
        if (clicked.getSource() == button_clear) {
            result.setText("");
        }

        // ----------------------------------------------------------

        // If function buttons are clicked (above)

        // ----------------------------------------------------------

        // If transaction buttons are clicked (below)

        // ----------------------------------------------------------

        // Function to check directory to make sure file is in correct spot
        if (clicked.getSource() == button_check)
        {
            File file = new File(".");
            for(String fileNames : file.list()) System.out.println(fileNames);
        }

        // WHERE I'M AT NOW !!!!!!!!!!!!!!!!!!!!!!!!
        // How to use an ArrayList to hold all the items???

        // Read data in from file
        for (int i = 1; i < 100; i++)
        {
            if(clicked.getSource() == button_create)
            {
                try {
                    File info = new File("AccountsDataIn.txt");
                    Scanner myReader = new Scanner(info);
                    while (myReader.hasNextLine()) {
                        String data = myReader.nextLine();
                        account_one = data;
                        String[] values = data.split("\\s*,\\s*");
                        accs.setText(values[i]);
                        i++;
                        // Would also use "setID" from Account class here
                    }
                    myReader.close();
                } catch (FileNotFoundException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }
            }

            // If "Lookup" button gets clicked
            else if(clicked.getSource() == button_lookup)
            {
                // Would use getID from Account class here
            }

            // If "Deposit" button gets clicked
            else if(clicked.getSource() == button_deposit)
            {
                // Would use setBalance from Account class here
            }

            // If "Withdraw" button gets clicked
            else if(clicked.getSource() == button_withdraw)
            {
                // Would use getBalance from Account class here
            }

            // Function to close the window again
            addWindowListener(new WindowAdapter()
            {
                public void windowClosing(WindowEvent close)
                {
                    System.out.println("Window Closed");
                    close.getWindow().dispose();
                }
            });

        }

                // ----------------------------------------------------------

                // If transaction buttons are clicked (above)

                // ----------------------------------------------------------
                // ----------------------------------------------------------

                // If math buttons are clicked (below)

                // ----------------------------------------------------------

        // Create the calculations nested if statements for the four possibilities (add, subtract, multiply, divide)
                if (clicked.getSource() == button_calculate) {
                    // Gets the text from the variable "string_two"
                    string_two = result.getText();

                    // Addition calculation activates if the variable "calculate" is set to "1" from above
                    if (calculate == 1) {
                        number = Double.parseDouble(string_one) + Double.parseDouble(string_two);
                        result.setText(String.valueOf(number));
                    }

                    // Subtraction calculation activates if the variable "calculate" is set to "2" from above
                    if (calculate == 2) {
                        number = Double.parseDouble(string_one) - Double.parseDouble(string_two);
                        result.setText(String.valueOf(number));
                    }

                    // Multiplication calculation activates if the variable "calculate" is set to "3" from above
                    if (calculate == 3) {
                        number = Double.parseDouble(string_one) * Double.parseDouble(string_two);
                        result.setText(String.valueOf(number));
                    }

                    // Division calculation activates if the variable "calculate" is set to "4" from above
                    if (calculate == 4) {
                        number = Double.parseDouble(string_one) / Double.parseDouble(string_two);
                        result.setText(String.valueOf(number));
                    }
                }
            }

            public static void main (String[]args){new Numeric_Keypad();}
        }