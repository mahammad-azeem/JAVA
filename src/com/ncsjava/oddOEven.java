package com.ncsjava;

import java.util.Scanner;

public class oddOrEven {
    public static void main(String[] args) {
        int i = 0;
        System.out.println(oddOrEven(i));
    }
    static String oddOrEven(int a) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the First number :");
        a = input.nextInt();
        if(a % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
}
