package com.stackroute.unittest.pe4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordRegex {


        public boolean presenceOfString(String input) {

            boolean res = input.matches("(.*)Harry(.*)");
            System.out.println(res);
            return res;
        }
    }


