package BasicPrograms;

import java.io.*;
import java.util.Scanner;

public class QuotientAndRemainder {


    public static void main(String[] args) {
        System.out.println("Enter the num1");
        System.out.println("Enter the num2");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int quotient = 0, remainder = 0;

        quotient = num1 / num2;
        remainder = num1 % num2;

        System.out.println("Quotient when " + num1 + "/" + num2 + " is: " + quotient);
        System.out.println("Remainder when " + num1 + " is divided by " + num2 + " is: " + remainder);
    }
}