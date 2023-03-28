/*
6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input first number");
        int number1 = input.nextInt();

        System.out.println("Input second number");
        int number2 = input.nextInt();

        System.out.println("First number + second number");
        System.out.println("= " + (number1 + number2));

        System.out.println("First number - second number");
        System.out.println("= " + (number1 - number2));

        System.out.println("First number * second number");
        System.out.println("= " + (number1 * number2));

        System.out.println("First number / second number");
        System.out.println("= " + (number1 / number2));

        System.out.println("First number mod second number");
        System.out.println("= " + (number1 % number2));

    }
}