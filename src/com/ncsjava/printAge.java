package com.ncsjava;

import java.util.Scanner;

public class printAge {
    public static void main(String[] args) {
        Scanner print = new Scanner(System.in);
        ArtificialCode output = new ArtificialCode();
        System.out.println("Enter your Age : ");
        int age = print.nextInt();
        ArtificialCode.SimpleWorld(age);
    }
}