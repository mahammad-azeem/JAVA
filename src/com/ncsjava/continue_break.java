package com.ncsjava;

import javafx.beans.binding.DoubleExpression;

import java.awt.*;
import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner validate = new Scanner(System.in);
        String input = "";
        while(!input.equals("quit")) {
            System.out.print("Input : ");
            input = validate.nextLine().toLowerCase();
            if(input.equals("pass"))
                continue;
            if(input.equals("quit"))
                break;
            System.out.println(input);
        }

            }
}