package com.stackroute.unittest.pe4;

import java.util.Scanner;

public class CountOccurrence {

    public static int countOccurrence(String s,char c){


        int cn = s.length() - s.replaceAll(String.valueOf(c), "").length();
       System.out.println(cn);
        return (cn);
   }
}