package com.knoldus;

import java.util.Scanner;
import java.util.function.Function;

public class FindEvenNo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");

        long input = sc.nextLong();

        Function<Long, Long> evenNumber = num -> num + 2 - (num % 2);

        long evenNo = evenNumber.apply(input);
        System.out.println("Entered value " + input + "\nNext even: " +evenNo);
    }
}
