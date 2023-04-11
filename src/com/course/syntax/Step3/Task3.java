package com.course.syntax.Step3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть число типу float:");
        float a = scanner.nextFloat();
        if (((a%2==0) && (a>10)) || (a==15)){
            System.out.println("1st message");
        }
        else System.out.println("2nd message");
    }
}
