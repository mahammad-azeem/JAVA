package com.ncsjava;

import java.util.Arrays;
import java.util.Scanner;

public class hackerRank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] array1 = new String[3];
        int[] array2 = new int[3];
        for (int i = 0; i < 3; i++) {
            String a = input.next();
            array1[i] = a;
            int b = input.nextInt();
            array2[i] = b;
        }
        System.out.println("Array1 is"+ Arrays.toString(array1));
        System.out.println("Array2 is :"+ Arrays.toString(array2));
        for(int j=0;j<=2;j++) {
            if(array2[j] < 100) {
                System.out.printf("%-15s 0%d", array1[j], array2[j]);
                System.out.println();
            } else {
                System.out.printf("%-15s %d", array1[j], array2[j]);
                System.out.println();
            }
        }
    }
}
