// Garrick Morley
// ISYS 316 Section 1
// Instructor: Hira Herrington
// Programming Assignment #4
// Due Date: 03/17/2022
// Date Finished: 03/16/2022 (I was given the extension until Saturday the 19th at noon)
// File Name: RunBankTeller
// This program will create a dialog box for a bank teller that uses a loop structure and other I/O functions that
// reads data from a file called AccountDataIn.txt and also uses the sample account class that's given

// Read the "README" file to get a better understanding of where I'm at

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
}
