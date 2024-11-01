package com.ncsjava;

import javafx.beans.binding.DoubleExpression;

import java.awt.*;
import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature: ");
        int temperature = input.nextInt();
        boolean isNormal = temperature > 20 && temperature < 40;
        if(isNormal) {
            System.out.println("Its Normal Temperature today");
        } else {
            System.out.println("Temperature is Not Normal today");
        }
            }
}