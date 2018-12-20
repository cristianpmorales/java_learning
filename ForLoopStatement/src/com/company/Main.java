package com.company;

public class Main {
    // using the for statement, call the calculateInterest method with
    // the amount of 10000 with an interestRate of 2,3,4,5,6,7, and 8
    // and print the results to the console window.

    // Create a for statement using any range of numbers
    // Determine if the number is a prime number using the isPrime method
    // if it is a prime number, print it out AND increment a count of the
    // number of prime numbers found
    // if that count is 3 exit the for loop
    // hint:  Use the break; statement to exit
    public static void main(String[] args) {
	    for (int i = 2; i < 9; i++){
//	        System.out.println(i);
	        calculateInterest(10000,i);
        }

        // How would you modify the for loop above to do the same thing as
        // shown but to start from 8% and work back to 2%

        for (int i = 8; i > 1 ; i--){
            calculateInterest(10000,i);
        }

        // Create a for statement using any range of numbers
        // Determine if the number is a prime number using the isPrime method
        // if it is a prime number, print it out AND increment a count of the
        // number of prime numbers found
        // if that count is 3 exit the for loop
        // hint:  Use the break; statement to exit
        int count = 0;
        for (int i = 10; i <= 50; i++){
            if (isPrime(i)){
                count++;
                System.out.println(i + " is prime" );
                if(count == 3){
                    System.out.println("Exiting loop");
                    break;
                }
            }
        }

//        Create a for statement using a range of numbers from 1 to 1000 inclusive.
//        Sum all the numbers that can be divided with both 3 and also with 5.
//        For those numbers that met the above conditions, print out the number.
//        break out of the loop once you find 5 numbers that met the above conditions.
//        After breaking out of the loop print the sum of the numbers that met the above conditions.
//        Note: Type all code in main method
        int totalSum = 0;
        int newCount = 0;
        for (int i = 1; i <=1000; i++){
            if ( (i % 3 == 0) && (i % 5 ==0 )){
                totalSum += i;
                newCount++;
                System.out.println("Found prime = " + i);
                if (newCount == 5){
                    System.out.println( "prime number total sum is " + totalSum);
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int n ){
        if (n == 1){
            return false;
        }
        for (int i = 2; i <= n/2; i++){
            if ( n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static int calculateInterest(double amount, double interestRate){

        double total = amount*(interestRate/100);
// When dealing with decimals it is important to remember to use double or else you will get 0 instead of decimal for interest
//        System.out.println(amount);
//        System.out.println(interestRate);
//        System.out.println(amount * (interestRate/100));
        System.out.println(  "Amount: " + amount + " at an interest rate of " + interestRate + " is " + total);
        return 1;
    }
}
