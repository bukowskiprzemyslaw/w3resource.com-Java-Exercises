/*
15. Write a Java program to swap two variables.
*/

public class Main {
    public static void main(String[] args) {

        int a, b, temporary;

        a = 10;
        b = 5;

        System.out.println("Before swapping : a,b = "+a+", "+ + b);

        temporary = a;

        a = b;
        b = temporary;

        System.out.println("After swapping : a,b = "+a+", "+ + b);

    }
}
