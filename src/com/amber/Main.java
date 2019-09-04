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
            System.out.println("Principal Borrowing Amount; 1K -1M: " );
            principalSave = principalIn.nextDouble();
            if(principalSave >= 1000 && principalSave < 1_000_000) break;
            System.out.println("Enter a value between 1K and 1M");
        }



        Scanner annualIn = new Scanner(System.in);
        double annualSave;
        while(true){
            System.out.println("Annual Interest Rate: ");
            annualSave = (annualIn.nextDouble() / PERCENT) / MONTHS_IN_YEAR;
            if(annualSave >= 0 && annualSave < 10) break;
            System.out.println("Please enter a number between .1-10");
        }


        Scanner periodIn = new Scanner(System.in);
        int periodSave;
        while(true){
            System.out.println("How many year would you like to finance: ");
            periodSave = periodIn.nextInt();
            if( periodSave >= 10 && periodSave <= 50) break;
            System.out.println("Please choose a number between 10-50");
        }


        double top = annualSave * Math.pow((1 + annualSave), periodSave);
        System.out.println("top: " + top);
        double bottom = Math.pow((1 + annualSave), periodSave) - 1;
        System.out.println("bottom : " + bottom);
        double divided = top / bottom;
        System.out.println("divided: " + divided);
        double multiply = principalSave * divided;
        System.out.println("multiple : " + multiply);

        String mortgage = NumberFormat.getCurrencyInstance().format(multiply);
        System.out.println(mortgage);


    }
}


