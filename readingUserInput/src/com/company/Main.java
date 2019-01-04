package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Initiating the scanner for the scany scan
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name pls");
        String name = scanner.nextLine();

        System.out.println("Enter your year of birth pls");
        boolean hasNextInt = scanner.hasNextInt();

        if(hasNextInt){
            int yearofBirth = scanner.nextInt();
            int currentAge = 2019 - yearofBirth;
            System.out.println("Your name is " + name + ". "+ "Your age is " + currentAge);
        } else{
            System.out.println(name + " did not enter the year in a number format. No me gusta");
        }
// Do not need these lines, can keep the scanner active???
//        scanner.close();
//        Scanner nextscanner = new Scanner(System.in);

        System.out.println("year of birth pls ");
        int yearofBirth = scanner.nextInt();
        //Handle the next line character (enter key)
        scanner.nextLine();

        System.out.println("Enter you name pls");
        name =  scanner.nextLine();

        int currentAge = 2019 - yearofBirth;

        if (currentAge >= 0 && currentAge <= 100){
            System.out.println("Name: " + name + ". " + "Age: " + currentAge);
        }else {
            System.out.println("Invalid years");
        }


        scanner.close();

        }
}
