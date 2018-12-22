package com.company;

public class Main {
    // Create a new switch statement using char instead of int
    // create a new char variable
    // create a switch statement testing for
    // A, B, C, D, or E
    // display a message if any of these are found and then break
    // Add a default which displays a message saying not found

    public static void main(String[] args) {
	// write your code here
        char character = 'b';
        switch (character){
            case 'A':
                System.out.println("Char is an A");
                break;
            case 'B':
                System.out.println("Char is a B");
                break;
            case 'C':
                System.out.println("Char was a C");
                break;
            case 'D':
                System.out.println("Char was a D");
                break;
            case 'E':
                System.out.println("Char was a E");
                break;
            case 'a': case 'b': case 'c': case 'd':
                System.out.println("char was either a,b,c,d, or e");
                break;
            default:
                System.out.println("Char was neither");
                break;
        }

        String month = "MARCH";
        switch(month.toLowerCase()){
            case "january":
                System.out.println("The first month");
                break;
            case "march":
                System.out.println("Bday month");
                break;
        }
    }
}
