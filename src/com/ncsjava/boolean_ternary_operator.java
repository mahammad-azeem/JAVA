package com.ncsjava;

import javafx.beans.binding.DoubleExpression;

import java.awt.*;
import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            int income = 110_000;
            String passengerType = income > 100_000 ? "Business Class" : "Economy Class";
            System.out.println(passengerType);
            boolean isEligible = true;
            if (income < 120_000) {
                System.out.println("Not Eligible");
            }
            }
}