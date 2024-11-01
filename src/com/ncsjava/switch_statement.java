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
            System.out.print("Enter the role :");
            String role = type.nextLine().trim();
            switch (role) {
                case "developer":
                    System.out.println("You are a "+role);
                    break;

                case "admin":
                    System.out.println("You are a "+role);
                    break;

                default:
                    System.out.println("You are a Guest");
                }
            }
}