package com.company;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_7 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\b[a]\\w+[a]\\b");
        Matcher matcher = pattern.matcher("ahs");
        matcher.find();
        String match = matcher.group(0);
        if (match != null){
            System.out.println("TRUE");
        } else if (match == null) {
            System.out.println("False");
        }

    }

    }
