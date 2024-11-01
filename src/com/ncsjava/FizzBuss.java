package com.ncsjava;

import javafx.beans.binding.DoubleExpression;

import java.awt.*;
import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner type = new Scanner(System.in);
            System.out.print("Enter the Number :");
            int number = type.nextInt();
            if(number % 3 == 0 && number % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if(number % 5 == 0) {
                System.out.println("Buzz");
            } else if(number % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(number);
            }
            }
}