package com.course.syntax.Step2;

public class Task2 {
    public static void main(String[] args) {
int testNum = 5;
        System.out.println("testNum = "+ testNum);

int afterIncrement = testNum++;
        System.out.println("AfterIncrement = " + afterIncrement);
        System.out.println("testNum = " + testNum);
        int previousIncrement = ++testNum;
        System.out.println("PreviousIncrement = " + previousIncrement);
        System.out.println("testNum = " + testNum);
int afterDecrement = testNum--;
        System.out.println("AfterDecrement = " + afterDecrement);
        System.out.println("testNum = " + testNum);
        int previousDecrement = --testNum;
        System.out.println("PreviousDecrement = " + previousDecrement);
        System.out.println("testNum = " + testNum);

    }
}
