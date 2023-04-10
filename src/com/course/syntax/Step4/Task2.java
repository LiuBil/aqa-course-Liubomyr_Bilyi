package com.course.syntax.Step4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть дійсне число number:");
        int number = scanner.nextInt();
        int factorial = 1;

        for (int i=1; i<=number; i++){
            factorial= factorial*i;
        }
        System.out.println(factorial);



    }
}
