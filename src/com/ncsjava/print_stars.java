package com.ncsjava;

import javafx.beans.binding.DoubleExpression;

import java.awt.*;
import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            int j = 4;
            int i = 0;
            String temp = "\s";
            String star = "*";
        for(j=4;j>=0;j--) {
            System.out.println(temp+star);
            temp += temp;
            star += star;

        }

            }
}