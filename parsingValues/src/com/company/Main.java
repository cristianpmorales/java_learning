package com.company;

public class Main {

    public static void main(String[] args) {
        //wrapper class
        //Integer
        String numberToString = "248";
        int number = Integer.parseInt(numberToString);
        System.out.println("String: " + numberToString);
        System.out.println("Number: " + number);

        String doubleString = "2103.22";
        double doubleNumber = Double.parseDouble(doubleString);
//        number = Integer.parseInt(doubleString);
//        System.out.println("Integer? " + number);
        System.out.println("Double String: " + doubleString);
        System.out.println("Double Number: " + doubleNumber);

    }
}
