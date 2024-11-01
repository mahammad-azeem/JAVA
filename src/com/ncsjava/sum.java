package com.ncsjava;

import java.util.Scanner;

public class sum {
    public static void main(String[] args){
        int a = 0;
        int b = 0;
        System.out.println("The sum is : "+sumOf2Numbers(a,b));
    }
    static int sumOf2Numbers(int a, int b) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the First Number : ");
        a = input.nextInt();
        System.out.println("Enter the Second Number :");
        b = input.nextInt();
        int sum = a + b;
        return sum;
    }
}
