package com.amber;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Please Choose a Number: ");
//        int num = scan.nextInt();
//
//        if(num % 5 == 0) System.out.println("fizz");
//        if(num % 3 == 0) System.out.println("buzz");
//
//
//        //! WHILE
//        Scanner scanText = new Scanner(System.in);
//        String input = "";
//        while(!input.equals("quit")){
//            System.out.print("Input: ");
//            input = scanText.next().toLowerCase();
//            // goes to the top of the loop
//            if(input.equals("pass")) continue;
//            // breaks out without echo
//            if(input.equals("quit")) break;
//
//            System.out.println(input);
//        }
//
//        //! FOR EACH
//        String[] fruits = { "apple", "mango", "orange"};
//        for (String f : fruits) System.out.println(f);
//
//
//


        //        MORTGAGE CALCULATOR
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner principalIn = new Scanner(System.in);
        double principalSave;
        while(true) {
            System.out.print("Principal Borrowing Amount; 1K -1M: " );
            principalSave = principalIn.nextDouble();
            if(principalSave >= 1000 && principalSave < 1_000_000) break;
            System.out.println("Enter a value between 1K and 1M");
        }



        Scanner annualIn = new Scanner(System.in);
        double monthlyInterest;
        while(true){
            System.out.print("Annual Interest Rate: ");
            monthlyInterest = (annualIn.nextDouble() / PERCENT) / MONTHS_IN_YEAR;
            if(monthlyInterest >= 0 && monthlyInterest < 10) break;
            System.out.println("Please enter a number between .1-10");
        }


        Scanner years = new Scanner(System.in);
        int loanMonths;
        while(true){
            System.out.print("How many year would you like to finance: ");
            loanMonths = years.nextInt();
            if( loanMonths >= 10 && loanMonths <= 50) break;
            System.out.println("Please choose a number between 10-50");
        }

//        double mortgage = principal
//                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
//                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);


        double top = (monthlyInterest * Math.pow(1 + monthlyInterest, loanMonths));
        double bottom = (Math.pow(1 + monthlyInterest, loanMonths) - 1);
        double divided = top / bottom;
        double multiply = principalSave * divided;

        String mortgage = NumberFormat.getCurrencyInstance().format(multiply);
        System.out.println("Monthly payment amount: " + mortgage);


    }
}


