package com.stackroute.unittest.pe4;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {
    public static String word_sort(String str)
    {
        String [] arr =str.split("[ \n]");
        Arrays.sort(arr);
        String res="";
        for(int i=0;i<arr.length;i++)
        {
            res+=arr[i];
            if(i==arr.length-1)
                break;
            res+=" ";
        }
        return res;
    }


}