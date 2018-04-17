package com.example.service_zuul;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        String[] s = {"1","2","ff"};
        for(int i=0;i<s.length;i++){
            if(!isNumber(s[i])){
                s[i]="0";
            }
            System.out.println(s[i]);
        }
    }
    public static boolean isNumber(String str) {
        Pattern regex = Pattern.compile("-?[0-9]+\\.?[0-9]*");
        Matcher matcher = regex.matcher(str);
        boolean isMatched = matcher.matches();
        return isMatched;
    }
}
