package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        number = (number + 45) /45;
        switch(number)
        {
            case 1:
            {
                System.out.println("The number is in range of 0 -> 44");
                break;
            }
            case 2:
            {
                System.out.println("The number is in range of 45 -> 89");
                break;
            }
            case 3:
            {
                System.out.println("The number is in range of 100 -> 134");
                break;
            }
            default:
            {
                System.out.println("The number is in other range");
                break;
            }
        }
    }
}
