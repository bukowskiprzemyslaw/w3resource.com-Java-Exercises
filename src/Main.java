/*
5. Write a Java program that takes two numbers as input and display the product of two numbers.
Test Data:
Input first number: 25
Input second number: 5
Expected Output :
25 x 5 = 125
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input first number");
        int number1 = input.nextInt();

        System.out.println("Input second number");
        int number2 = input.nextInt();

        System.out.println("First number multiply by second number is equal");
        System.out.println(number1 * number2);

    }
}