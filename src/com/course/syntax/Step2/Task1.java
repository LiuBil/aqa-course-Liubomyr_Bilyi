package com.course.syntax.Step2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть сторону трикутника a:");
        double a = scanner.nextDouble();
        System.out.println("Введіть сторону трикутника b:");
        double b = scanner.nextDouble();
        System.out.println("Введіть сторону трикутника c:");
        double c = scanner.nextDouble();
        if ((a+b)>c && (a+c)>b && (b+c)>a) {
            double p = (a + b + c) / 2;
            double triangleArea = Math.sqrt(p * (p - a) * (p - b) * (p - c));

            System.out.println("Площа трикутника = " + triangleArea);
        }
        else System.out.println("трикутник з введеними сторонами не існує");
    }
}
