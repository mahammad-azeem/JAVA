package com.ncsjava;
import java.util.Scanner;

public class FirstFunction {
    public static void main(String[] args) {
        int number1 = 0;
        int number2 = 0;

        sumOf(number1, number2);
        }

     static int sumOf(int a, int b) {
         Scanner input = new Scanner(System.in);
         System.out.println("Enter first number :");
         a = input.nextInt();
         System.out.println("Enter Second number :");
         b = input.nextInt();
         int sum = a + b;
         System.out.println("The sum is : "+sum);
         return sum;
    }
}
