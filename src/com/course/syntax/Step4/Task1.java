package com.course.syntax.Step4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть дійсне число a:");
        int a = scanner.nextInt();
        if (a<0){
            System.out.println("Error! A negative number is entered in console");
        } else if (a>=0) {
            for (int i=0; i<=a; i++) {
                if (i % 3 == 0) {
                    System.out.println(i + " - The number is multiple to 3");
                } else if (i % 2 == 0) {
                    System.out.println(i + " - The number is even");
                }
                else {
                    System.out.println(i);
                }
            }
        }

    }
}
