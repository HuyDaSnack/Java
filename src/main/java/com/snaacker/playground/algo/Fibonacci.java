package com.snaacker.playground.algo;

import java.util.Scanner;

/**
 * Created by quanghuy on 9/9/17.
 */
public class Fibonacci {

    public static void main(String args[]){

        System.out.println("Enter number upto which Fibonacci series to print: ");
        int number = new Scanner(System.in).nextInt();

        System.out.println("Fibonacci series upto " + number + "numbers:");
        for (int i = 1; i <= number; i++){
            System.out.println(fibonacci2(i) + " ");
        }

    }

    private static int fibonacci2(int number) {
        if (number == 1 || number == 2){
            return 1;
        }

        int fibo1 = 1, fibo2 = 1, fibonacci = 1;

        for (int i = 3; i <= number; i++){
            fibonacci = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibonacci;
        }

        return fibonacci;
    }

    private static int fibonacci(int number) {
        if (number == 1 || number ==2){
            return 1;
        }

        return fibonacci(number-1) + fibonacci(number - 2);
    }
}
