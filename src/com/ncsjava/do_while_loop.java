package com.ncsjava;

import javafx.beans.binding.DoubleExpression;

import java.awt.*;
import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String input = "";
        do {
            System.out.print("Input : ");
            Scanner validate = new Scanner(System.in);
            input = validate.nextLine().toLowerCase();
        } while(!input.equals("quit"));

            }
}