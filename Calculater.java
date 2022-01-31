package com.company;

import java.util.Scanner;

public class Calculater {
    public static void main(String[] args) {

        float number_1, number_2;
        System.out.println("Enter your first number");
        Scanner scan = new Scanner(System.in);
        number_1 = scan.nextFloat();
        System.out.println("Enter your second number");
        Scanner scan2 = new Scanner(System.in);
        number_2 = scan.nextFloat();
        System.out.print("You have Entered ");
        System.out.print(number_1);
        System.out.print(" and ");
        System.out.println(number_2);
        String prompt = "Enter 0 for addition, 1 for substruction, " +
                "2 for multiplication and 3 for devision";
        System.out.println(prompt);

        int input = scan.nextInt();
        switch (input) {
            case 0:
                System.out.println("Adding these numbers");
                System.out.println("The result is: ");
                System.out.println(number_1 + number_2);
                break;
            case 1:
                System.out.println("Substracting these numbers");
                System.out.println("The result is: ");
                System.out.println(number_1 - number_2);
                break;
            case 2:
                System.out.println("Multiplying these numbers");
                System.out.println("The result is: ");
                System.out.println(number_1 * number_2);
                break;
            case 3:
                System.out.println("Deviding these numbers");
                System.out.println("The result is: ");
                System.out.println(number_1 / number_2);
                break;

            default:
                System.out.println("Invalid input");
        }
        }
    }
