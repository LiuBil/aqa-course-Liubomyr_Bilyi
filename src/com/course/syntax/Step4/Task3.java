package com.course.syntax.Step4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть число number: ");
        int number = scanner.nextInt();
        int greatestDivisor = 1;
        for (int i=2; i<=number/2; i++){
            if ((number%i == 0 )&& (i != number)) {
                greatestDivisor = i;
            }
        }
        System.out.println("найбільший дільник = " + greatestDivisor);
    }
}
