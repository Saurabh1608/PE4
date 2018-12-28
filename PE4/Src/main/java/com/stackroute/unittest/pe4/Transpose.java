package com.stackroute.unittest.pe4;



import java.lang.*;
        import java.io.*;
        import java.util.*;

// Class of ReverseString
public class Transpose {



    public static String reserveWords(String str){
        StringBuilder bf = new StringBuilder();
        bf.append(str); // appending the string to the buffer
        bf = bf.reverse(); //to reverse the string buffer
        str = bf.toString(); //to convert the buffer object to String

        String arrStr[] = str.split(" "); //to split the string with a  spcae " "
        int i;
        String resStr = "";
        for (i=arrStr.length-1; i>=0; i--){ //to loop through the array of string
            resStr = resStr + arrStr[i] + " ";
        }
        return resStr.trim();
    }
    }
