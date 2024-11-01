package com.ncsjava;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        byte age = 30;
        Date now = new Date();
	System.out.println(now);
        System.out.println(now.toString().split("O")[1]);
        System.out.println(" TODAY IS : "+now.toString().split("O")[0]);
    }
}