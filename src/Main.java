/*
12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input first number: ");
        int number1 = in.nextInt();

        System.out.print("Input second number: ");
        int number2 = in.nextInt();

        System.out.print("Input third number: ");
        int number3 = in.nextInt();

        System.out.print("Input fourth number: ");
        int number4 = in.nextInt();

        System.out.print("Enter fifth number: ");
        int number5 = in.nextInt();


        System.out.println("Average of five numbers is: " +
                (number1 + number2 + number3 + number4 + number5) / 5);
    };

}
