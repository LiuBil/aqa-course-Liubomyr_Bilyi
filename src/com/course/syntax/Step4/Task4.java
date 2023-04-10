package com.course.syntax.Step4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
        int age = 0;
        boolean correctAge = false;
        while (!correctAge){
            System.out.println("Введіть вік: ");
            age = scanner.nextInt();
            if ((age <= 0) || (age > 140)) {
                System.out.println("Значення віку виходить за межі доступного діапазону!");
            }
            else{
                correctAge = true;
                System.out.println("Ура, ваш вік - " + age);

            }
        }

    }
}


