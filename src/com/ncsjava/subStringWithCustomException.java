package com.ncsjava;

import java.util.Scanner;

public class subStringWithCustomException {
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
        try {
            checkSubString(fullString, subString, store);
        } catch(Exception e) {
            System.out.println("An Error Occured "+e);
        }
    }
    static void checkSubString(String fullString, String subString, boolean store) throws subStringException {
        if(store == true) {
            if (fullString.contains(subString)) {
                System.out.println(subString+" EXISTS IN "+fullString);
            } else {
                throw new subStringException(subString+" DOES NOT EXISTS IN "+fullString);
            }
        } else {
            if(fullString.toLowerCase().contains(subString)) {
                System.out.println(subString+" EXISTS IN "+fullString);
            } else {
                throw new subStringException(subString+" DOES NOT EXISTS IN "+fullString);
            }
        }
    }
}
