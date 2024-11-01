package com.ncsjava;

import java.util.HashMap;

public class practice {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("India","Delhi");
        map.put("Karnataka","Bangalore");
       // map.remove("India");
        System.out.println(map);
        for(String i: map.keySet()) {
            System.out.printf("%-10s = %s %n",i,map.get(i));
        }

    }
}
