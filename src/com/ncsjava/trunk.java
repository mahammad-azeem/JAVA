package com.ncsjava;

import java.util.Scanner;

public class trunk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age : ");
        int age = sc.nextInt();
        try {
            checkAge(age);
        } catch(Exception e) {
            System.out.println("A problem occured :"+e);
        }

    }
    static void checkAge(int age)throws AgeException {
        if(age < 18) {
            throw new AgeException("You Cannot sign up ");
        } else {
            System.out.println("You are now Signed up");
        }
    }
}
