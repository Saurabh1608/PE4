package com.stackroute.unittest.pe4;

import java.util.Scanner;

public class ReplaceElements {

    public static String replace(String s){


        String cn = s.replaceAll(String.valueOf('d'), "f");
        String modified = cn.replaceAll( String.valueOf('l'), "t");

        return (modified);
    }
}
