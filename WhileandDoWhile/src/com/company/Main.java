package com.company;

public class Main {

    // Create a method called isEvenNumber that takes a parameter of type int
    // Its purpose is to determine if the argument passed to the method is
    // an even number or not.
    // return true if an even number, otherwise return false;

    public static void main(String[] args) {

        int count = 0;
        while (count != 9){
            System.out.println("The count is " + count );
            count++;
        }

        System.out.println( "The number is " + isEvenNumber(40));

//        int numero = 1;
//        int stopNumero = 20;
//        while( numero<=stopNumero){
//            numero++;
//            if (!isEvenNumber(numero)){
//                continue;
//            }
//            else
//                System.out.println("Number is even" + numero);
//        }

        // Modify the while code above
        // Make it also record the total number of even numbers it has found
        // and break once 5 are found
        // and at the end, display the total number of even numbers found

        int numero = 1;
        int stopNumero = 20;
        int evenNumberFound = 0;

        while( numero<=stopNumero){
            numero++;
            if (!isEvenNumber(numero)){
                continue;
            }
            System.out.println("Number is even " + numero);
//          My mistake was focusing on finding a solution to having a continues addition to even numbers
//          And trying to find a conditional to start before the loop begins
            evenNumberFound++;
            if (evenNumberFound >= 5) {

                break;
            }
        }
        System.out.print("Total even number found is " + evenNumberFound);

//        int newNumero = 5;
//        int newStop = 25;
//        for (int newCount = 0; newCount <= 5; newCount++){
//            newCount++;
//            while (newNumero <= newStop){
//                numero++;
//                if (!isEvenNumber(newNumero)){
//                    continue;
//                }
//                else
//                    System.out.println("Even number is " + newNumero);
//            }
//
//        }


//        while (newnumero <= newstop){
//            while (newcount <=5 ){
//                if(isEvenNumber(newnumero)){
//                    System.out.println("Number that is even is " + newnumero);
//                    System.out.println("Count is " + newcount);
//                    newnumero++;
//                    newcount++;
//                }
//                else
//                    continue;
//            }
//        }


    }

    public static boolean isEvenNumber (int number){
        if (number % 2 == 0) {
           return true;
        } else {
            return false;
        }
    }
}
