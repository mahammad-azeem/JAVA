package com.ncsjava;

import javafx.beans.binding.DoubleExpression;

import java.awt.*;
import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int principalAmount = Integer.parseInt(scanner.nextLine());
        System.out.print("Annual Interest Rate: ");
        double annualInterestRate = Double.parseDouble(scanner.nextLine());
        System.out.print("Period (in Years): ");
        int period = Integer.parseInt(scanner.nextLine());
        double monthlyInterestRate = annualInterestRate / 12;
        System.out.println("monthly interest rate: " + monthlyInterestRate);
        double a = (double) 1 + monthlyInterestRate;
        System.out.println("a: "+a);
        int n = period * 12;
        System.out.println("n: "+n);
        double b = Math.pow(a, n);
        double c = b;
        System.out.println("b: "+b);
        double numerator = principalAmount * monthlyInterestRate * b;
        System.out.println("numerator: " + numerator);

        double denominator = c - 1.0F;
        System.out.println("denominator: " + denominator);

        double result = principalAmount *
                (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, n)) / (Math.pow(1 + monthlyInterestRate, n) - 1);
        String mortage = currency.format(result);
       // System.out.println("Mortage: "+currency.format(result));
        System.out.println("Mortage: "+result);
        System.out.println("Mortage: "+mortage);

        double i = 1.2;
        double j = i - 1;
        System.out.println("j: "+j);
            }
}