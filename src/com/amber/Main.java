package com.amber;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please Choose a Number: ");
        int num = scan.nextInt();

        if(num % 5 == 0) System.out.println("fizz");
        if(num % 3 == 0) System.out.println("buzz");


        //! WHILE
        Scanner scanText = new Scanner(System.in);
        String input = "";
        while(!input.equals("quit")){
            System.out.print("Input: ");
            input = scanText.next().toLowerCase();
            System.out.println(input);
        }

    }
}


