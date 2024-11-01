package com.ncsjava;

import java.awt.*;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        String text = "  Hello world  "+" -- ";
        if(text.length() == 8) {
            System.out.println("The String "+text+" Is more then 8 characters");
            System.out.println(text.replace("--", "!!"));
        } else {
            System.out.println("The String Seems Ok!!");
            System.out.println(text);
            System.out.println(text.trim());
        }
    }
}