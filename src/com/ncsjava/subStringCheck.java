package com.ncsjava;

import java.util.Scanner;

public class subStringCheck {
    public static void main(String[] args) {
        boolean store = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String fullString = sc.nextLine();
        System.out.println("Enter the Sub String : ");
        String subString = sc.nextLine();
        while(true) {
            System.out.print("--Ignore-CaseSensitive ? Enter [y] or [N] :");
            String caseSensitiveCheck = sc.nextLine();
            if(caseSensitiveCheck.toLowerCase().trim().equals("y")) {
                break;
            } else if(caseSensitiveCheck.toLowerCase().trim().equals("n")) {
                store=false;
                break;
            } else {
                continue;
            }
        }
        checkSubString(fullString, subString, store);
    }
    static void checkSubString(String fullString, String subString, boolean store) {
        if(store == true) {
           if (fullString.contains(subString)) {
               System.out.println(subString+" EXISTS IN "+fullString);
           } else {
               System.out.println(subString+" DOES NOT EXISTS IN "+fullString);
           }
       } else {
               if(fullString.toLowerCase().contains(subString)) {
                   System.out.println(subString+" EXISTS IN "+fullString);
               } else {
                   System.out.println(subString+" DOES NOT EXISTS IN "+fullString);
           }
       }
    }
}
