package com.course.syntax.Step3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть ціле число n:");
        int n = scanner.nextInt();
        if (n<10){
            System.out.println("1st message");
        } else if (n>10) {
            System.out.println("2nd message");
        }
        else System.out.println("3rd message");
    }
}
