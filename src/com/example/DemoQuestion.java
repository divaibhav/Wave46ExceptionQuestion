/*
Write a program that meets the following requirements:
■ Creates an array with 100 randomly chosen integers.
■ Prompts the user to enter the index of the array, then displays the corresponding
element value. If the specified index is out of bounds, display the
message Out of Bounds.
 */
package com.example;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class DemoQuestion {
    public static void main(String[] args) {
        Random random = new Random();
        Integer[] randomNumbers = new Integer[100];
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(5000);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the value of index");

        try {
            int index = scanner.nextInt();
            System.out.println("Value on given index = " + randomNumbers[index]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Out of Bounds");
        }catch (InputMismatchException e){
            System.out.println("enter integer value only");
        }
    }
}
