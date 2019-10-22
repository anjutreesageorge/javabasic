package com.busyqa.coursework.wk1_answer;

public class CheckOddEven {
    public static void main(String[] args) {  // Program entry point
        int number = 50;       // Set the value of "number" here!
        System.out.println("The number is " + number);
        if ( number % 2 == 0) {
            System.out.println( number +" is EVEN");
        } else {
            System.out.println(  number +" is ODD" );
        }
        System.out.println( "DONE" );
    }
}
